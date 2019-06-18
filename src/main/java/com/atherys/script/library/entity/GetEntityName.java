package com.atherys.script.library.entity;

import com.atherys.script.api.function.ScriptFunction;
import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.text.Text;

/**
 * @jsfunc
 */
public class GetEntityName implements ScriptFunction<Entity, Text> {
    public Text call(Entity entity){
        return entity.get(Keys.DISPLAY_NAME).get();
    }
}
