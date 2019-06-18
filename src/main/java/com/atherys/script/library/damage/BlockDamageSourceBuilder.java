package com.atherys.script.library.damage;

import com.atherys.script.api.function.ScriptSupplier;
import org.spongepowered.api.event.cause.entity.damage.source.BlockDamageSource;

/**
 * @jsfunc
 */
public class BlockDamageSourceBuilder implements ScriptSupplier<BlockDamageSource.Builder> {

    @Override
    public BlockDamageSource.Builder call(){
        return BlockDamageSource.builder();
    }
}
