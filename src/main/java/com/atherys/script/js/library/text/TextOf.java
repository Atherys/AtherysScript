package com.atherys.script.js.library.text;

import org.spongepowered.api.text.Text;

import java.util.function.Function;

/**
 * @jsfunc
 */
public class TextOf implements Function<Object[], Text> {

    TextOf() {}

    @Override
    public Text apply(Object[] objects) {
        return Text.of(objects);
    }
}
