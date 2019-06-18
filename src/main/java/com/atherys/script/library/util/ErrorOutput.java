package com.atherys.script.library.util;

import com.atherys.script.AtherysScript;
import com.atherys.script.api.function.ScriptConsumer;

/**
 * @jsfunc
 */
public class ErrorOutput implements ScriptConsumer<String> {
    @Override
    public void call(String msg) {
        AtherysScript.getInstance().getLogger().error(msg);
    }
}
