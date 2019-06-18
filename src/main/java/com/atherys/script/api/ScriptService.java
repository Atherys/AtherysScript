package com.atherys.script.api;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Optional;

public interface ScriptService<T extends Script> {

    T createScript(String id, String contents);

    void register(T script);

    Optional<T> getById(String id);

    void startScripts();

    void reloadScripts();

    void stopScripts();

    Collection<T> getScripts();

    default void registerFile(Path file) throws IOException {
        String contents = new String(Files.readAllBytes(file));
        T script = createScript(file.getFileName().toString(), contents);
        register(script);
    }

    default void registerFolder(Path folder) throws IOException {
        if (!Files.exists(folder) && !Files.exists(Files.createDirectories(folder))) {
            throw new IOException("Failed to create script directory " + folder.getFileName().toString());
        }

        if (!Files.isDirectory(folder)) return;

        Files.walk(folder)
                .filter(Files::isRegularFile)
                .forEach(file -> {
                    try {
                        registerFile(file);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }
}
