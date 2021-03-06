package com.atherys.script.api;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public abstract class AbstractScriptService<T extends Script> implements ScriptService<T> {

    private Map<String, T> scripts = new HashMap<>();

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

    @Override
    public void clearScripts() {
        scripts.clear();
    }
}
