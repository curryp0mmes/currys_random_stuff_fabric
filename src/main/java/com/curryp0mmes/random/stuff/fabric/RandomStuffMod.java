package com.curryp0mmes.random.stuff.fabric;

import com.curryp0mmes.random.stuff.fabric.registry.ModBlocks;
import com.curryp0mmes.random.stuff.fabric.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class RandomStuffMod implements ModInitializer {

    public static final String MOD_ID = "crs";

    public static final ItemGroup CRYSTAL_GROUP = FabricItemGroupBuilder
            .build(new Identifier(MOD_ID, "crystal"),
                    () -> new ItemStack(ModItems.CRYSTAL));

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
