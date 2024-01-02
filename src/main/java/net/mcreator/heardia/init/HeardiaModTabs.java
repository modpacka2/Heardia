
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.heardia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.heardia.HeardiaMod;

public class HeardiaModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HeardiaMod.MODID);
	public static final RegistryObject<CreativeModeTab> HEARDIA = REGISTRY.register("heardia",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.heardia.heardia")).icon(() -> new ItemStack(HeardiaModBlocks.PURPLEMOSSYENDSTONE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HeardiaModBlocks.PURPLEMOSSYENDSTONE.get().asItem());
				tabData.accept(HeardiaModItems.PURPLE_MOSS.get());
				tabData.accept(HeardiaModBlocks.PURPLE_MOSSY_CARPET.get().asItem());
			}).withSearchBar().build());
}
