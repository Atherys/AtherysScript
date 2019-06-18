package com.atherys.script.groovy;

import com.atherys.script.api.Script;
import com.atherys.script.api.library.ScriptLibrary;
import com.atherys.script.library.block.BlockLibrary;
import com.atherys.script.library.damage.DamageLibrary;
import com.atherys.script.library.entity.EntityLibrary;
import com.atherys.script.library.event.EventLibrary;
import com.atherys.script.library.item.ItemStackLibrary;
import com.atherys.script.library.location.LocationLibrary;
import com.atherys.script.library.player.PlayerLibrary;
import com.atherys.script.library.potion.PotionEffectLibrary;
import com.atherys.script.library.task.TaskLibrary;
import com.atherys.script.library.text.TextLibrary;
import com.atherys.script.library.util.UtilityLibrary;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class GroovyLibrary implements ScriptLibrary {

    private static GroovyLibrary instance = new GroovyLibrary();
    private GroovyLibrary() {
    }

    private ScriptEngine engine;

    @Override
    public ScriptEngine getEngine() {
        if (engine == null) {
            engine = new ScriptEngineManager().getEngineByName("groovy");
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

    @Override
    public Object run(Script script) {
        try {
            return getEngine().eval(script.getContents());
        } catch (ScriptException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static GroovyLibrary getInstance() {
        return instance;
    }
}
