package com.atherys.script.js.library.damage;

import org.spongepowered.api.event.cause.entity.damage.source.BlockDamageSource;
import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

import java.util.function.BiFunction;

/**
 * @jsfunc
 */
public class SetDamageSourceBlockLocation implements BiFunction<Location, DamageSource.DamageSourceBuilder, BlockDamageSource.Builder> {

    @Override
    public BlockDamageSource.Builder apply(Location blockLocation, DamageSource.DamageSourceBuilder builder) {
        if (builder instanceof BlockDamageSource.Builder && blockLocation.getExtent() instanceof World) {
            return ((BlockDamageSource.Builder) builder).block(blockLocation);
        } else return null;
    }
}
