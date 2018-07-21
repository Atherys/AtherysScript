package com.atherys.script.js.library.damage;

import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.event.cause.entity.damage.source.EntityDamageSource;

import java.util.function.Function;
import java.util.function.Supplier;

public class EntityDamageSourceBuilder implements Supplier<EntityDamageSource.Builder> {

    @Override
    public EntityDamageSource.Builder get() {
        return EntityDamageSource.builder();
    }
}
