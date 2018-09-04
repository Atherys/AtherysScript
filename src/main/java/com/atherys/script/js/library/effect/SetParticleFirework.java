package com.atherys.script.js.library.effect;


import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleOptions;
import org.spongepowered.api.item.FireworkEffect;

import java.util.Arrays;
import java.util.function.BiFunction;

public class SetParticleFirework implements BiFunction<ParticleEffect.Builder, FireworkEffect[], ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder apply(ParticleEffect.Builder builder, FireworkEffect[] fireworks) {
        return builder.option(ParticleOptions.FIREWORK_EFFECTS, Arrays.asList(fireworks));
    }
}
