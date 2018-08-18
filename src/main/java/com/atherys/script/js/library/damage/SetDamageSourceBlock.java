package com.atherys.script.js.library.damage;

import org.spongepowered.api.event.cause.entity.damage.source.BlockDamageSource;
import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;
import org.spongepowered.api.block.BlockSnapshot;

import java.util.function.BiFunction;
import java.util.function.Function;

public class SetDamageSourceBlock implements BiFunction<BlockSnapshot, DamageSource.DamageSourceBuilder, DamageSource.DamageSourceBuilder> {

    @Override
    public DamageSource.DamageSourceBuilder apply(BlockSnapshot blockSnapshot, DamageSource.DamageSourceBuilder builder) {
        if (builder instanceof BlockDamageSource.Builder) {
            return ((BlockDamageSource.Builder) builder).block(blockSnapshot);
        } else return null;
    }
}
