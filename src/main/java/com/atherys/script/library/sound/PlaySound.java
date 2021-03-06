package com.atherys.script.library.sound;

import com.atherys.core.utils.Sound;
import com.atherys.script.api.function.ScriptTriFunction;
import com.flowpowered.math.vector.Vector3d;
import org.spongepowered.api.effect.Viewer;

/**
 * @jsfunc
 */
public class PlaySound implements ScriptTriFunction<Viewer, Sound, Vector3d, Boolean> {

    @Override
    public Boolean call(Viewer viewer, Sound sound, Vector3d position) {
        Sound.playSound(sound, viewer, position);
        return true;
    }
}
