package com.atherys.script.library.item;

import com.atherys.script.function.ScriptBiFunction;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.item.enchantment.Enchantment;
import org.spongepowered.api.item.enchantment.EnchantmentType;

import java.util.Optional;

/**
 * @jsfunc
 */
public class CreateEnchantment implements ScriptBiFunction<String, Integer, Enchantment> {

    @Override
    public Enchantment call(String enchantmentType, Integer level) {
        Optional<EnchantmentType> type = Sponge.getRegistry().getType(EnchantmentType.class, enchantmentType);
        return type.map(t ->
            Enchantment.builder()
                    .type(t)
                    .level(level)
                    .build()
        ).orElse(null);
    }
}
