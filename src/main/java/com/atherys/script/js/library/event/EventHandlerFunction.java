package com.atherys.script.js.library.event;

import com.atherys.script.AtherysScript;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.Event;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @jsfunc
 */
public class EventHandlerFunction<T extends Event> implements Function<Consumer<T>, Boolean> {

    private Class<T> eventClass;

    public EventHandlerFunction(Class<T> eventClass) {
        this.eventClass = eventClass;
    }

    @Override
    public Boolean apply(Consumer<T> eventConsumer) {
        Sponge.getEventManager().registerListener(AtherysScript.getInstance(), eventClass, eventConsumer::accept);
        return true;
    }
}
