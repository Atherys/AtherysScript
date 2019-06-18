package com.atherys.script.groovy;

import com.atherys.script.api.library.ScriptLibrary;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class GroovyLibrary implements ScriptLibrary {

    private static GroovyLibrary instance = new GroovyLibrary();
    private GroovyLibrary() {
    }

    private ScriptEngine engine;

    @Override
    public ScriptEngine getEngine() {
        if (engine == null) {
            engine = new ScriptEngineManager().getEngineByName("groovy");
            extendWithBaseLib();
        }
        return engine;
    }

    public static GroovyLibrary getInstance() {
        return instance;
    }
}
