package com.atherys.script.library.effect;

import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleOptions;
import org.spongepowered.api.item.inventory.ItemStack;

/**
 * @jsfunc
 */
public class SetParticleItem implements ScriptBiFunction<ParticleEffect.Builder, ItemStack, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder call(ParticleEffect.Builder builder, ItemStack item) {
        return builder.option(ParticleOptions.ITEM_STACK_SNAPSHOT, item.createSnapshot());
    }
}
