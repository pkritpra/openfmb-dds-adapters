

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package org.openfmb.model.dds.rti.openfmb.generationmodule;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class GenerationEventModule   implements Copyable, Serializable{

    public String logicalDeviceID=  "" ; /* maximum length = (255) */
    public long timestamp= 0;
    public org.openfmb.model.dds.rti.openfmb.generationmodule.GeneratingUnit generatingUnit = (org.openfmb.model.dds.rti.openfmb.generationmodule.GeneratingUnit)org.openfmb.model.dds.rti.openfmb.generationmodule.GeneratingUnit.create();
    public org.openfmb.model.dds.rti.openfmb.generationmodule.GenerationStatus generationStatus = (org.openfmb.model.dds.rti.openfmb.generationmodule.GenerationStatus)org.openfmb.model.dds.rti.openfmb.generationmodule.GenerationStatus.create();

    public GenerationEventModule() {

    }
    public GenerationEventModule (GenerationEventModule other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        GenerationEventModule self;
        self = new  GenerationEventModule();
        self.clear();
        return self;

    }

    public void clear() {

        logicalDeviceID=  ""; 
        timestamp= 0;
        if (generatingUnit != null) {
            generatingUnit.clear();
        }
        if (generationStatus != null) {
            generationStatus.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        GenerationEventModule otherObj = (GenerationEventModule)o;

        if(!logicalDeviceID.equals(otherObj.logicalDeviceID)) {
            return false;
        }
        if(timestamp != otherObj.timestamp) {
            return false;
        }
        if(!generatingUnit.equals(otherObj.generatingUnit)) {
            return false;
        }
        if(!generationStatus.equals(otherObj.generationStatus)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += logicalDeviceID.hashCode(); 
        __result += (int)timestamp;
        __result += generatingUnit.hashCode(); 
        __result += generationStatus.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>GenerationEventModuleTypeSupport</code>
    * rather than here by using the <code>-noCopyable</code> option
    * to rtiddsgen.
    * 
    * @param src The Object which contains the data to be copied.
    * @return Returns <code>this</code>.
    * @exception NullPointerException If <code>src</code> is null.
    * @exception ClassCastException If <code>src</code> is not the 
    * same type as <code>this</code>.
    * @see com.rti.dds.infrastructure.Copyable#copy_from(java.lang.Object)
    */
    public Object copy_from(Object src) {

        GenerationEventModule typedSrc = (GenerationEventModule) src;
        GenerationEventModule typedDst = this;

        typedDst.logicalDeviceID = typedSrc.logicalDeviceID;
        typedDst.timestamp = typedSrc.timestamp;
        typedDst.generatingUnit = (org.openfmb.model.dds.rti.openfmb.generationmodule.GeneratingUnit) typedDst.generatingUnit.copy_from(typedSrc.generatingUnit);
        typedDst.generationStatus = (org.openfmb.model.dds.rti.openfmb.generationmodule.GenerationStatus) typedDst.generationStatus.copy_from(typedSrc.generationStatus);

        return this;
    }

    public String toString(){
        return toString("", 0);
    }

    public String toString(String desc, int indent) {
        StringBuffer strBuffer = new StringBuffer();        

        if (desc != null) {
            CdrHelper.printIndent(strBuffer, indent);
            strBuffer.append(desc).append(":\n");
        }

        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("logicalDeviceID: ").append(logicalDeviceID).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("timestamp: ").append(timestamp).append("\n");  
        strBuffer.append(generatingUnit.toString("generatingUnit ", indent+1));
        strBuffer.append(generationStatus.toString("generationStatus ", indent+1));

        return strBuffer.toString();
    }

}
