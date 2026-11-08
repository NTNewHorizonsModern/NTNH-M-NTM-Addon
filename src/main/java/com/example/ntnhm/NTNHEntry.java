package com.example.ntnhm;

import com.example.ntnhm.registry.NTNHBlocks;
import com.hbm.api.event.HbmEvents;
import dev.golem.core.platform.ModEntry;

public final class NTNHEntry implements ModEntry {

    @Override
    public void declare() {
        NTNHBlocks.init();
        HbmEvents.MACHINE_RECIPE_COMPLETED.register(event -> {
            if (event.recipe().equals("ass.example_block")) {
                NTNH.LOG.info("Example block made at {} by {}", event.pos(), event.machine());
            }
        });
    }
}
