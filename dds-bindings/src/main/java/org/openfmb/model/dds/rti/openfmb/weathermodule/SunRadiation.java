

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package org.openfmb.model.dds.rti.openfmb.weathermodule;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class SunRadiation   implements Copyable, Serializable{

    public org.openfmb.model.dds.rti.openfmb.commonmodule.unitmultiplier.UnitMultiplierKind multiplier = (org.openfmb.model.dds.rti.openfmb.commonmodule.unitmultiplier.UnitMultiplierKind)org.openfmb.model.dds.rti.openfmb.commonmodule.unitmultiplier.UnitMultiplierKind.create();
    public org.openfmb.model.dds.rti.openfmb.commonmodule.unitsymbol.UnitSymbolKind unit = (org.openfmb.model.dds.rti.openfmb.commonmodule.unitsymbol.UnitSymbolKind)org.openfmb.model.dds.rti.openfmb.commonmodule.unitsymbol.UnitSymbolKind.create();
    public org.openfmb.model.dds.rti.openfmb.weathermodule.SequenceOfSunRadiationData sunRadiationData = (org.openfmb.model.dds.rti.openfmb.weathermodule.SequenceOfSunRadiationData)org.openfmb.model.dds.rti.openfmb.weathermodule.SequenceOfSunRadiationData.create();

    public SunRadiation() {

    }
    public SunRadiation (SunRadiation other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        SunRadiation self;
        self = new  SunRadiation();
        self.clear();
        return self;

    }

    public void clear() {

        multiplier = org.openfmb.model.dds.rti.openfmb.commonmodule.unitmultiplier.UnitMultiplierKind.create();
        unit = org.openfmb.model.dds.rti.openfmb.commonmodule.unitsymbol.UnitSymbolKind.create();
        if (sunRadiationData != null) {
            sunRadiationData.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        SunRadiation otherObj = (SunRadiation)o;

        if(!multiplier.equals(otherObj.multiplier)) {
            return false;
        }
        if(!unit.equals(otherObj.unit)) {
            return false;
        }
        if(!sunRadiationData.equals(otherObj.sunRadiationData)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += multiplier.hashCode(); 
        __result += unit.hashCode(); 
        __result += sunRadiationData.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>SunRadiationTypeSupport</code>
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

        SunRadiation typedSrc = (SunRadiation) src;
        SunRadiation typedDst = this;

        typedDst.multiplier = (org.openfmb.model.dds.rti.openfmb.commonmodule.unitmultiplier.UnitMultiplierKind) typedDst.multiplier.copy_from(typedSrc.multiplier);
        typedDst.unit = (org.openfmb.model.dds.rti.openfmb.commonmodule.unitsymbol.UnitSymbolKind) typedDst.unit.copy_from(typedSrc.unit);
        typedDst.sunRadiationData = (org.openfmb.model.dds.rti.openfmb.weathermodule.SequenceOfSunRadiationData) typedDst.sunRadiationData.copy_from(typedSrc.sunRadiationData);

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

        strBuffer.append(multiplier.toString("multiplier ", indent+1));
        strBuffer.append(unit.toString("unit ", indent+1));
        strBuffer.append(sunRadiationData.toString("sunRadiationData ", indent+1));

        return strBuffer.toString();
    }

}