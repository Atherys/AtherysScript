package com.atherys.script.js.library.player;

import com.atherys.script.api.library.LibraryExtension;
import com.atherys.script.api.library.ScriptLibrary;

public final class PlayerLibrary implements LibraryExtension {

    @Override
    public void extend(ScriptLibrary library) {
        library.put("getPlayerFromName", new GetPlayerFromName());
        library.put("getPlayerFromUUID", new GetPlayerFromUUID());
        library.put("getPlayerLocation", new GetPlayerLocation());
        library.put("getPlayerUUID", new GetPlayerUUID());
        library.put("teleportPlayer", new TeleportPlayer());
    }

}
