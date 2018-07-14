package com.atherys.script.api.library;

public final class ScriptAddon<T> {

    private String key;
    private T object;

    public ScriptAddon(String key, T object) {
        this.key = key;
        this.object = object;
    }

    public static <T> ScriptAddon<T> of(String key, T object) {
        return new ScriptAddon<>(key, object);
    }

    public String getKey() {
        return key;
    }

    public T getObject() {
        return object;
    }

}
