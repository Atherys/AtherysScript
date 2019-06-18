package com.atherys.script.library.item;

import com.atherys.script.api.function.ScriptFunction;
import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.item.inventory.ItemStack;
import org.spongepowered.api.text.Text;

/**
 * @jsfunc
 */
public class GetItemStackDisplayName implements ScriptFunction<ItemStack, Text> {
    @Override
    public Text call(ItemStack itemStack) {
        return itemStack.get(Keys.DISPLAY_NAME).orElse(null);
    }
}
