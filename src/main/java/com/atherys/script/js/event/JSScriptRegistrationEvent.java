package com.atherys.script.js.event;

import com.atherys.script.api.event.AbstractScriptRegistrationEvent;
import com.atherys.script.js.JSScript;
import com.atherys.script.js.JavaScriptLibrary;
import com.atherys.script.js.JavaScriptService;

public class JSScriptRegistrationEvent extends AbstractScriptRegistrationEvent<JSScript> {
    public JSScriptRegistrationEvent(JavaScriptService scriptService, JavaScriptLibrary library) {
        super(scriptService, library);
    }
}
