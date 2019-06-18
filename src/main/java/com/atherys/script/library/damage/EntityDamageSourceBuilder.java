package com.atherys.script.library.damage;

import com.atherys.script.api.function.ScriptSupplier;
import org.spongepowered.api.event.cause.entity.damage.source.EntityDamageSource;

/**
 * @jsfunc
 */
public class EntityDamageSourceBuilder implements ScriptSupplier<EntityDamageSource.Builder> {

    @Override
    public EntityDamageSource.Builder call() {
        return EntityDamageSource.builder();
    }
}
