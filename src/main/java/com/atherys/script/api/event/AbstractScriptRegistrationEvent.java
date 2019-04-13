package com.atherys.script.api.event;

import com.atherys.script.api.Script;
import com.atherys.script.api.ScriptService;
import com.atherys.script.api.library.ScriptLibrary;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.cause.Cause;

public abstract class AbstractScriptRegistrationEvent<T extends Script> implements ScriptRegistrationEvent<T> {
    private ScriptService<T> service;
    private ScriptLibrary library;
    private Cause cause;

    public AbstractScriptRegistrationEvent(ScriptService<T> scriptService, ScriptLibrary library) {
        this.service = scriptService;
        this.library = library;
        this.cause = Cause.builder()
                .append(scriptService)
                .append(library)
                .build(Sponge.getCauseStackManager().getCurrentContext());
    }

    @Override
    public ScriptService<T> getScriptService() {
        return service;
    }

    @Override
    public ScriptLibrary getLibrary() {
        return library;
    }

    @Override
    public Cause getCause() {
        return cause;
    }

    @Override
    public void register(T script) {
       service.register(script);
    }
}


