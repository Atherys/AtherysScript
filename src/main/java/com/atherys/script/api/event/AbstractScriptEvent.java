package com.atherys.script.api.event;

import com.atherys.script.api.Script;
import com.atherys.script.api.ScriptService;
import com.atherys.script.api.library.ScriptLibrary;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.Event;
import org.spongepowered.api.event.cause.Cause;

public class AbstractScriptEvent<T extends Script> implements Event {
    private Cause cause;
    private T script;
    private ScriptLibrary library;
    private ScriptService service;

    protected AbstractScriptEvent(T script, ScriptService service) {
        this.script = script;
        this.library = script.getLibrary();
        this.service = service;
        this.cause = Cause.builder()
                .append(script)
                .append(library)
                .append(service)
                .build(Sponge.getCauseStackManager().getCurrentContext());
    }

    public T getScript() {
        return script;
    }

    public ScriptLibrary getLibrary() {
        return library;
    }

    public ScriptService getScriptService() {
        return service;
    }

    public Cause getCause() {
        return cause;
    }
}
