var i = 0;

onScriptStart(function(event) {
    info("Script Started Event");

    var task = taskOf("started-script-task");
    setTaskDelay(3000);
    setTaskInterval(3000);
    setTaskExecutable(task, function(task) {
        info("Script Started and working!");

        if ( i == 10 ) {
            task.cancel();
        }

        i++;
    });

    startTask(task);
});

onScriptStop(function(event) {
    info("Script Stopped Event");
});