/*
 * RSVertexNormal.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: ea => java.lang.Object
public class RSVertexNormal extends RSClassWrapper {

    public RSVertexNormal(Object ref) {
        super(ref);
    }

    public int getX() {
        return (int)AppletLoader.getSingleton().getFieldValue("VertexNormal", "x", ref);
    }

    public int getY() {
        return (int)AppletLoader.getSingleton().getFieldValue("VertexNormal", "y", ref);
    }

    public int getZ() {
        return (int)AppletLoader.getSingleton().getFieldValue("VertexNormal", "z", ref);
    }

    public int getMagnitude() {
        return (int)AppletLoader.getSingleton().getFieldValue("VertexNormal", "magnitude", ref);
    }

}