package com.atherys.script.listener;

import com.atherys.script.js.event.JSScriptReloadEvent;
import org.spongepowered.api.event.Listener;

public class InternalListener {

    @Listener
    public void onScriptReload(JSScriptReloadEvent event) {
        event.getScript().run();
    }

}
