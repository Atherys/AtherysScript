package com.atherys.script.js.event;

import com.atherys.script.api.ScriptService;
import com.atherys.script.api.event.ScriptRegistrationEvent;
import com.atherys.script.api.library.ScriptLibrary;
import com.atherys.script.js.JSScript;
import com.atherys.script.js.JavaScriptLibrary;
import com.atherys.script.js.JavaScriptService;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.cause.Cause;

public class JSScriptRegistrationEvent implements ScriptRegistrationEvent<JSScript> {

    private JavaScriptService service;
    private JavaScriptLibrary library;
    private Cause cause;

    public JSScriptRegistrationEvent(JavaScriptService scriptService, JavaScriptLibrary library) {
        this.service = scriptService;
        this.library = library;
        this.cause = Cause.builder()
                .append(scriptService)
                .append(library)
                .build(Sponge.getCauseStackManager().getCurrentContext());
    }

    @Override
    public ScriptService getScriptService() {
        return service;
    }

    @Override
    public ScriptLibrary getLibrary() {
        return library;
    }

    @Override
    public void register(JSScript script) {
        service.register(script);
    }

    @Override
    public Cause getCause() {
        return cause;
    }
}
