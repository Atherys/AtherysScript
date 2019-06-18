package com.atherys.script.api.function;

@FunctionalInterface
public interface ScriptFunction<T, R> {
    R call(T param);
}
