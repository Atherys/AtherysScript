package com.atherys.script.js.library.damage;

import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.event.cause.entity.damage.source.BlockDamageSource;
import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;
import org.spongepowered.api.event.cause.entity.damage.source.IndirectEntityDamageSource;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class SetDamageSourceProxySource implements BiFunction<Entity, DamageSource.DamageSourceBuilder, DamageSource.DamageSourceBuilder> {

    @Override
    public DamageSource.DamageSourceBuilder apply(Entity entity, DamageSource.DamageSourceBuilder builder) {
        if(builder instanceof IndirectEntityDamageSource.Builder) {
            return ((IndirectEntityDamageSource.Builder) builder).proxySource(entity);
        } else return null;
    }
}
