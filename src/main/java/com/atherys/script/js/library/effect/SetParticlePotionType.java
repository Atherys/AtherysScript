package com.atherys.script.js.library.effect;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleOptions;
import org.spongepowered.api.effect.potion.PotionEffectType;

import java.util.function.BiFunction;

/**
 * @jsfunc
 */
public class SetParticlePotionType implements BiFunction<ParticleEffect.Builder, String, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder apply(ParticleEffect.Builder builder, String potionTypeId) {
        return Sponge.getRegistry().getType(PotionEffectType.class, potionTypeId).map(potionEffectType -> {
           return builder.option(ParticleOptions.POTION_EFFECT_TYPE, potionEffectType);
        }).orElse(builder);
    }
}
