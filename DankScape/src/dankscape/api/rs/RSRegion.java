/*
 * RSRegion.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: eh => java.lang.Object
public class RSRegion extends RSClassWrapper {

    public RSRegion(Object ref) {
        super(ref);
    }

    public int[][][] getTileCycles() {
        return (int[][][])AppletLoader.getSingleton().getFieldValue("Region", "tileCycles", ref);
    }

    public static boolean getViewportWalking() {
        return (boolean)AppletLoader.getSingleton().getFieldValue("Region", "viewportWalking", null);
    }

    public int[][] getTILE_MASK_2D() {
        return (int[][])AppletLoader.getSingleton().getFieldValue("Region", "TILE_MASK_2D", ref);
    }

    public int getMaxZ() {
        return (int)AppletLoader.getSingleton().getFieldValue("Region", "maxZ", ref);
    }

    public int getMaxY() {
        return (int)AppletLoader.getSingleton().getFieldValue("Region", "maxY", ref);
    }

    public RSGameObject[] getObjects() {
        Object[] objects = (Object[])AppletLoader.getSingleton().getFieldValue("Region", "objects", ref);
        RSGameObject[] wrappers = null;
        if(objects == null)
            return null;
        wrappers = new RSGameObject[objects.length];
        for(int i = 0;i < objects.length;i++) {
            if(objects[i] != null)
                wrappers[i] = (RSGameObject)getWrapper(objects[i]);
        }
        return wrappers;
    }

    public Object[] getRSRef_Objects() {
        return (Object[])AppletLoader.getSingleton().getFieldValue("Region", "objects", ref);
    }

    public int getMaxX() {
        return (int)AppletLoader.getSingleton().getFieldValue("Region", "maxX", ref);
    }

    public int[][] getTILE_ROTATION_2D() {
        return (int[][])AppletLoader.getSingleton().getFieldValue("Region", "TILE_ROTATION_2D", ref);
    }

    public static int[] getLevelOccluderCount() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Region", "levelOccluderCount", null);
    }

    public static int getMouseY2() {
        return (int)AppletLoader.getSingleton().getFieldValue("Region", "mouseY2", null);
    }

    public static int getSelectedRegionTileY() {
        return (int)AppletLoader.getSingleton().getFieldValue("Region", "selectedRegionTileY", null);
    }

    public static int getMAX_OCCLUDER_LEVELS() {
        return (int)AppletLoader.getSingleton().getFieldValue("Region", "MAX_OCCLUDER_LEVELS", null);
    }

    public static int getSelectedRegionTileX() {
        return (int)AppletLoader.getSingleton().getFieldValue("Region", "selectedRegionTileX", null);
    }

    public static RSGameObject[] getEntityBuffer() {
        Object[] objects = (Object[])AppletLoader.getSingleton().getFieldValue("Region", "entityBuffer", null);
        RSGameObject[] wrappers = null;
        if(objects == null)
            return null;
        wrappers = new RSGameObject[objects.length];
        for(int i = 0;i < objects.length;i++) {
            if(objects[i] != null)
                wrappers[i] = (RSGameObject)getWrapper(objects[i]);
        }
        return wrappers;
    }

    public static Object[] getRSRef_EntityBuffer() {
        return (Object[])AppletLoader.getSingleton().getFieldValue("Region", "entityBuffer", null);
    }

    public static int getCycle() {
        return (int)AppletLoader.getSingleton().getFieldValue("Region", "cycle", null);
    }

    public static int getYawCos() {
        return (int)AppletLoader.getSingleton().getFieldValue("Region", "yawCos", null);
    }

    public RSTile[][][] getTiles() {
        Object[][][] objects = (Object[][][])AppletLoader.getSingleton().getFieldValue("Region", "tiles", ref);
        RSTile[][][] wrappers = null;
        if(objects == null)
            return null;
        wrappers = new RSTile[objects.length][][];
        for(int i = 0;i < objects.length;i++) {
            if(objects[i] == null)
                continue;
            wrappers[i] = new RSTile[objects[i].length][];
            for(int j = 0;j < objects[i].length;j++) {
                if(objects[i][j] == null)
                    continue;
                wrappers[i][j] = new RSTile[objects[i][j].length];
                for(int k = 0;k < objects[i][j].length;k++) {
                    if(objects[i][j][k] != null)
                        wrappers[i][j][k] = (RSTile)getWrapper(objects[i][j][k]);
                }
            }
        }
        return wrappers;
    }

    public Object[][][] getRSRef_Tiles() {
        return (Object[][][])AppletLoader.getSingleton().getFieldValue("Region", "tiles", ref);
    }

    public static RSDeque getTileDeque() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("Region", "tileDeque", null);
        RSDeque wrappers = null;
        if(objects != null)
            wrappers = (RSDeque)getWrapper(objects);
        return wrappers;
    }

    public static int getMaxTileX() {
        return (int)AppletLoader.getSingleton().getFieldValue("Region", "maxTileX", null);
    }

    public int[][][] getTileHeights() {
        return (int[][][])AppletLoader.getSingleton().getFieldValue("Region", "tileHeights", ref);
    }

    public static int getTileUpdateCount() {
        return (int)AppletLoader.getSingleton().getFieldValue("Region", "tileUpdateCount", null);
    }

    public static int getScreenCenterX() {
        return (int)AppletLoader.getSingleton().getFieldValue("Region", "screenCenterX", null);
    }

    public static int getScreenCenterZ() {
        return (int)AppletLoader.getSingleton().getFieldValue("Region", "screenCenterZ", null);
    }

    public static int[] getTILE_WALL_DRAW_FLAGS_1() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Region", "TILE_WALL_DRAW_FLAGS_1", null);
    }

    public static boolean getLowMemory() {
        return (boolean)AppletLoader.getSingleton().getFieldValue("Region", "lowMemory", null);
    }

    public static int getMaxTileZ() {
        return (int)AppletLoader.getSingleton().getFieldValue("Region", "maxTileZ", null);
    }

    public static boolean[][] getRenderArea() {
        return (boolean[][])AppletLoader.getSingleton().getFieldValue("Region", "renderArea", null);
    }

    public static int getPitchCos() {
        return (int)AppletLoader.getSingleton().getFieldValue("Region", "pitchCos", null);
    }

    public static int getYawSin() {
        return (int)AppletLoader.getSingleton().getFieldValue("Region", "yawSin", null);
    }

    public static int[] getWALL_UNCULL_FLAGS_3() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Region", "WALL_UNCULL_FLAGS_3", null);
    }

    public static int[] getWALL_UNCULL_FLAGS_2() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Region", "WALL_UNCULL_FLAGS_2", null);
    }

    public static int[] getWALL_UNCULL_FLAGS_1() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Region", "WALL_UNCULL_FLAGS_1", null);
    }

    public static int[] getWALL_UNCULL_FLAGS_0() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Region", "WALL_UNCULL_FLAGS_0", null);
    }

    public static boolean[][][][] getVisibilityMaps() {
        return (boolean[][][][])AppletLoader.getSingleton().getFieldValue("Region", "visibilityMaps", null);
    }

    public static int getMouseX2() {
        return (int)AppletLoader.getSingleton().getFieldValue("Region", "mouseX2", null);
    }

    public static int getMinTileX() {
        return (int)AppletLoader.getSingleton().getFieldValue("Region", "minTileX", null);
    }

    public static boolean getCheckClick() {
        return (boolean)AppletLoader.getSingleton().getFieldValue("Region", "checkClick", null);
    }

    public static int getMinTileZ() {
        return (int)AppletLoader.getSingleton().getFieldValue("Region", "minTileZ", null);
    }

    public int getMinLevel() {
        return (int)AppletLoader.getSingleton().getFieldValue("Region", "minLevel", ref);
    }

    public int getEntityCount() {
        return (int)AppletLoader.getSingleton().getFieldValue("Region", "entityCount", ref);
    }

    public static RSOccluder[][] getLevelOccluders() {
        Object[][] objects = (Object[][])AppletLoader.getSingleton().getFieldValue("Region", "levelOccluders", null);
        RSOccluder[][] wrappers = null;
        if(objects == null)
            return null;
        wrappers = new RSOccluder[objects.length][];
        for(int i = 0;i < objects.length;i++) {
            if(objects[i] == null)
                continue;
            wrappers[i] = new RSOccluder[objects[i].length];
            for(int j = 0;j < objects[i].length;j++) {
                if(objects[i][j] != null)
                    wrappers[i][j] = (RSOccluder)getWrapper(objects[i][j]);
            }
        }
        return wrappers;
    }

    public static Object[][] getRSRef_LevelOccluders() {
        return (Object[][])AppletLoader.getSingleton().getFieldValue("Region", "levelOccluders", null);
    }

    public static int getPitchSin() {
        return (int)AppletLoader.getSingleton().getFieldValue("Region", "pitchSin", null);
    }

}
