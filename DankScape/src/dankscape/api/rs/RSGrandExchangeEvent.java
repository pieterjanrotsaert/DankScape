/*
 * RSGrandExchangeEvent.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: t => java.lang.Object
public class RSGrandExchangeEvent extends RSClassWrapper {

    public RSGrandExchangeEvent(Object ref) {
        super(ref);
    }

    public int getWorld() {
        return (int)AppletLoader.getSingleton().getFieldValue("GrandExchangeEvent", "world", ref);
    }

    public java.lang.String getString1() {
        return (java.lang.String)AppletLoader.getSingleton().getFieldValue("GrandExchangeEvent", "string1", ref);
    }

    public java.lang.String getString2() {
        return (java.lang.String)AppletLoader.getSingleton().getFieldValue("GrandExchangeEvent", "string2", ref);
    }

    public RSGrandExchangeOffer getGrandExchangeOffer() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("GrandExchangeEvent", "grandExchangeOffer", ref);
        RSGrandExchangeOffer wrappers = null;
        if(objects != null)
            wrappers = (RSGrandExchangeOffer)getWrapper(objects);
        return wrappers;
    }

}
