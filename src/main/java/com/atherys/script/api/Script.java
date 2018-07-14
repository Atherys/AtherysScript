package com.atherys.script.api;

import com.atherys.script.api.library.ScriptLibrary;

import javax.script.Invocable;
import java.util.function.Consumer;

public interface Script {

    String getId();

    String getContents();

    ScriptLibrary getLibrary();

    default void compile(Consumer<Invocable> consumer) {
        getLibrary().compile(this, consumer);
    }

    default Object run() {
        return getLibrary().run(this);
    }

}
