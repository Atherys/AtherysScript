package com.atherys.script.library.player;

import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

/**
 * @jsfunc
 */
public class TeleportPlayer implements ScriptBiFunction<Player, Location<World>, Boolean> {
    @Override
    public Boolean call(Player player, Location<World> location) {
        return player.setLocation(location);
    }
}
