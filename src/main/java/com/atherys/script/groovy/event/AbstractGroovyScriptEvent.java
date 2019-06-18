package com.atherys.script.groovy.event;

import com.atherys.script.api.event.AbstractScriptEvent;
import com.atherys.script.groovy.GroovyScript;
import com.atherys.script.groovy.GroovyScriptService;

public class AbstractGroovyScriptEvent extends AbstractScriptEvent<GroovyScript> {
    protected AbstractGroovyScriptEvent(GroovyScript script) {
        super(script, GroovyScriptService.getInstance());
    }
}
