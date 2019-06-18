package com.atherys.script.library.effect;

import com.atherys.script.function.ScriptBiFunction;
import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleOptions;
import org.spongepowered.api.util.Color;

/**
 * @jsfunc
 */
public class SetParticleColor implements ScriptBiFunction<ParticleEffect.Builder, Color, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder call(ParticleEffect.Builder builder, Color color) {
        return builder.option(ParticleOptions.COLOR, color);
    }
}
