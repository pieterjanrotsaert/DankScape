/*
 * RSClass228.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: hs => java.lang.Object
public class RSClass228 extends RSClassWrapper {

    public RSClass228(Object ref) {
        super(ref);
    }

    public static RSIndexDataBase getEnumDefinition_indexCache() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("class228", "EnumDefinition_indexCache", null);
        RSIndexDataBase wrappers = null;
        if(objects != null)
            wrappers = (RSIndexDataBase)getWrapper(objects);
        return wrappers;
    }

}