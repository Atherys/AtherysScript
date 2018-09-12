package com.atherys.script.js.library.task;

import com.atherys.core.AtherysCore;
import org.spongepowered.api.scheduler.Task;

import java.util.function.Function;

/**
 * @jsfunc
 */
public class StartTask implements Function<Task.Builder, Task> {
    @Override
    public Task apply(Task.Builder builder) {
        return builder.submit(AtherysCore.getInstance());
    }
}
