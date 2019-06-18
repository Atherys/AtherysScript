package com.atherys.script.library.util;

import com.atherys.script.AtherysScript;
import com.atherys.script.function.ScriptConsumer;

/**
 * @jsfunc
 */
public class DebugOutput implements ScriptConsumer<String> {
    @Override
    public void call(String msg) {
        AtherysScript.getInstance().getLogger().debug(msg);
    }
}
