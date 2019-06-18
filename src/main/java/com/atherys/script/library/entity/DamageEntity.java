package com.atherys.script.library.entity;

import com.atherys.script.api.function.TriFunction;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;

/**
 * @jsfunc
 */
public class DamageEntity implements TriFunction<Entity, DamageSource, Double, Boolean> {
    @Override
    public Boolean call(Entity entity, DamageSource src, Double damage) {
        return entity.damage(damage, src);
    }
}
