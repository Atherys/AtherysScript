package com.atherys.script.groovy.event;

import com.atherys.script.api.ScriptService;
import com.atherys.script.api.event.AbstractScriptRegistrationEvent;
import com.atherys.script.api.library.ScriptLibrary;
import com.atherys.script.groovy.GroovyScript;

public class GroovyScriptRegistrationEvent extends AbstractScriptRegistrationEvent<GroovyScript> {
    public GroovyScriptRegistrationEvent(ScriptService<GroovyScript> scriptService, ScriptLibrary library) {
        super(scriptService, library);
    }
}
