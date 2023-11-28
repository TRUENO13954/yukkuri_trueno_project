
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yukkuriproject.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.yukkuriproject.item.MaxtoolItem;
import net.mcreator.yukkuriproject.YukkuriProjectMod;

public class YukkuriProjectModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, YukkuriProjectMod.MODID);
	public static final RegistryObject<Item> MAXTOOL = REGISTRY.register("maxtool", () -> new MaxtoolItem());
}
