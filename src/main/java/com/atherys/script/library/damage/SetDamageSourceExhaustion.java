package com.atherys.script.library.damage;

import com.atherys.script.function.ScriptBiFunction;
import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;

/**
 * @jsfunc
 */
public class SetDamageSourceExhaustion implements ScriptBiFunction<DamageSource.DamageSourceBuilder, Double, DamageSource.DamageSourceBuilder> {

    @Override
    public DamageSource.DamageSourceBuilder call(DamageSource.DamageSourceBuilder damageSourceBuilder, Double exhaustion) {
        return damageSourceBuilder.exhaustion(exhaustion);
    }
}