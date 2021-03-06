/*
 * RSNPCComposition.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;

// Original name: jh => gd (CacheableNode) => gw (Node) => java.lang.Object
public class RSNPCComposition extends RSCacheableNode {

    public RSNPCComposition(Object ref) {
        super(ref);
    }

    public static RSNodeCache getNpcs() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("NPCComposition", "npcs", null);
        RSNodeCache wrappers = null;
        if(objects != null)
            wrappers = (RSNodeCache)getWrapper(objects);
        return wrappers;
    }

    public int[] getConfigs() {
        return (int[])AppletLoader.getSingleton().getFieldValue("NPCComposition", "configs", ref);
    }

    public int[] getModels() {
        return (int[])AppletLoader.getSingleton().getFieldValue("NPCComposition", "models", ref);
    }

    public int getHeightScale() {
        return (int)AppletLoader.getSingleton().getFieldValue("NPCComposition", "heightScale", ref);
    }

    public static RSIndexDataBase getNpcDefinition_modelIndexCache() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("NPCComposition", "NpcDefinition_modelIndexCache", null);
        RSIndexDataBase wrappers = null;
        if(objects != null)
            wrappers = (RSIndexDataBase)getWrapper(objects);
        return wrappers;
    }

    public int getVarp32Index() {
        return (int)AppletLoader.getSingleton().getFieldValue("NPCComposition", "varp32Index", ref);
    }

    public boolean getIsVisible() {
        return (boolean)AppletLoader.getSingleton().getFieldValue("NPCComposition", "isVisible", ref);
    }

    public boolean getIsMinimapVisible() {
        return (boolean)AppletLoader.getSingleton().getFieldValue("NPCComposition", "isMinimapVisible", ref);
    }

    public short[] getColors() {
        return (short[])AppletLoader.getSingleton().getFieldValue("NPCComposition", "colors", ref);
    }

    public int getWidthScale() {
        return (int)AppletLoader.getSingleton().getFieldValue("NPCComposition", "widthScale", ref);
    }

    public int getVarpIndex() {
        return (int)AppletLoader.getSingleton().getFieldValue("NPCComposition", "varpIndex", ref);
    }

    public static RSNodeCache getNpcModelCache() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("NPCComposition", "npcModelCache", null);
        RSNodeCache wrappers = null;
        if(objects != null)
            wrappers = (RSNodeCache)getWrapper(objects);
        return wrappers;
    }

    public short[] getModifiedColors() {
        return (short[])AppletLoader.getSingleton().getFieldValue("NPCComposition", "modifiedColors", ref);
    }

    public java.lang.String getName() {
        return (java.lang.String)AppletLoader.getSingleton().getFieldValue("NPCComposition", "name", ref);
    }

    public boolean getIsClickable() {
        return (boolean)AppletLoader.getSingleton().getFieldValue("NPCComposition", "isClickable", ref);
    }

    public int getId() {
        return (int)AppletLoader.getSingleton().getFieldValue("NPCComposition", "id", ref);
    }

    public int getCombatLevel() {
        return (int)AppletLoader.getSingleton().getFieldValue("NPCComposition", "combatLevel", ref);
    }

    public java.lang.String[] getActions() {
        return (java.lang.String[])AppletLoader.getSingleton().getFieldValue("NPCComposition", "actions", ref);
    }

    public static RSIndexDataBase getNpcDefinition_indexCache() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("NPCComposition", "NpcDefinition_indexCache", null);
        RSIndexDataBase wrappers = null;
        if(objects != null)
            wrappers = (RSIndexDataBase)getWrapper(objects);
        return wrappers;
    }

}
