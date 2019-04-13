package com.atherys.script.js.library.damage;

import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;
import org.spongepowered.api.event.cause.entity.damage.source.EntityDamageSource;

import java.util.function.BiFunction;

/**
 * @jsfunc
 */
public class SetDamageSourceEntity implements BiFunction<Entity, DamageSource.DamageSourceBuilder, DamageSource.DamageSourceBuilder> {

    @Override
    public DamageSource.DamageSourceBuilder apply(Entity entity, DamageSource.DamageSourceBuilder builder) {
        if(builder instanceof EntityDamageSource.EntityDamageSourceBuilder) {
            return ((EntityDamageSource.EntityDamageSourceBuilder) builder).entity(entity);
        } else return null;
    }
}
