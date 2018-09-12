package com.atherys.script.js.library.effect;

import com.atherys.script.api.util.QuadFunction;
import com.flowpowered.math.vector.Vector3d;
import org.spongepowered.api.effect.particle.ParticleEffect;

/**
 * @jsfunc
 */
public class SetParticleVelocity implements QuadFunction<ParticleEffect.Builder, Double, Double, Double, ParticleEffect.Builder> {

    @Override
    public ParticleEffect.Builder apply(ParticleEffect.Builder builder, Double x, Double y, Double z) {
        return builder.velocity(Vector3d.from(x, y, z));
    }
}
