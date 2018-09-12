package com.atherys.script.js.library.effect;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleType;

import java.util.function.BiFunction;

/**
 * @jsfunc
 */
public class SetParticleType implements BiFunction<ParticleEffect.Builder, String, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder apply(ParticleEffect.Builder builder, String typeId) {
        return Sponge.getRegistry().getType(ParticleType.class, typeId).map(builder::type).orElse(null);
    }
}
