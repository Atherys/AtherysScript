package com.atherys.script.library.effect;

import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleOptions;
import org.spongepowered.api.util.Direction;

/**
 * @jsfunc
 */

public class SetParticleDirection implements ScriptBiFunction<ParticleEffect.Builder, String, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder call(ParticleEffect.Builder builder, String direction) {
        return builder.option(ParticleOptions.DIRECTION, Direction.valueOf(direction));
    }
}
