/*
 * RSIndexedSprite.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;

// Original name: km => kb (Rasterizer2D) => gd (CacheableNode) => gw (Node) => java.lang.Object
public class RSIndexedSprite extends RSRasterizer2D {

    public RSIndexedSprite(Object ref) {
        super(ref);
    }

    public int getOffsetX() {
        return (int)AppletLoader.getSingleton().getFieldValue("IndexedSprite", "offsetX", ref);
    }

    public byte[] getPixels() {
        return (byte[])AppletLoader.getSingleton().getFieldValue("IndexedSprite", "pixels", ref);
    }

    public int getOriginalHeight() {
        return (int)AppletLoader.getSingleton().getFieldValue("IndexedSprite", "originalHeight", ref);
    }

    public int getOffsetY() {
        return (int)AppletLoader.getSingleton().getFieldValue("IndexedSprite", "offsetY", ref);
    }

    public int getWidth() {
        return (int)AppletLoader.getSingleton().getFieldValue("IndexedSprite", "width", ref);
    }

    public int[] getPalette() {
        return (int[])AppletLoader.getSingleton().getFieldValue("IndexedSprite", "palette", ref);
    }

    public int getOriginalWidth() {
        return (int)AppletLoader.getSingleton().getFieldValue("IndexedSprite", "originalWidth", ref);
    }

    public int getHeight() {
        return (int)AppletLoader.getSingleton().getFieldValue("IndexedSprite", "height", ref);
    }

}