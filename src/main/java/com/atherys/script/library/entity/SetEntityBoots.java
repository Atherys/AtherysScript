package com.atherys.script.library.entity;

import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.entity.ArmorEquipable;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.item.inventory.ItemStack;

/**
 * @jsfunc
 */
public class SetEntityBoots implements ScriptBiFunction<Entity, ItemStack, Boolean> {
    public Boolean call(Entity entity, ItemStack boots){
        if (!(entity instanceof ArmorEquipable)) return false;
        ((ArmorEquipable) entity).setBoots(boots);
        return true;
    }
}
