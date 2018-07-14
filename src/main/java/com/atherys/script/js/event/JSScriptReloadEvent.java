package com.atherys.script.js.event;

import com.atherys.script.api.event.ScriptReloadEvent;
import com.atherys.script.js.JSScript;

public class JSScriptReloadEvent extends AbstractJSScriptEvent implements ScriptReloadEvent<JSScript> {
    public JSScriptReloadEvent(JSScript script) {
        super(script);
    }
}
