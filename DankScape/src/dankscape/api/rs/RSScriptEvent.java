/*
 * RSScriptEvent.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;

// Original name: bn => gw (Node) => java.lang.Object
public class RSScriptEvent extends RSNode {

    public RSScriptEvent(Object ref) {
        super(ref);
    }

    public RSWidget getWidget() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("ScriptEvent", "widget", ref);
        RSWidget wrappers = null;
        if(objects != null)
            wrappers = (RSWidget)getWrapper(objects);
        return wrappers;
    }

    public java.lang.String getString() {
        return (java.lang.String)AppletLoader.getSingleton().getFieldValue("ScriptEvent", "string", ref);
    }

    public boolean getBoolean1() {
        return (boolean)AppletLoader.getSingleton().getFieldValue("ScriptEvent", "boolean1", ref);
    }

    public static RSMouseWheel getMouseWheel() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("ScriptEvent", "mouseWheel", null);
        RSMouseWheel wrappers = null;
        if(objects != null)
            wrappers = (RSMouseWheel)getWrapper(objects);
        return wrappers;
    }

    public java.lang.Object[] getObjs() {
        return (java.lang.Object[])AppletLoader.getSingleton().getFieldValue("ScriptEvent", "objs", ref);
    }

}
