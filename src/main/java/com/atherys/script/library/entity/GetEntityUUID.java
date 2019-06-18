package com.atherys.script.library.entity;

import com.atherys.script.function.ScriptFunction;
import org.spongepowered.api.entity.Entity;

import java.util.UUID;

/**
 * @jsfunc
 */
public class GetEntityUUID implements ScriptFunction<Entity, UUID> {
    public UUID call(Entity entity){
        return entity.getUniqueId();
    }
}
