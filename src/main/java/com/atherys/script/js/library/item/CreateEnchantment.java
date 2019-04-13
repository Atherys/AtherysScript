package com.atherys.script.js.library.item;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.item.enchantment.Enchantment;
import org.spongepowered.api.item.enchantment.EnchantmentType;

import java.util.Optional;
import java.util.function.BiFunction;

/**
 * @jsfunc
 */
public class CreateEnchantment implements BiFunction<String, Integer, Enchantment> {

    @Override
    public Enchantment apply(String enchantmentType, Integer level) {
        Optional<EnchantmentType> type = Sponge.getRegistry().getType(EnchantmentType.class, enchantmentType);
        return type.map(t ->
            Enchantment.builder()
                    .type(t)
                    .level(level)
                    .build()
        ).orElse(null);
    }
}
