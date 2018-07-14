package com.atherys.script.js.event;

import com.atherys.script.api.event.ScriptStartEvent;
import com.atherys.script.js.JSScript;

public class JSScriptStartEvent extends AbstractJSScriptEvent implements ScriptStartEvent<JSScript> {
    public JSScriptStartEvent(JSScript script) {
        super(script);
    }
}
