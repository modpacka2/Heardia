
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.heardia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.heardia.block.PurplemossyendstoneBlock;
import net.mcreator.heardia.block.PurpleMossyCarpetBlock;
import net.mcreator.heardia.HeardiaMod;

public class HeardiaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HeardiaMod.MODID);
	public static final RegistryObject<Block> PURPLEMOSSYENDSTONE = REGISTRY.register("purplemossyendstone", () -> new PurplemossyendstoneBlock());
	public static final RegistryObject<Block> PURPLE_MOSSY_CARPET = REGISTRY.register("purple_mossy_carpet", () -> new PurpleMossyCarpetBlock());
}
