/*
 * RSAttackOption.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: cr => java.lang.Object
public class RSAttackOption extends RSClassWrapper {

    public RSAttackOption(Object ref) {
        super(ref);
    }

    public static RSAttackOption getAttackOption_hidden() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("AttackOption", "AttackOption_hidden", null);
        RSAttackOption wrappers = null;
        if(objects != null)
            wrappers = (RSAttackOption)getWrapper(objects);
        return wrappers;
    }

    public static RSAttackOption getAttackOption_dependsOnCombatLevels() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("AttackOption", "AttackOption_dependsOnCombatLevels", null);
        RSAttackOption wrappers = null;
        if(objects != null)
            wrappers = (RSAttackOption)getWrapper(objects);
        return wrappers;
    }

    public static RSAttackOption getAttackOption_leftClickWhereAvailable() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("AttackOption", "AttackOption_leftClickWhereAvailable", null);
        RSAttackOption wrappers = null;
        if(objects != null)
            wrappers = (RSAttackOption)getWrapper(objects);
        return wrappers;
    }

    public static RSAttackOption getAttackOption_alwaysRightClick() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("AttackOption", "AttackOption_alwaysRightClick", null);
        RSAttackOption wrappers = null;
        if(objects != null)
            wrappers = (RSAttackOption)getWrapper(objects);
        return wrappers;
    }

    public int getId() {
        return (int)AppletLoader.getSingleton().getFieldValue("AttackOption", "id", ref);
    }

}
