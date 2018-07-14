package com.atherys.script.js.event;

import com.atherys.script.api.ScriptService;
import com.atherys.script.api.event.ScriptEvent;
import com.atherys.script.api.library.ScriptLibrary;
import com.atherys.script.js.JSScript;
import com.atherys.script.js.JavaScriptLibrary;
import com.atherys.script.js.JavaScriptService;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.cause.Cause;

public abstract class AbstractJSScriptEvent implements ScriptEvent<JSScript> {

    private Cause cause;
    private JSScript script;
    private ScriptLibrary library;
    private ScriptService service;

    protected AbstractJSScriptEvent(JSScript script) {
        this.script = script;
        this.library = JavaScriptLibrary.getInstance();
        this.service = JavaScriptService.getInstance();
        this.cause = Cause.builder()
                .append(script)
                .append(library)
                .append(service)
                .build(Sponge.getCauseStackManager().getCurrentContext());
    }

    @Override
    public JSScript getScript() {
        return script;
    }

    @Override
    public ScriptLibrary getLibrary() {
        return library;
    }

    @Override
    public ScriptService getScriptService() {
        return service;
    }

    @Override
    public Cause getCause() {
        return cause;
    }
}
