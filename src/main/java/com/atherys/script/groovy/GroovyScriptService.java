package com.atherys.script.groovy;

import com.atherys.script.AtherysScript;
import com.atherys.script.api.AbstractScriptService;
import com.atherys.script.groovy.event.GroovyScriptRegistrationEvent;
import com.atherys.script.groovy.event.GroovyScriptStartEvent;
import com.atherys.script.js.JavaScriptLibrary;
import org.spongepowered.api.Sponge;

public class GroovyScriptService extends AbstractScriptService<GroovyScript> {
    private static GroovyScriptService instance = new GroovyScriptService();
    private GroovyScriptService() {
        Sponge.getEventManager().post(new GroovyScriptRegistrationEvent(this, GroovyLibrary.getInstance()));
    }

    @Override
    public GroovyScript createScript(String id, String contents) {
        return new GroovyScript(id, contents, GroovyLibrary.getInstance());
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

    }

    @Override
    public void stopScripts() {

    }

    public static GroovyScriptService getInstance() {
        return instance;
    }
}
