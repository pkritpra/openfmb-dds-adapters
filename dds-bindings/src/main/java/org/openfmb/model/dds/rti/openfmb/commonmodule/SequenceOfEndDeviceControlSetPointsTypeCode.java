
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package org.openfmb.model.dds.rti.openfmb.commonmodule;

import com.rti.dds.typecode.*;

public class  SequenceOfEndDeviceControlSetPointsTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_alias_tc("openfmb::commonmodule::SequenceOfEndDeviceControlSetPoints", new TypeCode((org.openfmb.model.dds.rti.openfmb.commonmodule.MaxLengthEndDeviceControlSetPoints.VALUE), org.openfmb.model.dds.rti.openfmb.commonmodule.SetPointTypeCode.VALUE),  false);        
        return tc;
    }
}

