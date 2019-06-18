package com.atherys.script.api.function;

@FunctionalInterface
public interface ScriptBiFunction<T, U, R> {
    R call(T t, U u);
}
