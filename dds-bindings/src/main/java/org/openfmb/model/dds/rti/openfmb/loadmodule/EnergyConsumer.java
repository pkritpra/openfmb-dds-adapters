

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package org.openfmb.model.dds.rti.openfmb.loadmodule;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class EnergyConsumer   implements Copyable, Serializable{

    public String mRID=  "" ; /* maximum length = (255) */
    public String description=  "" ; /* maximum length = (255) */
    public String name=  "" ; /* maximum length = (255) */
    public String operatingLimit=  "" ; /* maximum length = (255) */

    public EnergyConsumer() {

    }
    public EnergyConsumer (EnergyConsumer other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        EnergyConsumer self;
        self = new  EnergyConsumer();
        self.clear();
        return self;

    }

    public void clear() {

        mRID=  ""; 
        description=  ""; 
        name=  ""; 
        operatingLimit=  ""; 
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        EnergyConsumer otherObj = (EnergyConsumer)o;

        if(!mRID.equals(otherObj.mRID)) {
            return false;
        }
        if(!description.equals(otherObj.description)) {
            return false;
        }
        if(!name.equals(otherObj.name)) {
            return false;
        }
        if(!operatingLimit.equals(otherObj.operatingLimit)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += mRID.hashCode(); 
        __result += description.hashCode(); 
        __result += name.hashCode(); 
        __result += operatingLimit.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>EnergyConsumerTypeSupport</code>
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

        EnergyConsumer typedSrc = (EnergyConsumer) src;
        EnergyConsumer typedDst = this;

        typedDst.mRID = typedSrc.mRID;
        typedDst.description = typedSrc.description;
        typedDst.name = typedSrc.name;
        typedDst.operatingLimit = typedSrc.operatingLimit;

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
        strBuffer.append("mRID: ").append(mRID).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("description: ").append(description).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("name: ").append(name).append("\n");  
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("operatingLimit: ").append(operatingLimit).append("\n");  

        return strBuffer.toString();
    }

}
