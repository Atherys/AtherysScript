package com.atherys.script.library.text;

import com.atherys.script.api.library.LibraryExtension;
import com.atherys.script.api.library.ScriptLibrary;

public final class TextLibrary implements LibraryExtension {

    @Override
    public void extend(ScriptLibrary library) {
        library.put("textOf", new TextOf());
    }

}
