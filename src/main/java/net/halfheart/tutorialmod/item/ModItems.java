package net.halfheart.tutorialmod.item;

import net.halfheart.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    private static Item registerItem(String name , Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }
        
    public static final Item DRAGON_CRYSTAL = registerItem("dragon_crystal", new Item(new Item.Settings().group(ModItemGroup.DRAGON_CRYSTAL)));
  


    public static void registerItems() {
        TutorialMod.LOGGER.info("Registering items for" + TutorialMod.MOD_ID);
    }
    
}