package com.atherys.script.library.location;

import com.atherys.script.api.function.QuadFunction;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

/**
 * @jsfunc
 */
public class LocationOf implements QuadFunction<World, Double, Double, Double, Location<World>> {
    /**
     * Creates a new location from the provided parameters.
     *
     * @ex var world = getWorldByName("world");
     * @ex var location = locationOf(world, 160, 50.3, -100.43);
     */
    @Override
    public Location<World> call(World world, Double x, Double y, Double z) {
        return new Location<>(world, x, y, z);
    }
}
