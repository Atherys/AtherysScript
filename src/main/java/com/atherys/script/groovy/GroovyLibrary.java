package com.atherys.script.groovy;

import com.atherys.script.api.Script;
import com.atherys.script.api.library.LibraryExtension;
import com.atherys.script.api.library.ScriptLibrary;
import com.atherys.script.groovy.library.LocationLibrary;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class GroovyLibrary implements ScriptLibrary {

    private static GroovyLibrary instance = new GroovyLibrary();
    private String libraryImport;
    private GroovyLibrary() {
        libraryImport = "";
    }

    private ScriptEngine engine;

    @Override
    public ScriptEngine getEngine() {
        if (engine == null) {
            engine = new ScriptEngineManager().getEngineByName("groovy");
            extendWith(new LocationLibrary());
        }
        return engine;
    }

    @Override
    public void extendWith(LibraryExtension extension) {
        libraryImport += "import static " + extension.getClass().getName() + ".*;\n";
    }

    public String getLibraryImport() {
        return libraryImport;
    }

    @Override
    public Object run(Script script) {
        try {
            return getEngine().eval(libraryImport + script.getContents());
        } catch (ScriptException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static GroovyLibrary getInstance() {
        return instance;
    }
}
