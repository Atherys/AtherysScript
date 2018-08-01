package com.atherys.script.js.library.effect;

import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleOptions;

import java.util.function.BiFunction;

public class SetParticleSlowHorizontal implements BiFunction<ParticleEffect.Builder, Boolean, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder apply(ParticleEffect.Builder builder, Boolean slow) {
        return builder.option(ParticleOptions.SLOW_HORIZONTAL_VELOCITY, slow);
    }
}
