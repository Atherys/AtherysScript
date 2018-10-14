package com.atherys.script.api;

import com.atherys.script.AtherysScript;

import java.util.Collection;
import java.util.HashMap;
import java.util.Optional;

public abstract class AbstractScriptService<T extends Script> implements ScriptService<T> {

    private HashMap<String, T> scripts = new HashMap<>();

    @Override
    public void register(T script) {
        this.scripts.put(script.getId(), script);
        script.run();
    }

    @Override
    public Optional<T> getById(String id) {
        return Optional.ofNullable(scripts.get(id));
    }

    @Override
    public Collection<T> getScripts() {
        return scripts.values();
    }
}
