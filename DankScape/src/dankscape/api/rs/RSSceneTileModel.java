/*
 * RSSceneTileModel.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: dl => java.lang.Object
public class RSSceneTileModel extends RSClassWrapper {

    public RSSceneTileModel(Object ref) {
        super(ref);
    }

    public int[] getVertexY() {
        return (int[])AppletLoader.getSingleton().getFieldValue("SceneTileModel", "vertexY", ref);
    }

    public boolean getFlatShade() {
        return (boolean)AppletLoader.getSingleton().getFieldValue("SceneTileModel", "flatShade", ref);
    }

    public int[] getVertexX() {
        return (int[])AppletLoader.getSingleton().getFieldValue("SceneTileModel", "vertexX", ref);
    }

    public int[] getVertexZ() {
        return (int[])AppletLoader.getSingleton().getFieldValue("SceneTileModel", "vertexZ", ref);
    }

    public int getShape() {
        return (int)AppletLoader.getSingleton().getFieldValue("SceneTileModel", "shape", ref);
    }

    public int getOverlay() {
        return (int)AppletLoader.getSingleton().getFieldValue("SceneTileModel", "overlay", ref);
    }

    public int[] getTriangleColorC() {
        return (int[])AppletLoader.getSingleton().getFieldValue("SceneTileModel", "triangleColorC", ref);
    }

    public int getRotation() {
        return (int)AppletLoader.getSingleton().getFieldValue("SceneTileModel", "rotation", ref);
    }

    public static int[] getVertexSceneZ() {
        return (int[])AppletLoader.getSingleton().getFieldValue("SceneTileModel", "vertexSceneZ", null);
    }

    public static int[] getVertexSceneX() {
        return (int[])AppletLoader.getSingleton().getFieldValue("SceneTileModel", "vertexSceneX", null);
    }

    public int[] getTriangleColorA() {
        return (int[])AppletLoader.getSingleton().getFieldValue("SceneTileModel", "triangleColorA", ref);
    }

    public static int[] getVertexSceneY() {
        return (int[])AppletLoader.getSingleton().getFieldValue("SceneTileModel", "vertexSceneY", null);
    }

    public int[] getTriangleColorB() {
        return (int[])AppletLoader.getSingleton().getFieldValue("SceneTileModel", "triangleColorB", ref);
    }

    public int getUnderlay() {
        return (int)AppletLoader.getSingleton().getFieldValue("SceneTileModel", "underlay", ref);
    }

    public static int[] getTmpScreenX() {
        return (int[])AppletLoader.getSingleton().getFieldValue("SceneTileModel", "tmpScreenX", null);
    }

    public static int[] getTmpScreenY() {
        return (int[])AppletLoader.getSingleton().getFieldValue("SceneTileModel", "tmpScreenY", null);
    }

    public int[] getTriangleTextureId() {
        return (int[])AppletLoader.getSingleton().getFieldValue("SceneTileModel", "triangleTextureId", ref);
    }

}
