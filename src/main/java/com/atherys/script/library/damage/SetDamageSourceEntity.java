package com.atherys.script.library.damage;

import com.atherys.script.function.ScriptBiFunction;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;
import org.spongepowered.api.event.cause.entity.damage.source.EntityDamageSource;

/**
 * @jsfunc
 */
public class SetDamageSourceEntity implements ScriptBiFunction<Entity, DamageSource.DamageSourceBuilder, DamageSource.DamageSourceBuilder> {

    @Override
    public DamageSource.DamageSourceBuilder call(Entity entity, DamageSource.DamageSourceBuilder builder) {
        if(builder instanceof EntityDamageSource.EntityDamageSourceBuilder) {
            return ((EntityDamageSource.EntityDamageSourceBuilder) builder).entity(entity);
        } else return null;
    }
}
