package com.atherys.script.library.item;

import com.atherys.script.function.ScriptBiFunction;
import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.item.inventory.ItemStack;
import org.spongepowered.api.text.Text;

/**
 * @jsfunc
 */
public class SetItemStackDisplayName implements ScriptBiFunction<ItemStack, Text, Boolean> {

    SetItemStackDisplayName() {}

    @Override
    public Boolean call(ItemStack itemStack, Text text) {
        return itemStack.offer(Keys.DISPLAY_NAME, text).isSuccessful();
    }
}
