package com.atherys.script.library.sound;

import com.atherys.core.utils.Sound;
import com.atherys.script.function.ScriptBiFunction;

/**
 * @jsfunc
 */
public class SetSoundMinVolume implements ScriptBiFunction<Sound.Builder, Double, Sound.Builder> {

    @Override
    public Sound.Builder call(Sound.Builder builder, Double minVolume) {
        return builder.minVolume(minVolume);
    }
}
