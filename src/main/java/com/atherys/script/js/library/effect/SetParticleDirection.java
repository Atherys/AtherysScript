package com.atherys.script.js.library.effect;

import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleOptions;
import org.spongepowered.api.util.Direction;

/**
 * @jsfunc
 */
import java.util.function.BiFunction;

public class SetParticleDirection implements BiFunction<ParticleEffect.Builder, String, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder apply(ParticleEffect.Builder builder, String direction) {
        return builder.option(ParticleOptions.DIRECTION, Direction.valueOf(direction));
    }
}
