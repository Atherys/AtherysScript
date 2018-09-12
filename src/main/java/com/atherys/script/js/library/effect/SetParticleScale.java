package com.atherys.script.js.library.effect;

import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleOptions;

import java.util.function.BiFunction;

/**
 * @jsfunc
 */
public class SetParticleScale implements BiFunction<ParticleEffect.Builder, Double, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder apply(ParticleEffect.Builder builder, Double scale) {
        return builder.option(ParticleOptions.SCALE, scale);
    }
}
