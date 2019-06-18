package com.atherys.script.library.sound;

import com.atherys.core.utils.Sound;
import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.effect.sound.SoundCategory;

/**
 * @jsfunc
 */
public class SetSoundCategory implements ScriptBiFunction<Sound.Builder, String, Sound.Builder> {

    @Override
    public Sound.Builder call(Sound.Builder builder, String soundCategory) {
        return Sponge.getRegistry().getType(SoundCategory.class, soundCategory).map(category -> {
            return builder.soundCategory(category);
        }).orElse(null);
    }
}
