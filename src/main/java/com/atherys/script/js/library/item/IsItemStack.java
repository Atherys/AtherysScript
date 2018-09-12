package com.atherys.script.js.library.item;

import org.spongepowered.api.item.inventory.ItemStack;

import java.util.function.Predicate;

/**
 * @jsfunc
 */
public class IsItemStack implements Predicate {
    @Override
    public boolean test(Object itemStack) {
        return itemStack instanceof ItemStack;
    }
}
