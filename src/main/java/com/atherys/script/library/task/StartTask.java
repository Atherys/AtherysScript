package com.atherys.script.library.task;

import com.atherys.core.AtherysCore;
import com.atherys.script.function.ScriptFunction;
import org.spongepowered.api.scheduler.Task;

;


/**
 * @jsfunc
 */
public class StartTask implements ScriptFunction<Task.Builder, Task> {
    @Override
    public Task call(Task.Builder builder) {
        return builder.submit(AtherysCore.getInstance());
    }
}
