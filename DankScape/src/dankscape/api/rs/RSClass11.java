/*
 * RSClass11.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: u => java.lang.Object
public class RSClass11 extends RSClassWrapper {

    public RSClass11(Object ref) {
        super(ref);
    }

    public static RSClass11 getBoundingBox3DDrawMode_mouseOver() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("class11", "BoundingBox3DDrawMode_mouseOver", null);
        RSClass11 wrappers = null;
        if(objects != null)
            wrappers = (RSClass11)getWrapper(objects);
        return wrappers;
    }

    public static RSClass11 getBoundingBox3DDrawMode_all() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("class11", "BoundingBox3DDrawMode_all", null);
        RSClass11 wrappers = null;
        if(objects != null)
            wrappers = (RSClass11)getWrapper(objects);
        return wrappers;
    }

}
