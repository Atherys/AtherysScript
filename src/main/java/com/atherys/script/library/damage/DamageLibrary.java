package com.atherys.script.library.damage;

import com.atherys.script.api.library.LibraryExtension;
import com.atherys.script.api.library.ScriptLibrary;

public final class DamageLibrary implements LibraryExtension {

    @Override
    public void extend(ScriptLibrary library) {
        library.put("buildDamage", new BuildDamageSource());
        library.put("blockDamageBuilder", new BlockDamageSourceBuilder());
        library.put("fallingBlockDamageBuilder", new FallingBlockDamageSourceBuilder());
        library.put("indirectEntityDamageBuilder", new IndirectEntityDamageSourceBuilder());
        library.put("entityDamageBuilder", new EntityDamageSourceBuilder());
        library.put("setDamageAbsolute", new SetDamageSourceAbsolute());
        library.put("setDamageBlock", new SetDamageSourceBlock());
        library.put("setDamageBlockLocation", new SetDamageSourceBlockLocation());
        library.put("setDamageBypass", new SetDamageSourceBypassArmor());
        library.put("setDamageCreative", new SetDamageSourceCreative());
        library.put("setDamageEntity", new SetDamageSourceEntity());
        library.put("setDamageExhaustion", new SetDamageSourceExhaustion());
        library.put("setDamageExplosive", new SetDamageSourceExplosion());
        library.put("setDamageFallingBlock", new SetDamageSourceFallingBlock());
        library.put("setDamageMagical", new SetDamageSourceMagical());
        library.put("setDamageProxy", new SetDamageSourceProxySource());
        library.put("setDamageScale", new SetDamageSourceScale());
        library.put("setDamageType", new SetDamageSourceType());
    }
}
