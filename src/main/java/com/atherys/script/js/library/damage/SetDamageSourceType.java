package com.atherys.script.js.library.damage;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.cause.entity.damage.DamageType;
import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;

import java.util.Optional;
import java.util.function.Function;

/**
 * @jsfunc
 */
public class SetDamageSourceType implements Function<String, DamageSource.DamageSourceBuilder > {

    @Override
    public DamageSource.DamageSourceBuilder apply(String damageType) {
        Optional<DamageType> type = Sponge.getRegistry().getType(DamageType.class, damageType);
        return type.map(t -> DamageSource.builder().type(t)).orElse(null);
    }
}
