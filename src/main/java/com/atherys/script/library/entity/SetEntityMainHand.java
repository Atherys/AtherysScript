package com.atherys.script.library.entity;

import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.data.type.HandTypes;
import org.spongepowered.api.entity.ArmorEquipable;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.item.inventory.ItemStack;

/**
 * @jsfunc
 */
public class SetEntityMainHand implements ScriptBiFunction<Entity, ItemStack, Boolean> {
    public Boolean call(Entity entity, ItemStack item){
        if (!(entity instanceof ArmorEquipable)) return false;
        ((ArmorEquipable) entity).setItemInHand(HandTypes.MAIN_HAND, item);
        return true;
    }
}

