package com.atherys.script.api;

import com.atherys.script.api.library.ScriptLibrary;

public abstract class AbstractScript implements Script {

    private String id;
    private String contents;

    private ScriptLibrary library;

    protected AbstractScript(String id, String contents, ScriptLibrary library) {
        this.id = id;
        this.contents = contents;
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
