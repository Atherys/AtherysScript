package com.atherys.script.library.entity;

import com.atherys.script.function.ScriptBiFunction;
import org.spongepowered.api.entity.ArmorEquipable;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.item.inventory.ItemStack;

/**
 * @jsfunc
 */
public class SetEntityLeggings implements ScriptBiFunction<Entity, ItemStack, Boolean> {
    public Boolean call(Entity entity, ItemStack leggings){
        if (!(entity instanceof ArmorEquipable)) return false;
        ((ArmorEquipable) entity).setLeggings(leggings);
        return true;
    }
}

