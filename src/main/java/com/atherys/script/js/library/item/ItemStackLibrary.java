package com.atherys.script.js.library.item;

import com.atherys.script.api.library.LibraryExtension;
import com.atherys.script.api.library.ScriptLibrary;
import org.spongepowered.api.item.inventory.ItemStack;

/**
 * Functions responsible for the creation and manipulation of {@link ItemStack )s
 */
public final class ItemStackLibrary implements LibraryExtension {

    @Override
    public void extend(ScriptLibrary library) {
        library.put("createItemStack", new CreateItemStack());
        library.put("getItemStackEnchants", new GetItemStackEnchants());
        library.put("getItemStackDisplayName", new GetItemStackDisplayName());
        library.put("getItemStackLore", new GetItemStackLore());
        library.put("setItemStackEnchants", new SetItemStackEnchants());
        library.put("setItemStackDisplayName", new SetItemStackDisplayName());
        library.put("setItemStackLore", new SetItemStackLore());
        library.put("isItemStack", new IsItemStack());
        library.put("compareItemStacks", new CompareItemStacks());
        library.put("dropItemStackOnGround", new DropItemStackOnGround());
    }

}
