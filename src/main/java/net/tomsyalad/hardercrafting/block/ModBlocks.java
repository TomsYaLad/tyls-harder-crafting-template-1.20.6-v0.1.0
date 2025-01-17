package net.tomsyalad.hardercrafting.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.tomsyalad.hardercrafting.TYLsHarderCrafting;

public class ModBlocks {
    public static final Block FRACTURED_STONE = registerBlock("fractured_stone",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(1.5f, 6.0f)));
    public static final Block FRACTURED_ANDESITE = registerBlock("fractured_andesite",
            new Block(AbstractBlock.Settings.copy(Blocks.ANDESITE).strength(1.5f, 6.0f)));
    public static final Block FRACTURED_DRIPSTONE = registerBlock("fractured_dripstone",
            new Block(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK).strength(1.5f, 1.0f)));
    public static final Block RAW_NETHER_GOLD_BLOCK = registerBlock("raw_nether_gold_block",
            new Block(AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK)));
    public static final Block NETHER_GOLD_BLOCK = registerBlock("nether_gold_block",
            new Block(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Block SPLIT_ACACIA_LOG = registerBlock("split_acacia_log",
            Blocks.createLogBlock(MapColor.ORANGE, MapColor.ORANGE));

    public static final Block CRAFTING_PLATFORM = registerBlock("crafting_platform",
            new CraftingPlatformBlock(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(Instrument.BASS).strength(2.5f).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block BRICK_OVEN = registerBlock("brick_oven",
            new FurnaceBlock(AbstractBlock.Settings.create().mapColor(MapColor.RED).instrument(Instrument.BASEDRUM).requiresTool().strength(3.5f).luminance(Blocks.createLightLevelFromLitBlockState(13))));
    public static final Block TANNING_BARREL = registerBlock("tanning_barrel",
            new Block(AbstractBlock.Settings.copy(Blocks.BARREL)));
    public static final Block WOODCUTTER = registerBlock("woodcutter",
            new WoodcutterBlock(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASEDRUM).requiresTool().strength(3.5f)));


    public static final Block GRAVEL_DARK = registerBlock("gravel_dark",
            new FallingBlock(AbstractBlock.Settings.copy(Blocks.GRAVEL).mapColor(MapColor.DEEPSLATE_GRAY)) {
                @Override
                protected MapCodec<? extends FallingBlock> getCodec() {
                    return null; } });
    public static final Block GRAVEL_MIXED = registerBlock("gravel_mixed",
            new FallingBlock(AbstractBlock.Settings.copy(Blocks.GRAVEL).mapColor(MapColor.GRAY)) {
                @Override
                protected MapCodec<? extends FallingBlock> getCodec() { return null; } });
    public static final Block GRAVEL_PALE = registerBlock("gravel_pale",
            new FallingBlock(AbstractBlock.Settings.copy(Blocks.GRAVEL).mapColor(MapColor.OFF_WHITE)) {
                @Override
                protected MapCodec<? extends FallingBlock> getCodec() { return null; } });
    public static final Block GRAVEL_RUSTIC = registerBlock("gravel_rustic",
            new FallingBlock(AbstractBlock.Settings.copy(Blocks.GRAVEL).mapColor(MapColor.TERRACOTTA_BROWN)) {
                @Override
                protected MapCodec<? extends FallingBlock> getCodec() { return null; } });




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
