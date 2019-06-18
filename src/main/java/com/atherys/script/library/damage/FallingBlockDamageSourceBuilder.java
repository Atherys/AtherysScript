package com.atherys.script.library.damage;

import com.atherys.script.api.function.ScriptSupplier;
import org.spongepowered.api.event.cause.entity.damage.source.FallingBlockDamageSource;

/**
 * @jsfunc
 */
public class FallingBlockDamageSourceBuilder implements ScriptSupplier<FallingBlockDamageSource.Builder> {

    @Override
    public FallingBlockDamageSource.Builder call(){
        return FallingBlockDamageSource.builder();
    }
}
