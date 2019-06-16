package com.atherys.script;

import com.atherys.core.command.CommandService;
import com.atherys.script.api.ScriptService;
import com.atherys.script.command.SRunCommand;
import com.atherys.script.js.JavaScriptService;
import com.atherys.script.listener.InternalListener;
import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.GameReloadEvent;
import org.spongepowered.api.event.game.state.GameInitializationEvent;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.game.state.GameStoppingServerEvent;
import org.spongepowered.api.plugin.Dependency;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.plugin.PluginContainer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import static com.atherys.script.AtherysScript.*;

@Plugin(id = ID, name = NAME, description = DESCRIPTION, version = VERSION, dependencies = {
        @Dependency(id = "atheryscore")
})
public class AtherysScript {

    static final String ID = "atherysscript";
    static final String NAME = "AtherysScript";
    static final String DESCRIPTION = "A plugin to provide scripting utilities for the A'therys Horizons server.";
    static final String VERSION = "1.0.0a";

    private static AtherysScript instance;

    private static boolean init = false;

    @Inject
    private PluginContainer container;

    @Inject
    private Logger logger;

    private ScriptService scriptService;

    private ScriptConfig config;

    private void init() {
        instance = this;

        try {
            config = new ScriptConfig("config/" + ID, "config.conf");
            config.init();
        } catch (IOException e) {
            init = false;
            e.printStackTrace();
            return;
        }

        if (config.SCRIPT_TYPE.equals(ScriptConfig.JAVASCRIPT_TYPE)) {
            scriptService = JavaScriptService.getInstance();
        }

        if ( scriptService == null ) {
            logger.error("Failed to instantiate ScriptService: No valid script type provided in config.");
            return;
        }

        Sponge.getEventManager().registerListeners(this, new InternalListener());

        init = true;
    }

    private void start() {
        try {
            CommandService.getInstance().register(new SRunCommand(), this);
        } catch (CommandService.AnnotatedCommandException e) {
            e.printStackTrace();
        }

        try {
            scriptService.registerFolder(Paths.get(config.SCRIPT_DIRECTORY));
            scriptService.startScripts();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void stop() {
        scriptService.stopScripts();
    }

    private void reload() {
        scriptService.reloadScripts();
    }

    @Listener
    public void onInit(GameInitializationEvent event) {
        init();
    }

    @Listener
    public void onStart(GameStartedServerEvent event) {
        if (init) start();
    }

    @Listener
    public void onStop(GameStoppingServerEvent event) {
        if (init) stop();
    }

    @Listener
    public void onReload(GameReloadEvent event) { if (init) reload(); }

    public Logger getLogger() {
        return logger;
    }

    public ScriptService scriptService() {
        return scriptService;
    }

    public ScriptConfig config() {
        return config;
    }

    public static ScriptService getScriptService() {
        return getInstance().scriptService();
    }

    public static ScriptConfig getConfig() {
        return getInstance().config();
    }

    public static AtherysScript getInstance() {
        return instance;
    }
}
