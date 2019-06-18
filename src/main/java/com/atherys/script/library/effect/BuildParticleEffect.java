package com.atherys.script.library.effect;

import com.atherys.script.function.ScriptFunction;
import org.spongepowered.api.effect.particle.ParticleEffect;

/**
 * @jsfunc
 */
public class BuildParticleEffect implements ScriptFunction<ParticleEffect.Builder, ParticleEffect> {

    @Override
    public ParticleEffect call(ParticleEffect.Builder builder) {
        return builder.build();
    }
}
