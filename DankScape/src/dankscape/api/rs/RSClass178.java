/*
 * RSClass178.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: fd => java.lang.Object
public class RSClass178 extends RSClassWrapper {

    public RSClass178(Object ref) {
        super(ref);
    }

    public static RSDState getState() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("class178", "state", null);
        RSDState wrappers = null;
        if(objects != null)
            wrappers = (RSDState)getWrapper(objects);
        return wrappers;
    }

}
