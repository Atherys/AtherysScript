package com.atherys.script.library.item;

import com.atherys.script.api.function.ScriptFunction;
import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.item.enchantment.Enchantment;
import org.spongepowered.api.item.inventory.ItemStack;

import java.util.List;

;

/**
 * @jsfunc
 */
public class GetItemStackEnchants implements ScriptFunction<ItemStack, List<Enchantment>> {
    @Override
    public List<Enchantment> call(ItemStack itemStack) {
        return itemStack.get(Keys.ITEM_ENCHANTMENTS).orElse(null);
    }
}
