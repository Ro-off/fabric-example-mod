package net.halfheart.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.halfheart.tutorialmod.TutorialMod;
import net.halfheart.tutorialmod.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block DRAGON_CRYSTAL_BLOCK = registerBlock("dragon_crystal_block", 
    new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.DRAGON_CRYSTAL);


    public static final Block DRAGON_CRYSTAL_ORE_BLOCK = registerBlock("dragon_crystal_ore_block", 
        new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(), 
         UniformIntProvider.create(3, 7)), ModItemGroup.DRAGON_CRYSTAL);

    
    public static final Block DRAGON_CRYSTAL_NETHERACK_ORE_BLOCK = registerBlock("dragon_crystal_netherack_ore_block", 
        new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(), 
         UniformIntProvider.create(3, 7)),  ModItemGroup.DRAGON_CRYSTAL);

  



    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    } 


    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), 
        new BlockItem(block, new FabricItemSettings().group(tab)));
    }
  

    public static void registerModBlocks() {
        TutorialMod.LOGGER.debug("Registered blocks for " + TutorialMod.MOD_ID);
    }
    
}