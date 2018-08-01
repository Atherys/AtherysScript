package com.atherys.script.js.library.effect;

import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleOptions;
import org.spongepowered.api.util.Color;

import java.util.function.BiFunction;

public class SetParticleColor implements BiFunction<ParticleEffect.Builder, Color, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder apply(ParticleEffect.Builder builder, Color color) {
        return builder.option(ParticleOptions.COLOR, color);
    }
}
