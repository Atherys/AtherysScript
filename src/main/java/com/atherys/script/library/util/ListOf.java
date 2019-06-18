package com.atherys.script.library.util;

import com.atherys.script.function.ScriptFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

;

/**
 * @jsfunc
 */
public class ListOf<T> implements ScriptFunction<T[], List<T>> {
    @Override
    public List<T> call(T[] array) {
        if ( array == null || array.length == 0 ) return new ArrayList<>();
        return Arrays.asList(array);
    }
}
