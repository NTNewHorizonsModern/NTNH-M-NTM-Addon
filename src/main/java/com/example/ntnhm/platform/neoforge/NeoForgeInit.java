package com.example.ntnhm.platform.neoforge;

//? if neoforge {
import com.example.ntnhm.NTNH;
import com.example.ntnhm.NTNHEntry;
import dev.golem.core.platform.ModEntries;
import net.neoforged.fml.common.Mod;

@Mod(NTNH.MOD_ID)
public final class NeoForgeInit {

    public NeoForgeInit() {
        ModEntries.start(new NTNHEntry());
    }
}
//?}
