package com.atherys.script.library.effect;

import com.atherys.script.api.function.ScriptSupplier;
import org.spongepowered.api.effect.particle.ParticleEffect;

/**
 * @jsfunc
 */
public class ParticleBuilder implements ScriptSupplier<ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder call() {
        return ParticleEffect.builder();
    }
}
