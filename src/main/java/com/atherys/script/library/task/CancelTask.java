package com.atherys.script.library.task;

import com.atherys.script.api.function.ScriptFunction;
import org.spongepowered.api.scheduler.Task;

;


public class CancelTask implements ScriptFunction<Task, Boolean> {
    @Override
    public Boolean call(Task task) {
        return task.cancel();
    }
}
