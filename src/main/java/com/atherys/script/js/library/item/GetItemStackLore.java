package com.atherys.script.js.library.item;

import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.item.inventory.ItemStack;
import org.spongepowered.api.text.Text;

import java.util.List;
import java.util.function.Function;

/**
 * @jsfunc
 */
public class GetItemStackLore implements Function<ItemStack, List<Text>> {
    @Override
    public List<Text> apply(ItemStack itemStack) {
        return itemStack.get(Keys.ITEM_LORE).orElse(null);
    }
}
