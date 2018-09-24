package com.atherys.script.js.library.item;

import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.item.enchantment.Enchantment;
import org.spongepowered.api.item.inventory.ItemStack;

import java.util.List;
import java.util.function.Function;

/**
 * @jsfunc
 */
public class GetItemStackEnchants implements Function<ItemStack, List<Enchantment>> {
    @Override
    public List<Enchantment> apply(ItemStack itemStack) {
        return itemStack.get(Keys.ITEM_ENCHANTMENTS).orElse(null);
    }
}
