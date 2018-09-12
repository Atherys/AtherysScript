package com.atherys.script.js.library.damage;

import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;

import java.util.function.Function;

/**
 * @jsfunc
 */
public class BuildDamageSource implements Function<DamageSource.DamageSourceBuilder, DamageSource> {

    @Override
    public DamageSource apply(DamageSource.DamageSourceBuilder builder) {
        return builder.build();
    }
}
