
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.heardia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.heardia.HeardiaMod;

public class HeardiaModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, HeardiaMod.MODID);
	public static final RegistryObject<SimpleParticleType> POSITIF = REGISTRY.register("positif", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> NEGATIF = REGISTRY.register("negatif", () -> new SimpleParticleType(false));
}
