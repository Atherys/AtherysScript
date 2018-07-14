package com.atherys.script.api;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
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

    default void registerFile(File file) throws IOException {
        register(createScript(file.getName(), Files.toString(file, Charset.defaultCharset())));
    }

    default void registerFolder(File folder) throws IOException {
        if (!folder.exists() && !folder.mkdirs()) {
            throw new IOException("Failed to create script directory " + folder.getName());
        }

        if (!folder.isDirectory()) return;

        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                registerFile(file);
            }
        }
    }

}
