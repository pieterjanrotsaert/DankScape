/*
 * RSSequence.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;

// Original name: js => gd (CacheableNode) => gw (Node) => java.lang.Object
public class RSSequence extends RSCacheableNode {

    public RSSequence(Object ref) {
        super(ref);
    }

    public int[] getInterleaveLeave() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Sequence", "interleaveLeave", ref);
    }

    public int getRightHandItem() {
        return (int)AppletLoader.getSingleton().getFieldValue("Sequence", "rightHandItem", ref);
    }

    public boolean getStretches() {
        return (boolean)AppletLoader.getSingleton().getFieldValue("Sequence", "stretches", ref);
    }

    public static RSNodeCache getSkeletons() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("Sequence", "skeletons", null);
        RSNodeCache wrappers = null;
        if(objects != null)
            wrappers = (RSNodeCache)getWrapper(objects);
        return wrappers;
    }

    public int getFrameStep() {
        return (int)AppletLoader.getSingleton().getFieldValue("Sequence", "frameStep", ref);
    }

    public int getPrecedenceAnimating() {
        return (int)AppletLoader.getSingleton().getFieldValue("Sequence", "precedenceAnimating", ref);
    }

    public static RSIndexDataBase getSkel_ref() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("Sequence", "skel_ref", null);
        RSIndexDataBase wrappers = null;
        if(objects != null)
            wrappers = (RSIndexDataBase)getWrapper(objects);
        return wrappers;
    }

    public static RSNodeCache getSequences() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("Sequence", "sequences", null);
        RSNodeCache wrappers = null;
        if(objects != null)
            wrappers = (RSNodeCache)getWrapper(objects);
        return wrappers;
    }

    public int getPriority() {
        return (int)AppletLoader.getSingleton().getFieldValue("Sequence", "priority", ref);
    }

    public int getMaxLoops() {
        return (int)AppletLoader.getSingleton().getFieldValue("Sequence", "maxLoops", ref);
    }

    public int getReplyMode() {
        return (int)AppletLoader.getSingleton().getFieldValue("Sequence", "replyMode", ref);
    }

    public int getForcedPriority() {
        return (int)AppletLoader.getSingleton().getFieldValue("Sequence", "forcedPriority", ref);
    }

    public int getLeftHandItem() {
        return (int)AppletLoader.getSingleton().getFieldValue("Sequence", "leftHandItem", ref);
    }

    public int[] getFrameLenghts() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Sequence", "frameLenghts", ref);
    }

    public static RSIndexDataBase getSeq_ref() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("Sequence", "seq_ref", null);
        RSIndexDataBase wrappers = null;
        if(objects != null)
            wrappers = (RSIndexDataBase)getWrapper(objects);
        return wrappers;
    }

    public static RSIndexDataBase getSkin_ref() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("Sequence", "skin_ref", null);
        RSIndexDataBase wrappers = null;
        if(objects != null)
            wrappers = (RSIndexDataBase)getWrapper(objects);
        return wrappers;
    }

    public int[] getFrameIDs() {
        return (int[])AppletLoader.getSingleton().getFieldValue("Sequence", "frameIDs", ref);
    }

}
