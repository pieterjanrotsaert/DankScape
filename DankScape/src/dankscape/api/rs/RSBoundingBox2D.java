/*
 * RSBoundingBox2D.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;

// Original name: e => f (BoundingBox) => gw (Node) => java.lang.Object
public class RSBoundingBox2D extends RSBoundingBox {

    public RSBoundingBox2D(Object ref) {
        super(ref);
    }

    public int getYMin() {
        return (int)AppletLoader.getSingleton().getFieldValue("BoundingBox2D", "yMin", ref);
    }

    public int getYMax() {
        return (int)AppletLoader.getSingleton().getFieldValue("BoundingBox2D", "yMax", ref);
    }

    public int getColor() {
        return (int)AppletLoader.getSingleton().getFieldValue("BoundingBox2D", "color", ref);
    }

    public int getXMax() {
        return (int)AppletLoader.getSingleton().getFieldValue("BoundingBox2D", "xMax", ref);
    }

    public int getXMin() {
        return (int)AppletLoader.getSingleton().getFieldValue("BoundingBox2D", "xMin", ref);
    }

}
