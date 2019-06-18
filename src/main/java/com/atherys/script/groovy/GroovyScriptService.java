package com.atherys.script.groovy;

import com.atherys.script.AtherysScript;
import com.atherys.script.api.AbstractScriptService;
import com.atherys.script.groovy.event.GroovyScriptRegistrationEvent;
import com.atherys.script.groovy.event.GroovyScriptReloadEvent;
import com.atherys.script.groovy.event.GroovyScriptStartEvent;
import com.atherys.script.js.JavaScriptLibrary;
import com.atherys.script.library.event.EventHandlerFunction;
import org.spongepowered.api.Sponge;

public class GroovyScriptService extends AbstractScriptService<GroovyScript> {
    private static GroovyScriptService instance = new GroovyScriptService();
    private static String imports = "import java.util.function.Consumer;";

    private GroovyScriptService() {
        Sponge.getEventManager().post(new GroovyScriptRegistrationEvent(this, GroovyLibrary.getInstance()));
    }

    @Override
    public GroovyScript createScript(String id, String contents) {
        return new GroovyScript(id, imports + contents);
    }

    @Override
    public void startScripts() {
        AtherysScript.getInstance().getLogger().info("Starting Groovy scripts!");
        getScripts().forEach(script -> {
            JavaScriptLibrary.getInstance().getEngine().put("THIS", script);
            Sponge.getEventManager().post(new GroovyScriptStartEvent(script));
        });
    }

    @Override
    public void reloadScripts() {
        EventHandlerFunction.unregisterAll();
        getScripts().forEach(script -> Sponge.getEventManager().post(new GroovyScriptReloadEvent(script)));
    }

    @Override
    public void stopScripts() {
    }

    public static GroovyScriptService getInstance() {
        return instance;
    }
}
