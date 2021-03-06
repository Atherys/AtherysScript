package com.atherys.script.library.entity;

import com.atherys.script.api.function.ScriptFunction;
import org.spongepowered.api.data.type.HandTypes;
import org.spongepowered.api.entity.ArmorEquipable;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.item.inventory.ItemStack;

/**
 * @jsfunc
 */
public class GetEntityOffhand implements ScriptFunction<Entity, ItemStack> {
    public ItemStack call(Entity entity){
        if (!(entity instanceof ArmorEquipable)) return null;
        return ((ArmorEquipable) entity).getItemInHand(HandTypes.OFF_HAND).orElse(null);
    }
}
