package com.atherys.script.library.effect;

import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.block.BlockState;
import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleOptions;

/**
 * @jsfunc
 */
public class SetParticleBlockstate implements ScriptBiFunction<ParticleEffect.Builder, BlockState, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder call(ParticleEffect.Builder builder, BlockState blockState) {
        return builder.option(ParticleOptions.BLOCK_STATE, blockState);
    }
}

