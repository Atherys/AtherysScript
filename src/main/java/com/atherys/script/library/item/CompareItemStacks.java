package com.atherys.script.library.item;

import com.atherys.script.function.ScriptBiFunction;
import org.spongepowered.api.item.inventory.ItemStack;

public class CompareItemStacks implements ScriptBiFunction<ItemStack, ItemStack, Boolean> {

    @Override
    public Boolean call(ItemStack first, ItemStack second) {
        return first.equalTo(second);
    }

}
