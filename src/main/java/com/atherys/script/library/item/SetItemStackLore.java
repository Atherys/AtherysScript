package com.atherys.script.library.item;

import com.atherys.script.function.ScriptBiFunction;
import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.item.inventory.ItemStack;
import org.spongepowered.api.text.Text;

import java.util.Arrays;

/**
 * @jsfunc
 */
public class SetItemStackLore implements ScriptBiFunction<ItemStack, Text[], Boolean> {

    SetItemStackLore() {}

    @Override
    public Boolean call(ItemStack itemStack, Text[] lore) {
        return itemStack.offer(Keys.ITEM_LORE, Arrays.asList(lore)).isSuccessful();
    }
}
