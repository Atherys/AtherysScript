package com.atherys.script.js;

import com.atherys.script.api.library.AbstractScriptLibrary;

public class JavaScriptLibrary extends AbstractScriptLibrary {

    private static JavaScriptLibrary instance = new JavaScriptLibrary();

    private JavaScriptLibrary() {
        super("nashorn");
    }

    public static JavaScriptLibrary getInstance() {
        return instance;
    }
}
