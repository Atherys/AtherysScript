package com.atherys.script.library.block;

import com.atherys.script.function.ScriptFunction;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.block.BlockState;
import org.spongepowered.api.block.BlockType;

;


/**
 * @jsfunc
 */
public class BlockOf implements ScriptFunction<String, BlockState> {

    /**
     * Used to create a new [`BlockState`](https://jd.spongepowered.org/7.0.0/org/spongepowered/api/block/BlockState.html) from a block type id.
     *
     * @ex var block = blockOf("minecraft:anvil");
     *
     * @param blockTypeId The block id.
     * @return The `BlockState` for the given id, or null.
     */
    @Override
    public BlockState call(String blockTypeId) {
        return Sponge.getRegistry().getType(BlockType.class, blockTypeId).map(type -> BlockState.builder().blockType(type).build()).orElse(null);
    }
}
