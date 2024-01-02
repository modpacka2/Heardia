
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.heardia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.heardia.item.PurpleMossItem;
import net.mcreator.heardia.HeardiaMod;

public class HeardiaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HeardiaMod.MODID);
	public static final RegistryObject<Item> PURPLEMOSSYENDSTONE = block(HeardiaModBlocks.PURPLEMOSSYENDSTONE);
	public static final RegistryObject<Item> PURPLE_MOSS = REGISTRY.register("purple_moss", () -> new PurpleMossItem());
	public static final RegistryObject<Item> PURPLE_MOSSY_CARPET = block(HeardiaModBlocks.PURPLE_MOSSY_CARPET);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
