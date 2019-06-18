package com.atherys.script.library.task;

import com.atherys.script.function.ScriptBiFunction;
import org.spongepowered.api.scheduler.Task;

/**
 * @jsfunc
 */
public class SetTaskDelay implements ScriptBiFunction<Task.Builder, Long, Boolean> {
    @Override
    public Boolean call(Task.Builder builder, Long ticks) {
        builder.delayTicks(ticks);
        return true;
    }
}
