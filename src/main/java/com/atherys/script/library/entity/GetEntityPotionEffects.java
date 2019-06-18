package com.atherys.script.library.entity;

import com.atherys.script.function.ScriptFunction;
import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.effect.potion.PotionEffect;
import org.spongepowered.api.entity.Entity;

import java.util.List;

/**
 * @jsfunc
 */
public class GetEntityPotionEffects implements ScriptFunction<Entity, List<PotionEffect>> {
    public List<PotionEffect> call(Entity entity){
        return entity.get(Keys.POTION_EFFECTS).get();
    }
}
