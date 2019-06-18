package com.atherys.script.library.effect;

import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleType;

/**
 * @jsfunc
 */
public class SetParticleType implements ScriptBiFunction<ParticleEffect.Builder, String, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder call(ParticleEffect.Builder builder, String typeId) {
        return Sponge.getRegistry().getType(ParticleType.class, typeId).map(builder::type).orElse(null);
    }
}
