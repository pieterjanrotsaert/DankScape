/*
 * RSBoundingBox3D.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;

// Original name: z => f (BoundingBox) => gw (Node) => java.lang.Object
public class RSBoundingBox3D extends RSBoundingBox {

    public RSBoundingBox3D(Object ref) {
        super(ref);
    }

    public int getInt2() {
        return (int)AppletLoader.getSingleton().getFieldValue("BoundingBox3D", "int2", ref);
    }

    public int getInt1() {
        return (int)AppletLoader.getSingleton().getFieldValue("BoundingBox3D", "int1", ref);
    }

    public int getInt4() {
        return (int)AppletLoader.getSingleton().getFieldValue("BoundingBox3D", "int4", ref);
    }

    public int getColor() {
        return (int)AppletLoader.getSingleton().getFieldValue("BoundingBox3D", "color", ref);
    }

    public int getInt3() {
        return (int)AppletLoader.getSingleton().getFieldValue("BoundingBox3D", "int3", ref);
    }

    public int getInt6() {
        return (int)AppletLoader.getSingleton().getFieldValue("BoundingBox3D", "int6", ref);
    }

    public int getInt5() {
        return (int)AppletLoader.getSingleton().getFieldValue("BoundingBox3D", "int5", ref);
    }

}
