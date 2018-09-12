package com.atherys.script.js.library.entity;

import org.spongepowered.api.entity.ArmorEquipable;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.item.inventory.ItemStack;

import java.util.function.BiFunction;

/**
 * @jsfunc
 */
public class SetEntityHelmet implements BiFunction<Entity, ItemStack, Boolean> {
    public Boolean apply(Entity entity, ItemStack helmet){
        if (!(entity instanceof ArmorEquipable)) return false;
        ((ArmorEquipable) entity).setHelmet(helmet);
        return true;
    }
}

