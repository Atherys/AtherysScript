package com.atherys.script.js.library.effect;

import org.spongepowered.api.effect.particle.ParticleEffect;

import java.util.function.Function;

/**
 * @jsfunc
 */
public class BuildParticleEffect implements Function<ParticleEffect.Builder, ParticleEffect> {

    @Override
    public ParticleEffect apply(ParticleEffect.Builder builder) {
        return builder.build();
    }
}
