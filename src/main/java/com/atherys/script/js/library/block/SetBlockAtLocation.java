package com.atherys.script.js.library.block;

import org.spongepowered.api.block.BlockState;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

import java.util.function.BiFunction;

public class SetBlockAtLocation implements BiFunction<Location<World>, BlockState, Boolean> {
    @Override
    public Boolean apply(Location<World> worldLocation, BlockState state) {
        return worldLocation.setBlock(state);
    }
}
