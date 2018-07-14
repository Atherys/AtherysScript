package com.atherys.script.js.library.entity;

import org.spongepowered.api.entity.Entity;

import java.util.UUID;
import java.util.function.Function;

public class GetEntityUUID implements Function<Entity, UUID> {
    public UUID apply(Entity entity){
        return entity.getUniqueId();
    }
}
