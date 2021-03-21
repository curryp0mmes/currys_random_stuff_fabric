package com.curryp0mmes.random.stuff.fabric;

import com.curryp0mmes.random.stuff.fabric.registry.ModBlocks;
import com.curryp0mmes.random.stuff.fabric.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class RandomStuffMod implements ModInitializer {

    public static final String MOD_ID = "crs";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
