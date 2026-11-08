package com.example.ntnhm.recipe;

import static dev.golem.core.dejson.Crafting.rows;
import static dev.golem.core.dejson.Crafting.shaped;

/** Crafting recipes, written to data/ntnhm/recipe at build time. Runs in a plain JVM, so items are string ids. */
public final class NTNHCraftingRecipes {

    private static final String NS = "ntnhm";

    private NTNHCraftingRecipes() {}

    public static void declare() {
        shaped(NS, "example_block", "ntnhm:example_block", rows("##", "##"), "#", "hbm:plate_steel");
    }
}
