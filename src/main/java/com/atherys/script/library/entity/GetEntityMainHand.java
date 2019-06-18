package com.atherys.script.library.entity;

import com.atherys.script.function.ScriptFunction;
import org.spongepowered.api.data.type.HandTypes;
import org.spongepowered.api.entity.ArmorEquipable;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.item.inventory.ItemStack;

/**
 * @jsfunc
 */
public class GetEntityMainHand implements ScriptFunction<Entity, ItemStack> {
    public ItemStack call(Entity entity){
        if (!(entity instanceof ArmorEquipable)) return null;
        return ((ArmorEquipable) entity).getItemInHand(HandTypes.MAIN_HAND).orElse(null);
    }
}
