package com.atherys.script.js.library.damage;

import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;

import java.util.function.Function;

/**
 * @jsfunc
 */
public class SetDamageSourceScale implements Function<DamageSource.DamageSourceBuilder, DamageSource.DamageSourceBuilder> {

    @Override
    public DamageSource.DamageSourceBuilder apply(DamageSource.DamageSourceBuilder damageSourceBuilder) {
        return damageSourceBuilder.scalesWithDifficulty();
    }
}
