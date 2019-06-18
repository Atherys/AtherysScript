package com.atherys.script.groovy;

import com.atherys.script.api.AbstractScript;
import com.atherys.script.api.Script;
import com.atherys.script.api.library.ScriptLibrary;

public class GroovyScript extends AbstractScript {
    public GroovyScript(String id, String contents) {
        super(id, contents, GroovyLibrary.getInstance());
    }
}
