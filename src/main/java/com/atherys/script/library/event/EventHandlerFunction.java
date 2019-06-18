package com.atherys.script.library.event;

import com.atherys.script.AtherysScript;
import com.atherys.script.api.function.ScriptFunction;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.Event;
import org.spongepowered.api.event.EventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * @jsfunc
 */
public class EventHandlerFunction<T extends Event> implements ScriptFunction<Consumer<T>, Boolean> {

    private static List<ScriptListener> listeners = new ArrayList<>();

    private Class<T> eventClass;

    public EventHandlerFunction(Class<T> eventClass) {
        this.eventClass = eventClass;
    }

    @Override
    public Boolean call(Consumer<T> eventConsumer) {
        EventListener<T> listener = eventConsumer::accept;
        Sponge.getEventManager().registerListener(AtherysScript.getInstance(), eventClass, listener);
        listeners.add(new ScriptListener<>(eventClass, listener));
        return true;
    }

    public static void unregisterAll() {
        listeners.forEach(Sponge.getEventManager()::unregisterListeners);
    }

    public static <E> void unregisterAllForType(Class<E> eventClass) {
        List<ScriptListener> listenersOfType = listeners.stream()
                .filter(scriptListener -> scriptListener.eventClass.equals(eventClass))
                .collect(Collectors.toList());

        listenersOfType.forEach(listener -> Sponge.getEventManager().unregisterListeners(listener.listener));
        listeners.removeAll(listenersOfType);
    }

    private static class ScriptListener<U> {
        private EventListener listener;
        private Class<U> eventClass;

        private ScriptListener(Class<U> eventClass, EventListener listener) {
            this.listener = listener;
            this.eventClass = eventClass;
        }
    }
}
