package com.atherys.script.library.entity;

import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.effect.potion.PotionEffect;
import org.spongepowered.api.entity.Entity;

import java.util.Arrays;

/**
 * @jsfunc
 */
public class SetEntityPotionEffects implements ScriptBiFunction<Entity, PotionEffect[],Boolean> {
    public Boolean call(Entity entity, PotionEffect[] effects){
        return entity.offer(Keys.POTION_EFFECTS, Arrays.asList(effects)).isSuccessful();
    }
}
