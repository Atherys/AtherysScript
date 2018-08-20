package com.atherys.script.js.library.sound;

import com.atherys.script.api.library.LibraryExtension;
import com.atherys.script.api.library.ScriptLibrary;

public class SoundLibrary implements LibraryExtension {

    @Override
    public void extend(ScriptLibrary library) {
        library.put("soundBuilder", new SoundBuilder());
        library.put("playSound", new PlaySound());
        library.put("buildSound", new BuildSound());
        library.put("setSoundCategory", new SetSoundCategory());
        library.put("setSoundMinVolume", new SetSoundMinVolume());
        library.put("setSoundPitch", new SetSoundPitch());
    }
}
