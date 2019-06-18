package com.atherys.script.api.function;

@FunctionalInterface
public interface ScriptConsumer<T> {
    void call(T t);
}
