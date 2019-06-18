package com.atherys.script.library.item;

import com.atherys.script.api.function.ScriptBiFunction;
import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.item.inventory.ItemStack;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

/**
 * @jsfunc
 */
public class DropItemStackOnGround implements ScriptBiFunction<ItemStack, Location<World>, Entity> {
    @Override
    public Entity call(ItemStack itemStack, Location<World> location) {
        Entity item = location.getExtent().createEntity(EntityTypes.ITEM, location.getPosition());
        item.offer(Keys.REPRESENTED_ITEM, itemStack.createSnapshot());
        location.getExtent().spawnEntity(item);
        return item;
    }
}
