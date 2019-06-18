package com.atherys.script.library.util;

import com.atherys.script.api.function.ScriptSupplier;

import java.util.UUID;

/**
 * @jsfunc
 */
public class RandomUUID implements ScriptSupplier<UUID> {
    @Override
    public UUID call() {
        return UUID.randomUUID();
    }
}
