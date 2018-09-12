package com.atherys.script.js.library.damage;

import org.spongepowered.api.event.cause.entity.damage.source.FallingBlockDamageSource;

import java.util.function.Supplier;

/**
 * @jsfunc
 */
public class FallingBlockDamageSourceBuilder implements Supplier<FallingBlockDamageSource.Builder> {

    @Override
    public FallingBlockDamageSource.Builder get(){
        return FallingBlockDamageSource.builder();
    }
}
