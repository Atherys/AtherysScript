package com.atherys.script.js.library.block;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.block.BlockState;
import org.spongepowered.api.block.BlockType;

import java.util.function.Function;

/**
 * @jsfunc
 */
public class BlockOf implements Function<String, BlockState> {

    /**
     * Used to create a new [`BlockState`](https://jd.spongepowered.org/7.0.0/org/spongepowered/api/block/BlockState.html) from a block type id.
     *
     * @ex var block = blockOf("minecraft:anvil");
     *
     * @param blockTypeId The block id.
     * @return The `BlockState` for the given id, or null.
     */
    @Override
    public BlockState apply(String blockTypeId) {
        return Sponge.getRegistry().getType(BlockType.class, blockTypeId).map(type -> BlockState.builder().blockType(type).build()).orElse(null);
    }
}
