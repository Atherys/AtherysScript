package com.atherys.script.function;

@FunctionalInterface
public interface ScriptBiFunction<T, U, R> {
    R call(T t, U u);
}
