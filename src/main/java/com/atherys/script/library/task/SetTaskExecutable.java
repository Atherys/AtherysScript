package com.atherys.script.library.task;

import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.scheduler.Task;

import java.util.function.Consumer;

/**
 * @jsfunc
 */
public class SetTaskExecutable implements ScriptBiFunction<Task.Builder, Consumer<Task>, Boolean> {

    @Override
    public Boolean call(Task.Builder builder, Consumer<Task> runnable) {
        builder.execute(runnable);
        return true;
    }
}
