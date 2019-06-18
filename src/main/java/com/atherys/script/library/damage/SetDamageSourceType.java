package com.atherys.script.library.damage;

import com.atherys.script.api.function.ScriptFunction;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.cause.entity.damage.DamageType;
import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;

import java.util.Optional;

/**
 * @jsfunc
 */
public class SetDamageSourceType implements ScriptFunction<String, DamageSource.DamageSourceBuilder > {

    @Override
    public DamageSource.DamageSourceBuilder call(String damageType) {
        Optional<DamageType> type = Sponge.getRegistry().getType(DamageType.class, damageType);
        return type.map(t -> DamageSource.builder().type(t)).orElse(null);
    }
}
