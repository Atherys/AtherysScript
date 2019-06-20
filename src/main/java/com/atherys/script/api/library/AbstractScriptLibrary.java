package com.atherys.script.api.library;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class AbstractScriptLibrary implements ScriptLibrary {
    private ScriptEngine engine;
    private final String language;

    protected AbstractScriptLibrary(String language) {
        this.language = language;
        engine = new ScriptEngineManager().getEngineByExtension(language);
        extendWithBaseLib();
    }

    @Override
    public ScriptEngine getEngine() {
        return engine;
    }

    public String getLanguage() {
        return language;
    }
}
