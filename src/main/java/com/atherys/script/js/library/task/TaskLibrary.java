package com.atherys.script.js.library.task;

import com.atherys.script.api.library.LibraryExtension;
import com.atherys.script.api.library.ScriptLibrary;

public final class TaskLibrary implements LibraryExtension {

    @Override
    public void extend(ScriptLibrary library) {
        library.put("buildTask", new TaskOf());
        library.put("setTaskDelay", new SetTaskDelay());
        library.put("setTaskInterval", new SetTaskInterval());
        library.put("setTaskExecutable", new SetTaskExecutable());
        library.put("startTask", new StartTask());
        library.put("cancelTask", new CancelTask());
    }

}
