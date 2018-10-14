package com.atherys.script.js.library.location;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.world.World;

import java.util.function.Function;

/**
 * @jsfunc
 */
public class GetWorldFromName implements Function<String, World> {
    /**
     * Used to get a world by it's name. The default world name is usually world.
     *
     * @ex var world = getWorldByName("world");
     *
     * @param worldName
     * @return
     */
    @Override
    public World apply(String worldName) {
        return Sponge.getServer().getWorld(worldName).orElse(null);
    }
}
