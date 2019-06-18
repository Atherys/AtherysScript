package com.atherys.script.library.block;

import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.block.BlockState;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

/**
 * @jsfunc
 */
public class SetBlockAtLocation implements ScriptBiFunction<Location<World>, BlockState, Boolean> {

    /**
     * Used to change the BlockState at the specified location
     *
     * @ex var location = locationOf( getWorldFromName("world"), 100, 50, 100 );
     * @ex var success = setBlockAtLocation( location, blockOf("minecraft:anvil") );
     *
     * @param worldLocation The location to change.
     * @param state The `BlockState` to change the location to.
     * @return Whether the application worked.
     */
    @Override
    public Boolean call(Location<World> worldLocation, BlockState state) {
        return worldLocation.setBlock(state);
    }
}
