package com.atherys.script.js.event;

import com.atherys.script.api.event.AbstractScriptEvent;
import com.atherys.script.js.JSScript;
import com.atherys.script.js.JavaScriptService;

public abstract class AbstractJSScriptEvent extends AbstractScriptEvent<JSScript> {
    public AbstractJSScriptEvent(JSScript script) {
        super(script, JavaScriptService.getInstance());
    }
}
