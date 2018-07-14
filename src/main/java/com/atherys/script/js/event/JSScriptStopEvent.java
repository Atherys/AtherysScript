package com.atherys.script.js.event;

import com.atherys.script.api.event.ScriptStopEvent;
import com.atherys.script.js.JSScript;

public class JSScriptStopEvent extends AbstractJSScriptEvent implements ScriptStopEvent<JSScript> {
    public JSScriptStopEvent(JSScript script) {
        super(script);
    }
}
