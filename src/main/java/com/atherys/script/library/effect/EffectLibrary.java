package com.atherys.script.library.effect;

import com.atherys.script.api.library.LibraryExtension;
import com.atherys.script.api.library.ScriptLibrary;

public class EffectLibrary implements LibraryExtension {

    @Override
    public void extend(ScriptLibrary library) {
        library.put("spawnParticles", new SpawnParticles());
        library.put("particleBuilder", new ParticleBuilder());
        library.put("buildParticleEffect", new BuildParticleEffect());
        library.put("setParticleType", new SetParticleType());
        library.put("setParticleBlockState", new SetParticleBlockstate());
        library.put("setParticleColor", new SetParticleColor());
        library.put("setParticleDirection", new SetParticleDirection());
        library.put("setParticleFirework", new SetParticleFirework());
        library.put("setParticleItem", new SetParticleItem());
        library.put("setParticleNote", new SetParticleNote());
        library.put("setParticleOffset", new SetParticleOffset());
        library.put("setParticlePotion", new SetParticlePotionType());
        library.put("setParticleQuantity", new SetParticleQuantity());
        library.put("setParticleScale", new SetParticleScale());
        library.put("setParticleSlowHorizontal", new SetParticleSlowHorizontal());
        library.put("setParticleVelocity", new SetParticleVelocity());
    }
}
