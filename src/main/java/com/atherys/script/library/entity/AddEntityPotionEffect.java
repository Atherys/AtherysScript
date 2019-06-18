package com.atherys.script.library.entity;

import com.atherys.script.function.ScriptBiFunction;
import org.spongepowered.api.data.manipulator.mutable.PotionEffectData;
import org.spongepowered.api.effect.potion.PotionEffect;
import org.spongepowered.api.entity.Entity;

/**
 * @jsfunc
 */
public class AddEntityPotionEffect implements ScriptBiFunction<Entity, PotionEffect, Boolean> {
    public Boolean call(Entity entity, PotionEffect potionEffect){
        PotionEffectData effects = entity.getOrCreate(PotionEffectData.class).get();
        effects.addElement(potionEffect);
        return entity.offer(effects).isSuccessful();
    }
}
