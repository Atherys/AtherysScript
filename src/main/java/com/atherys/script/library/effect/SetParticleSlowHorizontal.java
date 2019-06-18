package com.atherys.script.library.effect;

import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleOptions;

/**
 * @jsfunc
 */
public class SetParticleSlowHorizontal implements ScriptBiFunction<ParticleEffect.Builder, Boolean, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder call(ParticleEffect.Builder builder, Boolean slow) {
        return builder.option(ParticleOptions.SLOW_HORIZONTAL_VELOCITY, slow);
    }
}
