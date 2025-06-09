package net.zel.zeltest;

import net.fabricmc.api.ModInitializer;

import net.zel.zeltest.block.ModBlocks;
import net.zel.zeltest.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZelTest implements ModInitializer {
	public static final String MOD_ID = "zel-test";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}