package com.atherys.script.library.entity;

import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.text.Text;

/**
 * @jsfunc
 */
public class SetEntityName implements ScriptBiFunction<Entity, Text, Boolean> {
    public Boolean call(Entity entity, Text name){
        return entity.offer(Keys.DISPLAY_NAME, name).isSuccessful();
    }
}
