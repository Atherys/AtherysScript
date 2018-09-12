package com.atherys.script.js.library.sound;

import com.atherys.core.utils.Sound;

import java.util.function.Function;

/**
 * @jsfunc
 */
public class BuildSound implements Function<Sound.Builder, Sound> {

    @Override
    public Sound apply(Sound.Builder builder) {
        return builder.build();
    }
}
