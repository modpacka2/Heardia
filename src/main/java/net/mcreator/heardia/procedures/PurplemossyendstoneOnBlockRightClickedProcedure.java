package net.mcreator.heardia.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.heardia.init.HeardiaModParticleTypes;
import net.mcreator.heardia.init.HeardiaModItems;
import net.mcreator.heardia.init.HeardiaModBlocks;

import javax.annotation.Nullable;

import java.util.Map;

@Mod.EventBusSubscriber
public class PurplemossyendstoneOnBlockRightClickedProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == HeardiaModBlocks.PURPLEMOSSYENDSTONE.get()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SHEARS) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z, new ItemStack(HeardiaModItems.PURPLE_MOSS.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.END_STONE.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.SHEARS) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 1), z, new ItemStack(HeardiaModItems.PURPLE_MOSS.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = Blocks.END_STONE.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Items.BONE_MEAL);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
				if (!((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.END_STONE) && !((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.END_STONE)
						&& !((world.getBlockState(BlockPos.containing(x, y, z + 2))).getBlock() == Blocks.END_STONE) && !((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.END_STONE)
						&& !((world.getBlockState(BlockPos.containing(x - 2, y, z))).getBlock() == Blocks.END_STONE) && !((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.END_STONE)
						&& !((world.getBlockState(BlockPos.containing(x, y, z - 2))).getBlock() == Blocks.END_STONE) && !((world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == Blocks.END_STONE)
						&& !((world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == Blocks.END_STONE) && !((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == Blocks.END_STONE)
						&& !((world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == Blocks.END_STONE) && !((world.getBlockState(BlockPos.containing(x + 2, y, z))).getBlock() == Blocks.END_STONE)) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (HeardiaModParticleTypes.NEGATIF.get()), (x + 0.5), (y + 1.5), (z + 0.5), 5, 0.5, 0.5, 0.5, 1);
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.END_STONE || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.END_STONE
						|| (world.getBlockState(BlockPos.containing(x, y, z + 2))).getBlock() == Blocks.END_STONE || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.END_STONE
						|| (world.getBlockState(BlockPos.containing(x - 2, y, z))).getBlock() == Blocks.END_STONE || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.END_STONE
						|| (world.getBlockState(BlockPos.containing(x, y, z - 2))).getBlock() == Blocks.END_STONE || (world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == Blocks.END_STONE
						|| (world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == Blocks.END_STONE || (world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == Blocks.END_STONE
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == Blocks.END_STONE || (world.getBlockState(BlockPos.containing(x + 2, y, z))).getBlock() == Blocks.END_STONE) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (HeardiaModParticleTypes.POSITIF.get()), (x + 0.5), (y + 1.5), (z + 0.5), 5, 0.5, 0.5, 0.5, 1);
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.END_STONE) {
					{
						BlockPos _bp = BlockPos.containing(x + 1, y, z);
						BlockState _bs = HeardiaModBlocks.PURPLEMOSSYENDSTONE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x + 2, y, z))).getBlock() == Blocks.END_STONE) {
					{
						BlockPos _bp = BlockPos.containing(x + 2, y, z);
						BlockState _bs = HeardiaModBlocks.PURPLEMOSSYENDSTONE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.END_STONE) {
					{
						BlockPos _bp = BlockPos.containing(x - 1, y, z);
						BlockState _bs = HeardiaModBlocks.PURPLEMOSSYENDSTONE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x - 2, y, z))).getBlock() == Blocks.END_STONE) {
					{
						BlockPos _bp = BlockPos.containing(x - 2, y, z);
						BlockState _bs = HeardiaModBlocks.PURPLEMOSSYENDSTONE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.END_STONE) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z + 1);
						BlockState _bs = HeardiaModBlocks.PURPLEMOSSYENDSTONE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z + 2))).getBlock() == Blocks.END_STONE) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z + 2);
						BlockState _bs = HeardiaModBlocks.PURPLEMOSSYENDSTONE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.END_STONE) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z - 1);
						BlockState _bs = HeardiaModBlocks.PURPLEMOSSYENDSTONE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z - 2))).getBlock() == Blocks.END_STONE) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z - 2);
						BlockState _bs = HeardiaModBlocks.PURPLEMOSSYENDSTONE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == Blocks.END_STONE) {
					{
						BlockPos _bp = BlockPos.containing(x - 1, y, z - 1);
						BlockState _bs = HeardiaModBlocks.PURPLEMOSSYENDSTONE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == Blocks.END_STONE) {
					{
						BlockPos _bp = BlockPos.containing(x + 1, y, z + 1);
						BlockState _bs = HeardiaModBlocks.PURPLEMOSSYENDSTONE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == Blocks.END_STONE) {
					{
						BlockPos _bp = BlockPos.containing(x + 1, y, z - 1);
						BlockState _bs = HeardiaModBlocks.PURPLEMOSSYENDSTONE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == Blocks.END_STONE) {
					{
						BlockPos _bp = BlockPos.containing(x - 1, y, z + 1);
						BlockState _bs = HeardiaModBlocks.PURPLEMOSSYENDSTONE.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			}
		}
	}
}
