package com.atherys.script.library.effect;


import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleOptions;
import org.spongepowered.api.item.FireworkEffect;

import java.util.Arrays;

/**
 * @jsfunc
 */
public class SetParticleFirework implements ScriptBiFunction<ParticleEffect.Builder, FireworkEffect[], ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder call(ParticleEffect.Builder builder, FireworkEffect[] fireworks) {
        return builder.option(ParticleOptions.FIREWORK_EFFECTS, Arrays.asList(fireworks));
    }
}
