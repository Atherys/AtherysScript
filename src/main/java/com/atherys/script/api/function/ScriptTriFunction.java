package com.atherys.script.api.function;

@FunctionalInterface
public interface ScriptTriFunction<T1, T2, T3, R> {
    R call(T1 arg1, T2 arg2, T3 arg3);
}
