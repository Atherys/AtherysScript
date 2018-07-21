package com.atherys.script.js.library.damage;

import org.spongepowered.api.event.cause.entity.damage.source.BlockDamageSource;

import java.util.function.Supplier;

public class BlockDamageSourceBuilder implements Supplier<BlockDamageSource.Builder> {

    @Override
    public BlockDamageSource.Builder get(){
        return BlockDamageSource.builder();
    }
}
