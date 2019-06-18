package com.atherys.script.library.effect;

import com.atherys.script.function.ScriptBiFunction;
import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleOptions;

/**
 * @jsfunc
 */
public class SetParticleScale implements ScriptBiFunction<ParticleEffect.Builder, Double, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder call(ParticleEffect.Builder builder, Double scale) {
        return builder.option(ParticleOptions.SCALE, scale);
    }
}
