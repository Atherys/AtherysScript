package com.atherys.script.library.item;

import com.atherys.script.api.function.ScriptFunction;
import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.item.inventory.ItemStack;
import org.spongepowered.api.text.Text;

import java.util.List;

;

/**
 * @jsfunc
 */
public class GetItemStackLore implements ScriptFunction<ItemStack, List<Text>> {
    @Override
    public List<Text> call(ItemStack itemStack) {
        return itemStack.get(Keys.ITEM_LORE).orElse(null);
    }
}
