package com.atherys.script.js.library.text;

import org.spongepowered.api.text.format.TextStyle;
import org.spongepowered.api.text.format.TextStyles;

import java.util.function.Function;

public class Style implements Function<String, TextStyle> {
    @Override
    public TextStyle apply(String textStyleId) {
        return TextStyles.NONE; //Sponge.getRegistry().getType(TextStyle.class, textStyleId).orElse(TextStyles.NONE);
    }
}
