package com.atherys.script.js.library.entity;

import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.effect.potion.PotionEffect;
import org.spongepowered.api.entity.Entity;

import java.util.function.Function;

/**
 * @jsfunc
 */
public class GetEntityPotionEffects implements Function<Entity, PotionEffect[]> {
    public PotionEffect[] apply(Entity entity){
        return (PotionEffect[])entity.get(Keys.POTION_EFFECTS).get().toArray();
    }
}
