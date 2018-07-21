package com.atherys.script.js.library.damage;

import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;

import java.util.function.BiFunction;

public class SetDamageSourceExhaustion implements BiFunction<DamageSource.DamageSourceBuilder, Double, DamageSource.DamageSourceBuilder> {

    @Override
    public DamageSource.DamageSourceBuilder apply(DamageSource.DamageSourceBuilder damageSourceBuilder, Double exhaustion) {
        return damageSourceBuilder.exhaustion(exhaustion);
    }
}