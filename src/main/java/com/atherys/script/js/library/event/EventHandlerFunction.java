package com.atherys.script.js.library.event;

import com.atherys.script.AtherysScript;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.Event;
import org.spongepowered.api.event.EventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @jsfunc
 */
public class EventHandlerFunction<T extends Event> implements Function<Consumer<T>, Boolean> {

    private static List<EventListener> listeners = new ArrayList<>();

    private Class<T> eventClass;

    public EventHandlerFunction(Class<T> eventClass) {
        this.eventClass = eventClass;
    }

    @Override
    public Boolean apply(Consumer<T> eventConsumer) {
        EventListener<T> listener = eventConsumer::accept;
        Sponge.getEventManager().registerListener(AtherysScript.getInstance(), eventClass, listener);
        listeners.add(listener);
        return true;
    }

    public static void unregisterAll() {
        listeners.forEach(Sponge.getEventManager()::unregisterListeners);
    }
}
