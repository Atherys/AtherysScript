
package com.atherys.script.library.damage;

import com.atherys.script.function.ScriptBiFunction;
import org.spongepowered.api.data.manipulator.immutable.entity.ImmutableFallingBlockData;
import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;
import org.spongepowered.api.event.cause.entity.damage.source.FallingBlockDamageSource;

/**
 * @jsfunc
 */
public class SetDamageSourceFallingBlock implements ScriptBiFunction<ImmutableFallingBlockData, DamageSource.DamageSourceBuilder, DamageSource.DamageSourceBuilder> {

    @Override
    public DamageSource.DamageSourceBuilder call(ImmutableFallingBlockData immutableFallingBlockData, DamageSource.DamageSourceBuilder builder) {
        if(builder instanceof FallingBlockDamageSource.Builder) {
            return ((FallingBlockDamageSource.Builder)builder).fallingBlock(immutableFallingBlockData);
        } else return null;
    }
}
