package net.halfheart.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.halfheart.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item DRAGON_CRYSTAL = registerItem("dragon_crystal", new Item(new FabricItemSettings().group(ModItemGroup.DRAGON_CRYSTAL)));

    private static Item registerItem(String name , Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerItems() {
        TutorialMod.LOGGER.debug("Registering items for" + TutorialMod.MOD_ID);
    }
    
}