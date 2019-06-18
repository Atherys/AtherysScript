package com.atherys.script.library.entity;

import com.atherys.script.function.ScriptFunction;
import org.spongepowered.api.entity.ArmorEquipable;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.item.inventory.ItemStack;

;

/**
 * @jsfunc
 */
public class GetEntityBoots implements ScriptFunction<Entity, ItemStack> {
    @Override
    public ItemStack call(Entity entity){
        if (!(entity instanceof ArmorEquipable)){
            return null;
        }
        return ((ArmorEquipable) entity).getBoots().orElse(null);
    }
}
