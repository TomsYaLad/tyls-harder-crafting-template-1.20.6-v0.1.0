package net.tomsyalad.hardercrafting.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tomsyalad.hardercrafting.TYLsHarderCrafting;

public class ModBlocks {
    public static final Block FRACTURED_STONE = registerBlock("fractured_stone",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(1.5f, 6.0f)));
    public static final Block FRACTURED_DRIPSTONE = registerBlock("fractured_dripstone",
            new Block(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK).strength(1.5f, 1.0f)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TYLsHarderCrafting.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TYLsHarderCrafting.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TYLsHarderCrafting.LOGGER.info("Registering ModBlocks for " + TYLsHarderCrafting.MOD_ID);
    }
}
