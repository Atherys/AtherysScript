package com.atherys.script.groovy;

import com.atherys.script.api.library.AbstractScriptLibrary;

public class GroovyLibrary extends AbstractScriptLibrary {

    private static GroovyLibrary instance = new GroovyLibrary();

    private GroovyLibrary() {
        super("groovy");
    }

    public static GroovyLibrary getInstance() {
        return instance;
    }
}
