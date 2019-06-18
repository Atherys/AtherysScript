package com.atherys.script.library.effect;

import com.atherys.script.api.function.ScriptQuadFunction;
import com.flowpowered.math.vector.Vector3d;
import org.spongepowered.api.effect.particle.ParticleEffect;

/**
 * @jsfunc
 */
public class SetParticleVelocity implements ScriptQuadFunction<ParticleEffect.Builder, Double, Double, Double, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder call(ParticleEffect.Builder builder, Double x, Double y, Double z) {
        return builder.velocity(Vector3d.from(x, y, z));
    }
}
