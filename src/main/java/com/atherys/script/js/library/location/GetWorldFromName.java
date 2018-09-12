package com.atherys.script.js.library.location;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.world.World;

import java.util.function.Function;

/**
 * @jsfunc
 */
public class GetWorldFromName implements Function<String, World> {
    @Override
    public World apply(String worldName) {
        return Sponge.getServer().getWorld(worldName).orElse(null);
    }
}
