/*
 * RSRasterizer2D.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;

// Original name: kb => gd (CacheableNode) => gw (Node) => java.lang.Object
public class RSRasterizer2D extends RSCacheableNode {

    public RSRasterizer2D(Object ref) {
        super(ref);
    }

    public static int getDrawingAreaBottom() {
        return (int)AppletLoader.getSingleton().getFieldValue("Rasterizer2D", "drawingAreaBottom", null);
    }

    public static int getGraphicsPixelsHeight() {
        return (int)AppletLoader.getSingleton().getFieldValue("Rasterizer2D", "graphicsPixelsHeight", null);
    }

    public static int getDrawingAreaRight() {
        return (int)AppletLoader.getSingleton().getFieldValue("Rasterizer2D", "drawingAreaRight", null);
    }

    public static int[] getGraphicsPixels() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Rasterizer2D", "graphicsPixels", null);
    }

    public static int getDraw_region_x() {
        return (int)AppletLoader.getSingleton().getFieldValue("Rasterizer2D", "draw_region_x", null);
    }

    public static int getDrawingAreaTop() {
        return (int)AppletLoader.getSingleton().getFieldValue("Rasterizer2D", "drawingAreaTop", null);
    }

    public static int getGraphicsPixelsWidth() {
        return (int)AppletLoader.getSingleton().getFieldValue("Rasterizer2D", "graphicsPixelsWidth", null);
    }

}