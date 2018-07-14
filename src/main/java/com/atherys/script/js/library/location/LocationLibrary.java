package com.atherys.script.js.library.location;

import com.atherys.script.api.library.LibraryExtension;
import com.atherys.script.api.library.ScriptLibrary;

public final class LocationLibrary implements LibraryExtension {

    @Override
    public void extend(ScriptLibrary library) {
        library.put("getWorldFromName", new GetWorldFromName());
        library.put("locationOf", new LocationOf());
    }

}
