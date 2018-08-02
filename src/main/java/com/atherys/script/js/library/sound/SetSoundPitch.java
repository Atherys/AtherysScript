package com.atherys.script.js.library.sound;

import com.atherys.core.utils.Sound;

import java.util.function.BiFunction;

public class SetSoundPitch implements BiFunction<Sound.Builder, Double, Sound.Builder> {

    @Override
    public Sound.Builder apply(Sound.Builder builder, Double pitch) {
        return builder.pitch(pitch);
    }
}
