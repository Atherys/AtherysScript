package com.atherys.script.api.event;

import com.atherys.script.api.Script;
import com.atherys.script.api.ScriptService;
import com.atherys.script.api.library.ScriptLibrary;
import org.spongepowered.api.event.Event;

/**
 * A Script-related event which is triggered by a {@link ScriptService} when it is ready to accept {@link Script}
 * registrations.
 */
public interface ScriptRegistrationEvent<T extends Script> extends Event {

    ScriptService getScriptService();

    ScriptLibrary getLibrary();

    /**
     * Utility method for quickly register a script
     *
     * @param script The script to register
     */
    void register(T script);

}
