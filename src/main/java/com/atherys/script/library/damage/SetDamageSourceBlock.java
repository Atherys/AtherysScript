package com.atherys.script.library.damage;

import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.block.BlockSnapshot;
import org.spongepowered.api.event.cause.entity.damage.source.BlockDamageSource;
import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;

/**
 * @jsfunc
 */
public class SetDamageSourceBlock implements ScriptBiFunction<BlockSnapshot, DamageSource.DamageSourceBuilder, DamageSource.DamageSourceBuilder> {

    @Override
    public DamageSource.DamageSourceBuilder call(BlockSnapshot blockSnapshot, DamageSource.DamageSourceBuilder builder) {
        if (builder instanceof BlockDamageSource.Builder) {
            return ((BlockDamageSource.Builder) builder).block(blockSnapshot);
        } else return null;
    }
}
