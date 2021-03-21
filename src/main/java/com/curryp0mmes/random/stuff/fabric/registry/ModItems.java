package com.curryp0mmes.random.stuff.fabric.registry;

import com.curryp0mmes.random.stuff.fabric.RandomStuffMod;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //Items
    public static final Item CRYSTAL = new Item(new Item.Settings().group(RandomStuffMod.CRYSTAL_GROUP));
    public static final Item CRYSTAL_SHARD = new Item(new Item.Settings().group(RandomStuffMod.CRYSTAL_GROUP));


    //Armor
    public static final ArmorMaterial CRYSTAL_ARMOR_MATERIAL = new CrystalArmorMaterial();
    public static final Item CRYSTAL_HELMET = new ArmorItem(CRYSTAL_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(RealisticGunsMod.CRYSTAL_GROUP));
    public static final Item CRYSTAL_CHESTPLATE = new ArmorItem(CRYSTAL_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(RealisticGunsMod.CRYSTAL_GROUP));
    public static final Item CRYSTAL_LEGGINGS = new ArmorItem(CRYSTAL_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(RealisticGunsMod.CRYSTAL_GROUP));
    public static final Item CRYSTAL_BOOTS = new ArmorItem(CRYSTAL_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(RealisticGunsMod.CRYSTAL_GROUP));



    //BlockItems
    public static final BlockItem CRYSTAL_ORE = new BlockItem(ModBlocks.CRYSTAL_ORE, new Item.Settings().group(RealisticGunsMod.CRYSTAL_GROUP));
    public static final BlockItem CRYSTAL_BLOCK = new BlockItem(ModBlocks.CRYSTAL_BLOCK, new Item.Settings().group(RealisticGunsMod.CRYSTAL_GROUP));
    public static final BlockItem CRYSTAL_BRICKS = new BlockItem(ModBlocks.CRYSTAL_BRICKS, new Item.Settings().group(RealisticGunsMod.CRYSTAL_GROUP));



    public static void registerItems() {
        //Crystal Stuff
        Registry.register(Registry.ITEM, new Identifier(RandomStuffMod.MOD_ID, "crystal"), CRYSTAL);
        Registry.register(Registry.ITEM, new Identifier(RandomStuffMod.MOD_ID, "crystal_shard"), CRYSTAL_SHARD);

        //Blocks
        Registry.register(Registry.ITEM, new Identifier(RandomStuffMod.MOD_ID, "crystal_ore"), CRYSTAL_ORE);
        Registry.register(Registry.ITEM, new Identifier(RandomStuffMod.MOD_ID, "crystal_block"), CRYSTAL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(RandomStuffMod.MOD_ID, "crystal_bricks"), CRYSTAL_BRICKS);

        //Crystal Armor
        Registry.register(Registry.ITEM, new Identifier(RandomStuffMod.MOD_ID, "crystal_helmet"), CRYSTAL_HELMET);
        Registry.register(Registry.ITEM, new Identifier(RandomStuffMod.MOD_ID, "crystal_chestplate"), CRYSTAL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(RandomStuffMod.MOD_ID, "crystal_leggings"), CRYSTAL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(RandomStuffMod.MOD_ID, "crystal_boots"), CRYSTAL_BOOTS);
    }
}
