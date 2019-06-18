package com.atherys.script.library.entity;

import com.atherys.script.api.function.ScriptFunction;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.living.Living;

/**
 * @jsfunc
 */
public class GetEntityHealth implements ScriptFunction<Entity, Double> {
    public Double call(Entity entity){
        if (!(entity instanceof Living)) return -1.0;
        return ((Living) entity).health().get();
    }
}
