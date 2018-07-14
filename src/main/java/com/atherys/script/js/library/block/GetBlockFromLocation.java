package com.atherys.script.js.library.block;

import org.spongepowered.api.block.BlockState;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

import java.util.function.Function;

public class GetBlockFromLocation implements Function<Location<World>, BlockState> {
    @Override
    public BlockState apply(Location<World> worldLocation) {
        return worldLocation.getBlock();
    }
}
