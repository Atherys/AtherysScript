package com.atherys.script.js.library.player;

import org.spongepowered.api.entity.living.player.Player;

import java.util.UUID;
import java.util.function.Function;

public class GetPlayerUUID implements Function<Player,UUID> {
    @Override
    public UUID apply(Player player) {
        return player.getUniqueId();
    }
}
