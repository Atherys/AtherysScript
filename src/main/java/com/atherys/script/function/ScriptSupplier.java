package com.atherys.script.function;

@FunctionalInterface
public interface ScriptSupplier<R> {
    R call();
}
