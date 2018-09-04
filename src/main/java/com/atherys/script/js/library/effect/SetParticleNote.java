package com.atherys.script.js.library.effect;


import org.spongepowered.api.Sponge;
import org.spongepowered.api.data.type.NotePitch;
import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.effect.particle.ParticleOptions;

import java.util.function.BiFunction;

public class SetParticleNote implements BiFunction<ParticleEffect.Builder, String, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder apply(ParticleEffect.Builder builder, String note) {
        return Sponge.getRegistry().getType(NotePitch.class, note).map(notePitch -> {
            return builder.option(ParticleOptions.NOTE, notePitch);
        }).orElse(builder);
    }
}
