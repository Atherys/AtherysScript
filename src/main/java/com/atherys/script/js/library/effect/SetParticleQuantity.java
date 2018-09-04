package com.atherys.script.js.library.effect;

import org.spongepowered.api.effect.particle.ParticleEffect;

import java.util.function.BiFunction;

public class SetParticleQuantity implements BiFunction<ParticleEffect.Builder, Integer, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder apply(ParticleEffect.Builder builder, Integer quantity) {
       return builder.quantity(quantity);
    }
}
