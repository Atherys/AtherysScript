package com.atherys.script.js.library.task;

import org.spongepowered.api.scheduler.Task;

import java.util.function.BiFunction;

/**
 * @jsfunc
 */
public class SetTaskDelay implements BiFunction<Task.Builder, Long, Boolean> {
    @Override
    public Boolean apply(Task.Builder builder, Long ticks) {
        builder.delayTicks(ticks);
        return true;
    }
}
