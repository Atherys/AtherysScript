package com.atherys.script.function;

@FunctionalInterface
public interface ScriptConsumer<T> {
    void call(T t);
}
