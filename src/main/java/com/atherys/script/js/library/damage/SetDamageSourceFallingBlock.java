
package com.atherys.script.js.library.damage;

import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;
import org.spongepowered.api.data.manipulator.immutable.entity.ImmutableFallingBlockData;
import org.spongepowered.api.event.cause.entity.damage.source.FallingBlockDamageSource;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @jsfunc
 */
public class SetDamageSourceFallingBlock implements BiFunction<ImmutableFallingBlockData, DamageSource.DamageSourceBuilder, DamageSource.DamageSourceBuilder> {

    @Override
    public DamageSource.DamageSourceBuilder apply(ImmutableFallingBlockData immutableFallingBlockData, DamageSource.DamageSourceBuilder builder) {
        if(builder instanceof FallingBlockDamageSource.Builder) {
            return ((FallingBlockDamageSource.Builder)builder).fallingBlock(immutableFallingBlockData);
        } else return null;
    }
}
