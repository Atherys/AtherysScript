package com.atherys.script.js.library.entity;

import org.spongepowered.api.entity.Entity;

import java.util.function.Function;

public class SpawnEntity implements Function<Entity, Boolean> {
    @Override
    public Boolean apply(Entity entity) {
        return entity.getWorld().spawnEntity(entity);
    }
}
