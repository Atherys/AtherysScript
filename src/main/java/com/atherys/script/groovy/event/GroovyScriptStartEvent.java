package com.atherys.script.groovy.event;

import com.atherys.script.api.event.ScriptStartEvent;
import com.atherys.script.groovy.GroovyScript;

public class GroovyScriptStartEvent extends AbstractGroovyScriptEvent implements ScriptStartEvent<GroovyScript> {
    public GroovyScriptStartEvent(GroovyScript script) {
        super(script);
    }
}
