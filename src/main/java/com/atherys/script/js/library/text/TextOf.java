package com.atherys.script.js.library.text;

import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.serializer.TextSerializers;

import java.util.function.Function;

/**
 * @jsfunc
 */
public class TextOf implements Function<String, Text> {

    /**
     * Formats a `String` into a `Text` object using Minecraft formatting codes. See [here](https://minecraft.gamepedia.com/Formatting_codes) for
     * the available codes. However, you must use an ampersand instead of the section sign used on the wiki page.
     *
     * @ex var message = textOf("&4This text is red!");
     * @param text The formatted string
     * @return The formatted text.
     */
    @Override
    public Text apply(String text) {
        return TextSerializers.FORMATTING_CODE.deserialize(text);
    }
}
