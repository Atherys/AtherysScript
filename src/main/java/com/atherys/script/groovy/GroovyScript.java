package com.atherys.script.groovy;

import com.atherys.script.api.Script;
import com.atherys.script.api.library.ScriptLibrary;

public class GroovyScript implements Script {
    private String contents;
    private String id;
    private ScriptLibrary library;

    protected GroovyScript(String id, String contents, GroovyLibrary library) {
        this.contents = contents;
        this.id = id;
        this.library = library;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getContents() {
        return contents;
    }

    @Override
    public ScriptLibrary getLibrary() {
        return library;
    }
}
