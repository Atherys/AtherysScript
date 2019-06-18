package com.atherys.script.library.entity;

import com.atherys.script.function.ScriptBiFunction;
import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.living.Living;

/**
 * @jsfunc
 */
public class SetEntityMaxHealth implements ScriptBiFunction<Entity, Double, Boolean> {
    public Boolean call(Entity entity, Double maxHealth){
        if (!(entity instanceof Living)) return false;
        return entity.offer(Keys.MAX_HEALTH, maxHealth).isSuccessful();
    }
}
