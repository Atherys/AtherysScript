package com.atherys.script.library.task;

import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.scheduler.Task;

/**
 * @jsfunc
 */
public class SetTaskInterval implements ScriptBiFunction<Task.Builder, Long, Boolean> {
    @Override
    public Boolean call(Task.Builder builder, Long ticks) {
        builder.intervalTicks(ticks);
        return true;
    }
}
