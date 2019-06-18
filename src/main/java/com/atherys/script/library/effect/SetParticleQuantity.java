package com.atherys.script.library.effect;

import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.effect.particle.ParticleEffect;

/**
 * @jsfunc
 */
public class SetParticleQuantity implements ScriptBiFunction<ParticleEffect.Builder, Integer, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder call(ParticleEffect.Builder builder, Integer quantity) {
       return builder.quantity(quantity);
    }
}
