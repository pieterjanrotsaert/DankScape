/*
 * RSFontName.java
 * ---------------------------------------------------------------------------
 * Note: this file was automatically generated by the DankScape API Generator,
 * modifications to this file are useless as it will have to be regenerated often in the future.
 */

package dankscape.api.rs;

import dankscape.loader.AppletLoader;
import dankscape.api.internal.RSClassWrapper;

// Original name: jf => java.lang.Object
public class RSFontName extends RSClassWrapper {

    public RSFontName(Object ref) {
        super(ref);
    }

    public static RSFontName getFontName_bold12() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("FontName", "FontName_bold12", null);
        RSFontName wrappers = null;
        if(objects != null)
            wrappers = (RSFontName)getWrapper(objects);
        return wrappers;
    }

    public static RSFontName getFontName_plain12() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("FontName", "FontName_plain12", null);
        RSFontName wrappers = null;
        if(objects != null)
            wrappers = (RSFontName)getWrapper(objects);
        return wrappers;
    }

    public static RSFontName getFontName_plain11() {
        Object objects = (Object)AppletLoader.getSingleton().getFieldValue("FontName", "FontName_plain11", null);
        RSFontName wrappers = null;
        if(objects != null)
            wrappers = (RSFontName)getWrapper(objects);
        return wrappers;
    }

}
