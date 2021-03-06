/**
 * Copyright 2015 Green Energy Corp.
 *
 * Licensed to Green Energy Corp (www.greenenergycorp.com) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. Green Energy
 * Corp licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.greenenergycorp.openfmb.dds;

import com.rti.dds.infrastructure.ResourceLimitsQosPolicy;
import com.rti.dds.infrastructure.StatusKind;
import com.rti.dds.subscription.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Wraps a subscription to a DDS data topic. Handles listening for notifications of incoming data,
 * reading the data from the DataReader, and delivering the result to the user-provided callback.
 *
 * @param <T> DDS data type.
 */
public class TypedTopicSubscription<T> {
    private final static Logger logger = LoggerFactory.getLogger(TypedTopicSubscription.class);

    private final DataReader reader;
    private final TypeHandle<T> typeHandle;

    private final Subscriber subscriber; // for deleting the reader purposes only

    /**
     * @param reader DataReader for the DDS topic/type.
     * @param typeHandle Type-specific interface for the DDS topic/type.
     * @param subscriber Subscriber parent of the DataReader used to release it.
     */
    public TypedTopicSubscription(DataReader reader, TypeHandle<T> typeHandle, Subscriber subscriber) {
        this.reader = reader;
        this.typeHandle = typeHandle;
        this.subscriber = subscriber;
    }

    /**
     *  Starts the listening for arriving data on a topic and delivering read results to the
     *  subscription handler.
     *
     * @param handler Callback handler for incoming data.
     * @throws IOException
     */
    public void subscribe(final SubscriptionHandler<T> handler) throws IOException {

        reader.set_listener(new DataReaderListener() {
            public void on_requested_deadline_missed(DataReader dataReader, RequestedDeadlineMissedStatus requestedDeadlineMissedStatus) {

            }

            public void on_requested_incompatible_qos(DataReader dataReader, RequestedIncompatibleQosStatus requestedIncompatibleQosStatus) {

            }

            public void on_sample_rejected(DataReader dataReader, SampleRejectedStatus sampleRejectedStatus) {

            }

            public void on_liveliness_changed(DataReader dataReader, LivelinessChangedStatus livelinessChangedStatus) {

            }

            public void on_data_available(DataReader dataReader) {

                logger.trace("Data available call");

                try {

                    final ReadResult<T> take =
                            typeHandle.take(reader, ResourceLimitsQosPolicy.LENGTH_UNLIMITED, SampleStateKind.ANY_SAMPLE_STATE,
                                    ViewStateKind.ANY_VIEW_STATE, InstanceStateKind.ALIVE_INSTANCE_STATE);

                    handler.handle(take);

                } catch (Throwable ex) {
                    logger.warn("Error in data available: " + ex);
                    ex.printStackTrace(System.err);
                }
            }

            public void on_sample_lost(DataReader dataReader, SampleLostStatus sampleLostStatus) {

            }

            public void on_subscription_matched(DataReader dataReader, SubscriptionMatchedStatus subscriptionMatchedStatus) {

            }
        }, StatusKind.DATA_AVAILABLE_STATUS);

    }

    public void close() {
        reader.delete_contained_entities();
        subscriber.delete_datareader(reader);
    }
}
