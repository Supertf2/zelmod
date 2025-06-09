package net.zel.zeltest.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.zel.zeltest.ZelTest;

public class ModBlocks {
    public static final Block MINOS_PRIME_HEAD_BLOCK = registerBlock("minos_prime_head_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.ANVIL)));


        private static Block registerBlock(String name, Block block) {
            registerBlockItem(name, block);
            return Registry.register(Registries.BLOCK, Identifier.of(ZelTest.MOD_ID, name), block);
        }
        private static void registerBlockItem(String name, Block block) {
            Registry.register(Registries.ITEM, Identifier.of(ZelTest.MOD_ID, name),
                    new BlockItem(block, new Item.Settings()));
        }

        public static void registerModBlocks() {
                ZelTest.LOGGER.info("Registering Mod Blocks for" + ZelTest.MOD_ID);

            ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
                fabricItemGroupEntries.add(ModBlocks.MINOS_PRIME_HEAD_BLOCK);
            });
        }
}
