package com.atherys.script.library.damage;

import com.atherys.script.function.ScriptFunction;
import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;

/**
 * @jsfunc
 */
public class BuildDamageSource implements ScriptFunction<DamageSource.DamageSourceBuilder, DamageSource> {

    @Override
    public DamageSource call(DamageSource.DamageSourceBuilder builder) {
        return builder.build();
    }
}
