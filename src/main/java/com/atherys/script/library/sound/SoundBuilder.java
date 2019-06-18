package com.atherys.script.library.sound;

import com.atherys.core.utils.Sound;
import com.atherys.script.function.ScriptBiFunction;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.effect.sound.SoundType;

/**
 * @jsfunc
 */
public class SoundBuilder implements ScriptBiFunction<String, Double, Sound.Builder> {
    @Override
    public Sound.Builder call(String soundType, Double volume) {
        return Sponge.getRegistry().getType(SoundType.class, soundType).map(type -> Sound.builder(type, volume)).orElse(null);
    }
}
