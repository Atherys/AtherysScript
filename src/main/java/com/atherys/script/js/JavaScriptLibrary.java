package com.atherys.script.js;

import com.atherys.script.api.library.ScriptLibrary;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class JavaScriptLibrary implements ScriptLibrary {

    private static JavaScriptLibrary instance = new JavaScriptLibrary();

    private ScriptEngine engine;

    private JavaScriptLibrary() {
    }

    @Override
    public ScriptEngine getEngine() {
        if ( engine == null ) {
            engine = new ScriptEngineManager().getEngineByName("nashorn");
            extendWithBaseLib();
        }

        return engine;
    }

    public static JavaScriptLibrary getInstance() {
        return instance;
    }
}
