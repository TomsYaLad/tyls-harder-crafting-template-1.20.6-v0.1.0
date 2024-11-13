package net.tomsyalad.hardercrafting.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tomsyalad.hardercrafting.TYLsHarderCrafting;
import net.tomsyalad.hardercrafting.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup HC_MATERIALS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TYLsHarderCrafting.MOD_ID, "hc_materials"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.hc_materials"))
                    .icon(() -> new ItemStack(ModItems.RAW_COPPER_NUGGET)).entries((displayContext,entries) -> {
                        entries.add(ModItems.LUMBER_OAK);
                        entries.add(ModItems.LUMBER_BIRCH);
                        entries.add(ModItems.LUMBER_SPRUCE);
                        entries.add(ModItems.LUMBER_ACACIA);
                        entries.add(ModItems.BARK_PIECE);
                        entries.add(ModBlocks.FRACTURED_STONE);
                        entries.add(ModBlocks.FRACTURED_DRIPSTONE);
                        entries.add(ModItems.ROCK);
                        entries.add(ModItems.ROCK_DARK);
                        entries.add(ModItems.ROCK_ANDESITE);
                        entries.add(ModItems.ROCK_DIORITE);
                        entries.add(ModItems.ROCK_GRANITE);
                        entries.add(ModItems.ROCK_TUFF);
                        entries.add(ModItems.ROCK_CALCITE);
                        entries.add(ModItems.ROCK_SLATE);
                        entries.add(ModItems.TAILINGS);
                        entries.add(ModBlocks.GRAVEL_DARK);
                        entries.add(ModBlocks.GRAVEL_MIXED);
                        entries.add(ModBlocks.GRAVEL_PALE);
                        entries.add(ModBlocks.GRAVEL_RUSTIC);
                        entries.add(ModItems.PILE_GRAVEL);
                        entries.add(ModItems.PILE_GRAVEL_PALE);
                        entries.add(ModItems.PILE_GRAVEL_RUSTIC);
                        entries.add(ModItems.PILE_SAND);
                        entries.add(ModItems.PILE_SAND_RED);
                        entries.add(ModItems.PILE_SAND_SOUL);
                        entries.add(ModItems.RAW_GLASS);
                        entries.add(ModItems.CEMENT);
                        entries.add(ModItems.MORTAR);
                        entries.add(ModItems.CLAY_BOWL);
                        entries.add(ModItems.THREAD);
                        entries.add(ModItems.CLOTH);
                        entries.add(ModItems.WOODEN_FRAMING);
                        entries.add(ModItems.HIDE_COARSE);
                        entries.add(ModItems.HIDE_SCRAPED);
                        entries.add(ModItems.HIDE_SMOKED);
                        entries.add(ModItems.LEATHER_TANNED);
                        entries.add(ModItems.LEATHER_TRIMMED);
                        entries.add(ModItems.CRUDE_TOOL_HANDLE);
                        entries.add(ModItems.RAW_COPPER_NUGGET);
                        entries.add(ModItems.COPPER_NUGGET);
                        entries.add(ModItems.RAW_IRON_NUGGET);
                        entries.add(ModItems.RAW_GOLD_NUGGET);
                        entries.add(ModItems.RAW_NETHER_GOLD_NUGGET);
                        entries.add(ModItems.RAW_NETHER_GOLD);
                        entries.add(ModItems.NETHER_GOLD_NUGGET);
                        entries.add(ModItems.NETHER_GOLD_INGOT);
                        entries.add(ModBlocks.RAW_NETHER_GOLD_BLOCK);
                        entries.add(ModBlocks.NETHER_GOLD_BLOCK);
                        entries.add(ModItems.HINGE);
                        entries.add(ModItems.SENSOR_PANEL);
                        entries.add(ModItems.TOME);
                        entries.add(ModItems.WITHER_BONE);
                        entries.add(ModItems.NETHER_ASH);
                    }).build());


    public static final ItemGroup HC_EQUIPMENT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TYLsHarderCrafting.MOD_ID, "hc_equipment"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.hc_equipment"))
                    .icon(() -> new ItemStack(ModItems.PH_TYL_HC)).entries((displayContext,entries) -> {
                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.COPPER_HOE);
                        entries.add(ModItems.QUILL);
                    }).build());


    public static void registerItemGroups() {
        TYLsHarderCrafting.LOGGER.info("Registering Item Groups for " + TYLsHarderCrafting.MOD_ID);
    }
}
