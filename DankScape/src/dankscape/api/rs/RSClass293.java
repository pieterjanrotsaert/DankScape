/*
 * RSClass293.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: kx => java.lang.Object
public class RSClass293 extends RSClassWrapper {

    public RSClass293(Object ref) {
        super(ref);
    }

    public static RSCombatInfoList getClassInfos() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("class293", "classInfos", null);
        RSCombatInfoList wrappers = null;
        if(objects != null)
            wrappers = (RSCombatInfoList)getWrapper(objects);
        return wrappers;
    }

}
