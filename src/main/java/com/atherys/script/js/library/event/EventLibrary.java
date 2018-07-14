package com.atherys.script.js.library.event;

import com.atherys.script.api.library.LibraryExtension;
import com.atherys.script.api.library.ScriptLibrary;
import com.atherys.script.js.event.JSScriptReloadEvent;
import com.atherys.script.js.event.JSScriptStartEvent;
import com.atherys.script.js.event.JSScriptStopEvent;
import org.spongepowered.api.event.entity.DamageEntityEvent;
import org.spongepowered.api.event.entity.MoveEntityEvent;

public final class EventLibrary implements LibraryExtension {

    @Override
    public void extend(ScriptLibrary library) {
        library.put("onEntityDamage", new EventHandlerFunction<>(DamageEntityEvent.class));
        library.put("onEntityMove", new EventHandlerFunction<>(MoveEntityEvent.class));
        library.put("onScriptStart", new EventHandlerFunction<>(JSScriptStartEvent.class));
        library.put("onScriptReload", new EventHandlerFunction<>(JSScriptReloadEvent.class));
        library.put("onScriptStop", new EventHandlerFunction<>(JSScriptStopEvent.class));
    }

}
