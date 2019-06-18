package com.atherys.script.library.effect;

import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleOptions;
import org.spongepowered.api.effect.potion.PotionEffectType;

/**
 * @jsfunc
 */
public class SetParticlePotionType implements ScriptBiFunction<ParticleEffect.Builder, String, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder call(ParticleEffect.Builder builder, String potionTypeId) {
        return Sponge.getRegistry().getType(PotionEffectType.class, potionTypeId).map(potionEffectType -> {
           return builder.option(ParticleOptions.POTION_EFFECT_TYPE, potionEffectType);
        }).orElse(builder);
    }
}
