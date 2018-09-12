package com.atherys.script.js.library.entity;

import org.spongepowered.api.entity.ArmorEquipable;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.item.inventory.ItemStack;

import java.util.function.BiFunction;

/**
 * @jsfunc
 */
public class SetEntityChestplate implements BiFunction<Entity, ItemStack, Boolean> {
    public Boolean apply(Entity entity, ItemStack chestplate){
        if (!(entity instanceof ArmorEquipable)) return false;
        ((ArmorEquipable) entity).setChestplate(chestplate);
        return true;
    }
}
