package com.atherys.script.js.library.entity;

import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.living.Living;

import java.util.function.BiFunction;

/**
 * @jsfunc
 */
public class HealEntity implements BiFunction<Entity, Double, Boolean> {
    @Override
    public Boolean apply(Entity entity, Double amount) {
        return entity instanceof Living && entity.get(Keys.HEALTH).filter(health -> entity.offer(Keys.HEALTH, health + amount).isSuccessful()).isPresent();
    }
}
