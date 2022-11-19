package net.halfheart.tutorialmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.halfheart.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup DRAGON_CRYSTAL = FabricItemGroupBuilder.build(
        new Identifier(TutorialMod.MOD_ID, "dragon_crystal"), () -> new ItemStack(ModItems.DRAGON_CRYSTAL));
}
