package com.atherys.script.js.library.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @jsfunc
 */
public class ListOf<T> implements Function<T[], List<T>> {
    @Override
    public List<T> apply(T[] array) {
        if ( array == null || array.length == 0 ) return new ArrayList<>();
        return Arrays.asList(array);
    }
}
