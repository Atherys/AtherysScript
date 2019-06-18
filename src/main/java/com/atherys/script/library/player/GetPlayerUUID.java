package com.atherys.script.library.player;

import com.atherys.script.api.function.ScriptFunction;
import org.spongepowered.api.entity.living.player.Player;

import java.util.UUID;

/**
 * @jsfunc
 */
public class GetPlayerUUID implements ScriptFunction<Player,UUID> {
    @Override
    public UUID call(Player player) {
        return player.getUniqueId();
    }
}
