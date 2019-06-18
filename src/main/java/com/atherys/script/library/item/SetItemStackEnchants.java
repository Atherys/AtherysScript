package com.atherys.script.library.item;

import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.item.enchantment.Enchantment;
import org.spongepowered.api.item.inventory.ItemStack;

import java.util.Arrays;

/**
 * @jsfunc
 */
public class SetItemStackEnchants implements ScriptBiFunction<ItemStack, Enchantment[], Boolean> {

    SetItemStackEnchants() {}

    @Override
    public Boolean call(ItemStack itemStack, Enchantment... enchantments) {
        return itemStack.offer(Keys.ITEM_ENCHANTMENTS, Arrays.asList(enchantments)).isSuccessful();
    }

}
