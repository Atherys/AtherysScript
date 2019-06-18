package com.atherys.script.library.task;

import com.atherys.script.function.ScriptFunction;
import org.spongepowered.api.scheduler.Task;

;

/**
 * @jsfunc
 */
public class TaskOf implements ScriptFunction<String, Task.Builder> {
    @Override
    public Task.Builder call(String name) {
        return Task.builder().name(name);
    }
}
