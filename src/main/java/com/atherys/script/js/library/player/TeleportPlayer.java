package com.atherys.script.js.library.player;

import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

import java.util.function.BiFunction;

public class TeleportPlayer implements BiFunction<Player, Location<World>, Boolean> {
    @Override
    public Boolean apply(Player player, Location<World> location) {
        return player.setLocation(location);
    }
}
