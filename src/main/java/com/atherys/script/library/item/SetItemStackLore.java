package com.atherys.script.library.item;

import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.item.inventory.ItemStack;
import org.spongepowered.api.text.Text;

import java.util.Arrays;
import java.util.List;

/**
 * @jsfunc
 */
public class SetItemStackLore implements ScriptBiFunction<ItemStack, List<Text>, Boolean> {

    SetItemStackLore() {}

    @Override
    public Boolean call(ItemStack itemStack, List<Text> lore) {
        return itemStack.offer(Keys.ITEM_LORE, lore).isSuccessful();
    }
}
