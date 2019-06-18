package com.atherys.script.library.entity;

import com.atherys.script.function.ScriptFunction;
import org.spongepowered.api.entity.Entity;

/**
 * @jsfunc
 */
public class SpawnEntity implements ScriptFunction<Entity, Boolean> {
    @Override
    public Boolean call(Entity entity) {
        return entity.getWorld().spawnEntity(entity);
    }
}
