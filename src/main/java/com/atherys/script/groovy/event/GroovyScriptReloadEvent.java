package com.atherys.script.groovy.event;

import com.atherys.script.api.event.ScriptStartEvent;
import com.atherys.script.groovy.GroovyScript;

public class GroovyScriptReloadEvent extends AbstractGroovyScriptEvent implements ScriptStartEvent {
    public GroovyScriptReloadEvent(GroovyScript script) {
        super(script);
    }
}
