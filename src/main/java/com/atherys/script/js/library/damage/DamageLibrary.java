package com.atherys.script.js.library.damage;

import com.atherys.script.api.library.LibraryExtension;
import com.atherys.script.api.library.ScriptLibrary;

public final class DamageLibrary implements LibraryExtension {

    @Override
    public void extend(ScriptLibrary library) {
        library.put("createDamageSource", new CreateDamageSource());
    }

}
