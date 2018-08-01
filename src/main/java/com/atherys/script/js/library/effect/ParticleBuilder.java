package com.atherys.script.js.library.effect;

import org.spongepowered.api.effect.particle.ParticleEffect;

import java.util.function.Supplier;

public class ParticleBuilder implements Supplier<ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder get() {
        return ParticleEffect.builder();
    }
}
