package com.atherys.script.library.effect;


import com.atherys.script.function.ScriptBiFunction;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.data.type.NotePitch;
import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleOptions;

/**
 * @jsfunc
 */
public class SetParticleNote implements ScriptBiFunction<ParticleEffect.Builder, String, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder call(ParticleEffect.Builder builder, String note) {
        return Sponge.getRegistry().getType(NotePitch.class, note).map(notePitch -> {
            return builder.option(ParticleOptions.NOTE, notePitch);
        }).orElse(builder);
    }
}
