/*
 * RSSceneTilePaint.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: eg => java.lang.Object
public class RSSceneTilePaint extends RSClassWrapper {

    public RSSceneTilePaint(Object ref) {
        super(ref);
    }

    public boolean getFlatShade() {
        return (boolean)AppletLoader.getSingleton().getFieldValue("SceneTilePaint", "flatShade", ref);
    }

    public int getTexture() {
        return (int)AppletLoader.getSingleton().getFieldValue("SceneTilePaint", "texture", ref);
    }

    public int getNeColor() {
        return (int)AppletLoader.getSingleton().getFieldValue("SceneTilePaint", "neColor", ref);
    }

    public int getNwColor() {
        return (int)AppletLoader.getSingleton().getFieldValue("SceneTilePaint", "nwColor", ref);
    }

    public int getSeColor() {
        return (int)AppletLoader.getSingleton().getFieldValue("SceneTilePaint", "seColor", ref);
    }

    public int getRgb() {
        return (int)AppletLoader.getSingleton().getFieldValue("SceneTilePaint", "rgb", ref);
    }

    public int getSwColor() {
        return (int)AppletLoader.getSingleton().getFieldValue("SceneTilePaint", "swColor", ref);
    }

}
