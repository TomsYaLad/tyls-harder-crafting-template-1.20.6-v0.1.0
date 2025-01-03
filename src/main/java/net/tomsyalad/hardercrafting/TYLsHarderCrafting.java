package net.tomsyalad.hardercrafting;

import net.fabricmc.api.ModInitializer;

import net.tomsyalad.hardercrafting.block.ModBlocks;
import net.tomsyalad.hardercrafting.item.ModItemGroups;
import net.tomsyalad.hardercrafting.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TYLsHarderCrafting implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final String MOD_ID = "tylshardercrafting";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LOGGER.info("Message from TYL (hi!):\n" +
				"\t\t Minecraft is in a mod-load-ready state, though some things (like resources) may still be uninitialized.");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}