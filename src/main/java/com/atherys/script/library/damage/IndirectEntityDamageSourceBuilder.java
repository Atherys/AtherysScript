package com.atherys.script.library.damage;

import com.atherys.script.function.ScriptSupplier;
import org.spongepowered.api.event.cause.entity.damage.source.IndirectEntityDamageSource;

/**
 * @jsfunc
 */
public class IndirectEntityDamageSourceBuilder implements ScriptSupplier<IndirectEntityDamageSource.Builder> {

    @Override
    public IndirectEntityDamageSource.Builder call() {
        return IndirectEntityDamageSource.builder();
    }
}
