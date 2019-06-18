package com.atherys.script.library.damage;

import com.atherys.script.function.ScriptBiFunction;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.event.cause.entity.damage.source.DamageSource;
import org.spongepowered.api.event.cause.entity.damage.source.IndirectEntityDamageSource;

/**
 * @jsfunc 
 */
public class SetDamageSourceProxySource implements ScriptBiFunction<Entity, DamageSource.DamageSourceBuilder, DamageSource.DamageSourceBuilder> {

    @Override
    public DamageSource.DamageSourceBuilder call(Entity entity, DamageSource.DamageSourceBuilder builder) {
        if(builder instanceof IndirectEntityDamageSource.Builder) {
            return ((IndirectEntityDamageSource.Builder) builder).proxySource(entity);
        } else return null;
    }
}
