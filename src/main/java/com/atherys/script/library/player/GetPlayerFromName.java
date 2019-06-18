package com.atherys.script.library.player;

import com.atherys.script.function.ScriptFunction;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.entity.living.player.Player;

/**
 * @jsfunc
 */
public class GetPlayerFromName implements ScriptFunction<String, Player> {
    @Override
    public Player call(String playerName) {
        return Sponge.getServer().getPlayer(playerName).orElse(null);
    }
}
