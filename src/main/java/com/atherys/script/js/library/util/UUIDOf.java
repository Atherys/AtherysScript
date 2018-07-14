package com.atherys.script.js.library.util;

import java.util.UUID;
import java.util.function.Function;

public class UUIDOf implements Function<String, UUID> {
    @Override
    public UUID apply(String s) {
        return UUID.fromString(s);
    }
}
