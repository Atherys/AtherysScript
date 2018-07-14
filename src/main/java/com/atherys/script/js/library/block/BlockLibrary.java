package com.atherys.script.js.library.block;

import com.atherys.script.api.library.LibraryExtension;
import com.atherys.script.api.library.ScriptLibrary;

public final class BlockLibrary implements LibraryExtension {

    @Override
    public void extend(ScriptLibrary library) {
        library.put("blockOf", new BlockOf());
        library.put("getBlockFromLocation", new GetBlockFromLocation());
        library.put("setBlockAtLocation", new SetBlockAtLocation());
    }

}
