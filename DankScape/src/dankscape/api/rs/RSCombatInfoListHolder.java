/*
 * RSCombatInfoListHolder.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;

// Original name: cb => gw (Node) => java.lang.Object
public class RSCombatInfoListHolder extends RSNode {

    public RSCombatInfoListHolder(Object ref) {
        super(ref);
    }

    public static RSIndexData getIndexInterfaces() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("CombatInfoListHolder", "indexInterfaces", null);
        RSIndexData wrappers = null;
        if(objects != null)
            wrappers = (RSIndexData)getWrapper(objects);
        return wrappers;
    }

    public static RSBuffer getNetCache_reference() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("CombatInfoListHolder", "NetCache_reference", null);
        RSBuffer wrappers = null;
        if(objects != null)
            wrappers = (RSBuffer)getWrapper(objects);
        return wrappers;
    }

    public RSCombatInfo2 getCombatInfo2() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("CombatInfoListHolder", "combatInfo2", ref);
        RSCombatInfo2 wrappers = null;
        if(objects != null)
            wrappers = (RSCombatInfo2)getWrapper(objects);
        return wrappers;
    }

    public RSCombatInfoList getCombatInfo1() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("CombatInfoListHolder", "combatInfo1", ref);
        RSCombatInfoList wrappers = null;
        if(objects != null)
            wrappers = (RSCombatInfoList)getWrapper(objects);
        return wrappers;
    }

}
