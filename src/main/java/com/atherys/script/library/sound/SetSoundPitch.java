package com.atherys.script.library.sound;

import com.atherys.core.utils.Sound;
import com.atherys.script.function.ScriptBiFunction;

/**
 * @jsfunc
 */
public class SetSoundPitch implements ScriptBiFunction<Sound.Builder, Double, Sound.Builder> {

    @Override
    public Sound.Builder call(Sound.Builder builder, Double pitch) {
        return builder.pitch(pitch);
    }
}
