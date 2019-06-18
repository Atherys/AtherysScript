package com.atherys.script.library.player;

import com.atherys.script.api.function.ScriptFunction;
import org.spongepowered.api.entity.living.player.Player;

import java.util.UUID;

/**
 * @jsfunc
 */
public class GetPlayerFromUUID implements ScriptFunction<UUID, Player> {
    @Override
    public Player call(UUID uuid) {
        return null;
    }
}
