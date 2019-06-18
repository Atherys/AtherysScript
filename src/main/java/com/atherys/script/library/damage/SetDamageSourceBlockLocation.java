package com.atherys.script.library.damage;

import com.atherys.script.function.ScriptBiFunction;
import org.spongepowered.api.event.cause.entity.damage.source.BlockDamageSource;
import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

/**
 * @jsfunc
 */
public class SetDamageSourceBlockLocation implements ScriptBiFunction<Location, DamageSource.DamageSourceBuilder, BlockDamageSource.Builder> {

    @Override
    public BlockDamageSource.Builder call(Location blockLocation, DamageSource.DamageSourceBuilder builder) {
        if (builder instanceof BlockDamageSource.Builder && blockLocation.getExtent() instanceof World) {
            return ((BlockDamageSource.Builder) builder).block(blockLocation);
        } else return null;
    }
}
