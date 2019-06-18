package com.atherys.script.api.function;

@FunctionalInterface
public interface ScriptSupplier<R> {
    R call();
}
