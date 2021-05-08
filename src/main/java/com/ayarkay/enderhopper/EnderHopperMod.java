package com.ayarkay.enderhopper;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EnderHopperMod implements ModInitializer {

	public static final Item ENDER_HOPPER = new Item(new FabricItemSettings().group(ItemGroup.REDSTONE));


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		//Registry.register(Registry.BLOCK, new Identifier("enderhopper", "ender_hopper"), ENDER_HOPPER);
		Registry.register(Registry.ITEM, new Identifier("enderhopper", "ender_hopper"), ENDER_HOPPER);

		//System.out.println("Hello Fabric world!");
	}
}
