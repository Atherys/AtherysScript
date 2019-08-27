package com.atherys.script.library.effect;


import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleOptions;
import org.spongepowered.api.item.FireworkEffect;

import java.util.Arrays;
import java.util.List;

/**
 * @jsfunc
 */
public class SetParticleFirework implements ScriptBiFunction<ParticleEffect.Builder, List<FireworkEffect>, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder call(ParticleEffect.Builder builder, List<FireworkEffect> fireworks) {
        return builder.option(ParticleOptions.FIREWORK_EFFECTS, fireworks);
    }
}
