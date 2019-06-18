package com.atherys.script.library.potion;

import com.atherys.script.api.library.LibraryExtension;
import com.atherys.script.api.library.ScriptLibrary;

public final class PotionEffectLibrary implements LibraryExtension {

    @Override
    public void extend(ScriptLibrary library) {
        library.put("createPotionEffect", new CreatePotionEffect());
    }

}
