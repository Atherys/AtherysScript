package com.atherys.script.js.library.sound;

import com.atherys.core.utils.Sound;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.effect.sound.SoundType;

import java.util.function.BiFunction;

/**
 * @jsfunc
 */
public class SoundBuilder implements BiFunction<String, Double, Sound.Builder> {
    @Override
    public Sound.Builder apply(String soundType, Double volume) {
        return Sponge.getRegistry().getType(SoundType.class, soundType).map(type -> Sound.builder(type, volume)).orElse(null);
    }
}
