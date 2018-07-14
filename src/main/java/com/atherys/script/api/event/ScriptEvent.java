package com.atherys.script.api.event;

import com.atherys.script.api.Script;
import com.atherys.script.api.ScriptService;
import com.atherys.script.api.library.ScriptLibrary;
import org.spongepowered.api.event.Event;

/**
 * An event which is relevant to a script
 *
 * @param <T> An implementation type of {@link Script}
 */
public interface ScriptEvent<T extends Script> extends Event {

    /**
     * @return the script affected by this event
     */
    T getScript();

    /**
     * The library which can be used to run this script.
     *
     * @return The {@link ScriptLibrary}
     */
    ScriptLibrary getLibrary();

    /**
     * The ScriptService responsible for storing the script
     *
     * @return The {@link ScriptService}
     */
    ScriptService getScriptService();

}
