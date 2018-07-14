package com.atherys.script.js.library.task;

import org.spongepowered.api.scheduler.Task;

import java.util.function.BiFunction;

public class SetTaskExecutable implements BiFunction<Task.Builder, Runnable, Boolean> {

    @Override
    public Boolean apply(Task.Builder builder, Runnable runnable) {
        builder.execute(runnable);
        return true;
    }
}
