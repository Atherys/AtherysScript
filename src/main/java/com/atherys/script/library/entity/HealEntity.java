package com.atherys.script.library.entity;

import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.living.Living;

/**
 * @jsfunc
 */
public class HealEntity implements ScriptBiFunction<Entity, Double, Boolean> {
    @Override
    public Boolean call(Entity entity, Double amount) {
        return entity instanceof Living && entity.get(Keys.HEALTH).filter(health -> entity.offer(Keys.HEALTH, health + amount).isSuccessful()).isPresent();
    }
}
