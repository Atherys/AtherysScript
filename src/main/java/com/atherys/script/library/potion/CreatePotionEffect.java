package com.atherys.script.library.potion;

import com.atherys.script.api.function.ScriptPentaFunction;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.effect.potion.PotionEffect;
import org.spongepowered.api.effect.potion.PotionEffectType;

/**
 * @jsfunc
 */
public class CreatePotionEffect implements ScriptPentaFunction<String, Integer, Integer, Boolean, Boolean, PotionEffect> {

    @Override
    public PotionEffect call(String effectId, Integer amplification, Integer durationTicks, Boolean isAmbient, Boolean hasParticles) {
        return Sponge.getRegistry().getType(PotionEffectType.class, effectId).map( type -> {
            return PotionEffect.builder()
                    .potionType(type)
                    .amplifier(amplification)
                    .duration(durationTicks)
                    .ambience(isAmbient)
                    .particles(hasParticles)
                    .build();
        }).orElse(null);
    }
}
