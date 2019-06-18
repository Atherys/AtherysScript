package com.atherys.script.function;

@FunctionalInterface
public interface ScriptFunction<T, R> {
    R call(T param);
}
