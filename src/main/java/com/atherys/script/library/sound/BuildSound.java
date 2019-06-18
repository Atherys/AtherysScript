package com.atherys.script.library.sound;

import com.atherys.core.utils.Sound;
import com.atherys.script.function.ScriptFunction;

;


/**
 * @jsfunc
 */
public class BuildSound implements ScriptFunction<Sound.Builder, Sound> {

    @Override
    public Sound call(Sound.Builder builder) {
        return builder.build();
    }
}
