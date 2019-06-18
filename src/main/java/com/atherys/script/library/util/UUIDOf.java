package com.atherys.script.library.util;

import com.atherys.script.function.ScriptFunction;

import java.util.UUID;

;

/**
 * @jsfunc
 */
public class UUIDOf implements ScriptFunction<String, UUID> {
    @Override
    public UUID call(String s) {
        return UUID.fromString(s);
    }
}
