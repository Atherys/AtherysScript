package com.atherys.script.js.library.damage;

import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.event.cause.entity.damage.source.*;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class SetDamageSourceEntity implements BiFunction<Entity, DamageSource.DamageSourceBuilder, DamageSource.DamageSourceBuilder> {

    @Override
    public DamageSource.DamageSourceBuilder apply(Entity entity, DamageSource.DamageSourceBuilder builder) {
        if(builder instanceof EntityDamageSource.EntityDamageSourceBuilder) {
            return ((EntityDamageSource.EntityDamageSourceBuilder) builder).entity(entity);
        } else return null;
    }
}
