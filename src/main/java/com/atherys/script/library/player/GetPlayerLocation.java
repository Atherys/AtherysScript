package com.atherys.script.library.player;

import com.atherys.script.function.ScriptFunction;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

/**
 * @jsfunc
 */
public class GetPlayerLocation implements ScriptFunction<Player, Location<World>> {
    @Override
    public Location<World> call(Player player) {
        return player.getLocation();
    }
}
