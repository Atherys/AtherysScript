package com.atherys.script.js;

import com.atherys.script.AtherysScript;
import com.atherys.script.api.AbstractScriptService;
import com.atherys.script.js.event.JSScriptRegistrationEvent;
import com.atherys.script.js.event.JSScriptReloadEvent;
import com.atherys.script.js.event.JSScriptStartEvent;
import com.atherys.script.js.event.JSScriptStopEvent;
import com.atherys.script.library.event.EventHandlerFunction;
import org.spongepowered.api.Sponge;

public class JavaScriptService extends AbstractScriptService<JSScript> {

    private static JavaScriptService instance = new JavaScriptService();

    private JavaScriptService() {
        Sponge.getEventManager().post(new JSScriptRegistrationEvent(this, JavaScriptLibrary.getInstance()));
    }

    @Override
    public JSScript createScript(String id, String contents) {
        return new JSScript(id, contents);
    }

    @Override
    public void startScripts() {
        AtherysScript.getInstance().getLogger().info("Starting JavaScript scripts!");
        getScripts().forEach(script -> {
            JavaScriptLibrary.getInstance().getEngine().put("THIS", script);
            Sponge.getEventManager().post(new JSScriptStartEvent(script));
        });
    }

    @Override
    public void reloadScripts() {
        EventHandlerFunction.unregisterAll();
        getScripts().forEach(script -> Sponge.getEventManager().post(new JSScriptReloadEvent(script)));
    }

    @Override
    public void stopScripts() {
        getScripts().forEach(script -> Sponge.getEventManager().post(new JSScriptStopEvent(script)));
    }

    public static JavaScriptService getInstance() {
        return instance;
    }
}
