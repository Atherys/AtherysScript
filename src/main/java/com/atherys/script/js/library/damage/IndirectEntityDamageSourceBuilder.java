package com.atherys.script.js.library.damage;

import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.event.cause.entity.damage.source.EntityDamageSource;
import org.spongepowered.api.event.cause.entity.damage.source.IndirectEntityDamageSource;

import java.util.function.Function;
import java.util.function.Supplier;

public class IndirectEntityDamageSourceBuilder implements Supplier<IndirectEntityDamageSource.Builder> {

    @Override
    public IndirectEntityDamageSource.Builder get() {
        return IndirectEntityDamageSource.builder();
    }
}
