package com.atherys.script.library.location;

import com.atherys.script.api.function.ScriptFunction;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.world.World;

;

/**
 * @jsfunc
 */
public class GetWorldFromName implements ScriptFunction<String, World> {
    /**
     * Used to get a world by it's name. The default world name is usually world.
     *
     * @ex var world = getWorldByName("world");
     *
     * @param worldName
     * @return
     */
    @Override
    public World call(String worldName) {
        return Sponge.getServer().getWorld(worldName).orElse(null);
    }
}
