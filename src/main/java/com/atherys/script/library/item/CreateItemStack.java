package com.atherys.script.library.item;

import com.atherys.script.function.ScriptBiFunction;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.item.ItemType;
import org.spongepowered.api.item.inventory.ItemStack;

import java.util.Optional;

/**
 * @jsfunc
 */
public class CreateItemStack implements ScriptBiFunction<String, Integer, ItemStack> {

    CreateItemStack() {}

    @Override
    public ItemStack call(String itemTypeId, Integer amount) {
        Optional<ItemType> type = Sponge.getRegistry().getType(ItemType.class, itemTypeId);
        return type.map(itemType ->
                ItemStack.builder()
                        .itemType(itemType)
                        .quantity(amount)
                        .build()
        ).orElse(null);
    }

}
