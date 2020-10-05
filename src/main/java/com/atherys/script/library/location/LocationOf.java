package com.atherys.script.library.location;

import com.atherys.script.api.function.ScriptQuadFunction;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

/**
 * @jsfunc
 */
public class LocationOf implements ScriptQuadFunction<World, Double, Double, Double, Location<World>> {
    /**
     * Creates a new location from the provided parameters.
     *
     * @ex var world = getWorldFromName("world");
     * @ex var location = locationOf(world, 160, 50.3, -100.43);
     */
    @Override
    public Location<World> call(World world, Double x, Double y, Double z) {
        return new Location<>(world, x, y, z);
    }
}
