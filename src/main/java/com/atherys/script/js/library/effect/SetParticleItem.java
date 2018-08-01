package com.atherys.script.js.library.effect;

import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleOptions;
import org.spongepowered.api.item.inventory.ItemStack;

import java.util.function.BiFunction;

public class SetParticleItem implements BiFunction<ParticleEffect.Builder, ItemStack, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder apply(ParticleEffect.Builder builder, ItemStack item) {
        return builder.option(ParticleOptions.ITEM_STACK_SNAPSHOT, item.createSnapshot());
    }
}
