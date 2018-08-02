package com.atherys.script.js.library.effect;

import org.spongepowered.api.block.BlockState;
import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleOptions;

import java.util.function.BiFunction;

public class SetParticleBlockstate implements BiFunction<ParticleEffect.Builder, BlockState, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder apply(ParticleEffect.Builder builder, BlockState blockState) {
        return builder.option(ParticleOptions.BLOCK_STATE, blockState);
    }
}

