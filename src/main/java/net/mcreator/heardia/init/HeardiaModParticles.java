
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.heardia.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.heardia.client.particle.PositifParticle;
import net.mcreator.heardia.client.particle.NegatifParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HeardiaModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(HeardiaModParticleTypes.POSITIF.get(), PositifParticle::provider);
		event.registerSpriteSet(HeardiaModParticleTypes.NEGATIF.get(), NegatifParticle::provider);
	}
}
