package com.atherys.script.js.library.entity;

import com.atherys.script.api.util.TriFunction;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;

/**
 * @jsfunc
 */
public class DamageEntity implements TriFunction<Entity, DamageSource, Double, Boolean> {
    @Override
    public Boolean apply(Entity entity, DamageSource src, Double damage) {
        return entity.damage(damage, src);
    }
}
