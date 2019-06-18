package com.atherys.script.library.effect;

import com.atherys.script.api.function.QuadFunction;
import org.spongepowered.api.effect.Viewer;
import org.spongepowered.api.effect.particle.ParticleEffect;
import org.spongepowered.api.world.Location;

/**
 * @jsfunc
 */
public class SpawnParticles implements QuadFunction<ParticleEffect, Location, Viewer, Integer, Boolean> {

    @Override
    public Boolean call(ParticleEffect particleEffect, Location location, Viewer viewer, Integer radius) {
        viewer.spawnParticles(particleEffect, location.getPosition(), radius);
        return true;
    }
}
