package com.atherys.script.js.library.item;

import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.item.inventory.ItemStack;
import org.spongepowered.api.text.Text;

import java.util.Arrays;
import java.util.function.BiFunction;

/**
 * @jsfunc
 */
public class SetItemStackLore implements BiFunction<ItemStack, Text[], Boolean> {

    SetItemStackLore() {}

    @Override
    public Boolean apply(ItemStack itemStack, Text[] lore) {
        return itemStack.offer(Keys.ITEM_LORE, Arrays.asList(lore)).isSuccessful();
    }
}
