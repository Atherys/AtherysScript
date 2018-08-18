package com.atherys.script.js.library.util;

import com.atherys.script.api.library.LibraryExtension;
import com.atherys.script.api.library.ScriptLibrary;

public final class UtilityLibrary implements LibraryExtension {

    @Override
    public void extend(ScriptLibrary library) {
        library.put("uuidOf", new UUIDOf());
        library.put("randomUUID", new RandomUUID());
        library.put("info", new InfoOutput());
        library.put("warn", new WarningOutput());
        library.put("error", new ErrorOutput());
        library.put("debug", new DebugOutput());
        library.put("listOf", new ListOf<>());
    }

}
