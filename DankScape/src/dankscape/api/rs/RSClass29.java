/*
 * RSClass29.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: ag => java.lang.Object
public class RSClass29 extends RSClassWrapper {

    public RSClass29(Object ref) {
        super(ref);
    }

    public static java.lang.String[] getCacheLocations() {
        return (java.lang.String[])AppletLoader.getSingleton().getFieldValue("class29", "cacheLocations", null);
    }

    public static RSFileRequest getCurrentRequest() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("class29", "currentRequest", null);
        RSFileRequest wrappers = null;
        if(objects != null)
            wrappers = (RSFileRequest)getWrapper(objects);
        return wrappers;
    }

}