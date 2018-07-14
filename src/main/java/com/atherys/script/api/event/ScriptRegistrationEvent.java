package com.atherys.script.api.event;

import com.atherys.script.api.Script;
import com.atherys.script.api.ScriptService;
import com.atherys.script.api.library.ScriptLibrary;
import org.spongepowered.api.event.Event;

public interface ScriptRegistrationEvent<T extends Script> extends Event {

    ScriptService getScriptService();

    ScriptLibrary getLibrary();

    void register(T script);

}
