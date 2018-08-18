package com.atherys.script.js.library.util;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ListOf<T> implements Function<T[], List<T>> {
    @Override
    public List<T> apply(T[] array) {
        return Arrays.asList(array);
    }
}
