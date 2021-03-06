/*
 * RSFontTypeFace.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;

// Original name: jj => kb (Rasterizer2D) => gd (CacheableNode) => gw (Node) => java.lang.Object
public class RSFontTypeFace extends RSRasterizer2D {

    public RSFontTypeFace(Object ref) {
        super(ref);
    }

    public int[] getVerticalOffsets() {
        return (int[])AppletLoader.getSingleton().getFieldValue("FontTypeFace", "verticalOffsets", ref);
    }

    public static int getShadow() {
        return (int)AppletLoader.getSingleton().getFieldValue("FontTypeFace", "shadow", null);
    }

    public static int getColor() {
        return (int)AppletLoader.getSingleton().getFieldValue("FontTypeFace", "color", null);
    }

    public static int getPrevShadeRGB() {
        return (int)AppletLoader.getSingleton().getFieldValue("FontTypeFace", "prevShadeRGB", null);
    }

    public int[] getGlyphWidths() {
        return (int[])AppletLoader.getSingleton().getFieldValue("FontTypeFace", "glyphWidths", ref);
    }

    public static int getPrevColorRGB() {
        return (int)AppletLoader.getSingleton().getFieldValue("FontTypeFace", "prevColorRGB", null);
    }

    public int[] getGylphHeights() {
        return (int[])AppletLoader.getSingleton().getFieldValue("FontTypeFace", "gylphHeights", ref);
    }

    public int getMinSpacing() {
        return (int)AppletLoader.getSingleton().getFieldValue("FontTypeFace", "minSpacing", ref);
    }

    public int[] getHorizontalOffsets() {
        return (int[])AppletLoader.getSingleton().getFieldValue("FontTypeFace", "horizontalOffsets", ref);
    }

    public static RSIndexedSprite[] getModIcons() {
        Object[] objects = (Object[])AppletLoader.getSingleton().getFieldValue("FontTypeFace", "modIcons", null);
        RSIndexedSprite[] wrappers = null;
        if(objects == null)
            return null;
        wrappers = new RSIndexedSprite[objects.length];
        for(int i = 0;i < objects.length;i++) {
            if(objects[i] != null)
                wrappers[i] = (RSIndexedSprite)getWrapper(objects[i]);
        }
        return wrappers;
    }

    public static Object[] getRSRef_ModIcons() {
        return (Object[])AppletLoader.getSingleton().getFieldValue("FontTypeFace", "modIcons", null);
    }

    public int getMaxSpacing() {
        return (int)AppletLoader.getSingleton().getFieldValue("FontTypeFace", "maxSpacing", ref);
    }

    public static int getUnderlineRGB() {
        return (int)AppletLoader.getSingleton().getFieldValue("FontTypeFace", "underlineRGB", null);
    }

    public static int getStrikeRGB() {
        return (int)AppletLoader.getSingleton().getFieldValue("FontTypeFace", "strikeRGB", null);
    }

    public int getVerticalSpace() {
        return (int)AppletLoader.getSingleton().getFieldValue("FontTypeFace", "verticalSpace", ref);
    }

    public byte[][] getGylphs() {
        return (byte[][])AppletLoader.getSingleton().getFieldValue("FontTypeFace", "gylphs", ref);
    }

}
