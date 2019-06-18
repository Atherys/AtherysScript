package com.atherys.script.library.text;

import com.atherys.script.function.ScriptFunction;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.serializer.TextSerializers;

;

/**
 * @jsfunc
 */
public class TextOf implements ScriptFunction<String, Text> {

    /**
     * Formats a `String` into a `Text` object using Minecraft formatting codes. See [here](https://minecraft.gamepedia.com/Formatting_codes) for
     * the available codes. However, you must use an ampersand instead of the section sign used on the wiki page.
     *
     * @param text The formatted string
     * @return The formatted text.
     * @ex var message = textOf("&4This text is red!");
     */
    @Override
    public Text call(String text) {
        return TextSerializers.FORMATTING_CODE.deserialize(text);
    }
}
