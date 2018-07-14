package com.atherys.script.js.library.task;

import org.spongepowered.api.scheduler.Task;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class SetTaskExecutable implements BiFunction<Task.Builder, Consumer<Task>, Boolean> {

    @Override
    public Boolean apply(Task.Builder builder, Consumer<Task> runnable) {
        builder.execute(runnable);
        return true;
    }
}
