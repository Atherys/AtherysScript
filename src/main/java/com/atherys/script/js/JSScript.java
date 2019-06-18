package com.atherys.script.js;

import com.atherys.script.api.AbstractScript;

public class JSScript extends AbstractScript {

    JSScript(String id, String contents) {
        super(id, contents, JavaScriptLibrary.getInstance());
    }

}
