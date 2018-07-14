package com.atherys.script.api.library;

import com.atherys.script.api.Script;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.util.function.Consumer;

public interface ScriptLibrary {

    ScriptEngine getEngine();

    /**
     * Add a key/value pair in the global scope of the ScriptEngine behind this library
     *
     * @param key The key for this object
     * @param object The value
     */
    default void put(String key, Object object) {
        getEngine().put(key, object);
    }

    /**
     * The same as {@link ScriptLibrary#put(String, Object)}, but wrapped in a {@link ScriptAddon}
     *
     * @param addon The addon
     */
    default void put(ScriptAddon addon) {
        getEngine().put(addon.getKey(), addon.getObject());
    }

    /**
     * Add all key/value pairs to the global scope of the ScriptEngine
     *
     * @param addons The addon(s)
     */
    default void putAll(ScriptAddon... addons) {
        for (ScriptAddon scriptAddon : addons) {
            getEngine().put(scriptAddon.getKey(), scriptAddon.getObject());
        }
    }

    default void extendWith(LibraryExtension extension) {
        extension.extend(this);
    }

    default void compile(Script script, Consumer<Invocable> consumer) {
        try {
            consumer.accept((Invocable) getEngine().eval(script.getContents()));
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }

    default Object run(Script script) {
        try {
            return getEngine().eval(script.getContents());
        } catch (ScriptException e) {
            e.printStackTrace();
        }

        return null;
    }

}
