package com.atherys.script.groovy.library;

import com.atherys.script.api.library.LibraryExtension;
import com.atherys.script.api.library.ScriptLibrary;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

public class LocationLibrary implements LibraryExtension {
    @Override
    public void extend(ScriptLibrary library) {
    }

    public static Location<World> locationOf(World world, Double x, Double y, Double z) {
        return new Location<>(world, x, y, z);
    }

    public static World getWorldFromName(String worldName) {
        return Sponge.getServer().getWorld(worldName).orElse(null);
    }
}
