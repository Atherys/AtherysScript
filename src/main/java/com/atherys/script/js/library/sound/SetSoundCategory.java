package com.atherys.script.js.library.sound;

import com.atherys.core.utils.Sound;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.effect.sound.SoundCategory;

import java.util.function.BiFunction;

public class SetSoundCategory implements BiFunction<Sound.Builder, String, Sound.Builder> {

    @Override
    public Sound.Builder apply(Sound.Builder builder, String soundCategory) {
        return Sponge.getRegistry().getType(SoundCategory.class, soundCategory).map(category -> {
            return builder.soundCategory(category);
        }).orElse(null);
    }
}
