package com.atherys.script.js.library.entity;

import com.atherys.script.api.library.LibraryExtension;
import com.atherys.script.api.library.ScriptLibrary;

public final class EntityLibrary implements LibraryExtension {

    @Override
    public void extend(ScriptLibrary library) {
        library.put("createEntity", new CreateEntity());
        library.put("spawnEntity", new SpawnEntity());
        library.put("healEntity", new HealEntity());
        library.put("damageEntity", new DamageEntity());
        library.put("addEntityPotionEffect", new AddEntityPotionEffect());
        library.put("setEntityPotionEffects", new SetEntityPotionEffects());
        library.put("getEntityPotionEffects", new GetEntityPotionEffects());
        library.put("getEntityHealth", new GetEntityHealth());
        library.put("getEntityBoots", new GetEntityBoots());
        library.put("getEntityChestplate", new GetEntityChestplate());
        library.put("getEntityHelmet", new GetEntityHelmet());
        library.put("getEntityLeggings", new GetEntityLeggings());
        library.put("getEntityMainHand", new GetEntityMainHand());
        library.put("getEntityOffHand", new GetEntityOffhand());
        library.put("getEntityHealth", new GetEntityHealth());
        library.put("getEntityMaxHealth", new GetEntityMaxHealth());
        library.put("getEntityUUID", new GetEntityUUID());
        library.put("getEntityName", new GetEntityName());
        library.put("setEntityBoots", new SetEntityBoots());
        library.put("setEntityChestplate", new SetEntityChestplate());
        library.put("setEntityHelmet", new SetEntityHelmet());
        library.put("setEntityLeggings", new SetEntityLeggings());
        library.put("setEntityMainHand", new SetEntityMainHand());
        library.put("setEntityOffHand", new SetEntityOffhand());
        library.put("setEntityMaxHealth", new SetEntityMaxHealth());
        library.put("setEntityName", new SetEntityName());
    }

}
