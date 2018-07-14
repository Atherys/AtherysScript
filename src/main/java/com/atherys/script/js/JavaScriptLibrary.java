package com.atherys.script.js;

import com.atherys.script.api.library.ScriptLibrary;
import com.atherys.script.js.library.block.BlockLibrary;
import com.atherys.script.js.library.damage.DamageLibrary;
import com.atherys.script.js.library.entity.EntityLibrary;
import com.atherys.script.js.library.event.EventLibrary;
import com.atherys.script.js.library.item.ItemStackLibrary;
import com.atherys.script.js.library.location.LocationLibrary;
import com.atherys.script.js.library.player.PlayerLibrary;
import com.atherys.script.js.library.potion.PotionEffectLibrary;
import com.atherys.script.js.library.task.TaskLibrary;
import com.atherys.script.js.library.text.TextLibrary;
import com.atherys.script.js.library.util.UtilityLibrary;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class JavaScriptLibrary implements ScriptLibrary {

    private static JavaScriptLibrary instance = new JavaScriptLibrary();

    private ScriptEngine engine;

    private JavaScriptLibrary() {
    }

    @Override
    public ScriptEngine getEngine() {
        if ( engine == null ) {
            engine = new ScriptEngineManager().getEngineByName("nashorn");

            extendWith(new BlockLibrary());
            extendWith(new DamageLibrary());
            extendWith(new EntityLibrary());
            extendWith(new EventLibrary());
            extendWith(new ItemStackLibrary());
            extendWith(new LocationLibrary());
            extendWith(new PlayerLibrary());
            extendWith(new PotionEffectLibrary());
            extendWith(new TaskLibrary());
            extendWith(new TextLibrary());
            extendWith(new UtilityLibrary());
        }

        return engine;
    }

    public static JavaScriptLibrary getInstance() {
        return instance;
    }
}
