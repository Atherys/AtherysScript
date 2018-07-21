package com.atherys.script.js.library.damage;

import org.spongepowered.api.event.cause.entity.damage.source.BlockDamageSource;
import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;
import org.spongepowered.api.event.cause.entity.damage.source.EntityDamageSource;
import org.spongepowered.api.event.cause.entity.damage.source.IndirectEntityDamageSource;

import java.util.function.Function;

public class SetDamageSourceBypassArmor implements Function<DamageSource.DamageSourceBuilder, DamageSource.DamageSourceBuilder> {

    @Override
    public DamageSource.DamageSourceBuilder apply(DamageSource.DamageSourceBuilder damageSourceBuilder) {
        return damageSourceBuilder.bypassesArmor();
    }
}
