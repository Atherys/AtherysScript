package com.atherys.script.api.event;

import com.atherys.script.api.Script;
import com.atherys.script.api.ScriptService;
import com.atherys.script.api.library.ScriptLibrary;
import org.spongepowered.api.event.Event;

public interface ScriptEvent<T extends Script> extends Event {

    T getScript();

    ScriptLibrary getLibrary();

    ScriptService getScriptService();

}
