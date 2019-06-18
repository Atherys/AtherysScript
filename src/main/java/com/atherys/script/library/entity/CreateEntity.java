package com.atherys.script.library.entity;

import com.atherys.script.function.ScriptBiFunction;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityType;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

/**
 * @jsfunc
 */
public class CreateEntity implements ScriptBiFunction<String, Location<World>, Entity> {

    @Override
    public Entity call(String entityType, Location<World> worldLocation) {
        return Sponge.getRegistry().getType(EntityType.class, entityType).map( type -> worldLocation.getExtent().createEntity(type, worldLocation.getPosition())).orElse(null);
    }

}
