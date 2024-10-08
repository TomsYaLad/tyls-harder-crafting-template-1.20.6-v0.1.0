package net.tomsyalad.hardercrafting.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tomsyalad.hardercrafting.TYLsHarderCrafting;

public class ModItemGroups {
    public static final ItemGroup HC_MATERIALS_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(TYLsHarderCrafting.MOD_ID, "hc_materials"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.hc_materials"))
                    .icon(() -> new ItemStack(ModItems.RAW_COPPER_NUGGET)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BARK_PIECE);
                        entries.add(ModItems.ROCK);
                        entries.add(ModItems.ROCK_DARK);
                        entries.add(ModItems.ROCK_ANDESITE);
                        entries.add(ModItems.ROCK_DIORITE);
                        entries.add(ModItems.ROCK_GRANITE);
                        entries.add(ModItems.ROCK_TUFF);
                        entries.add(ModItems.ROCK_CALCITE);
                        entries.add(ModItems.ROCK_SHALE);
                        entries.add(ModItems.PILE_GRAVEL);
                        entries.add(ModItems.PILE_GRAVEL_PALE);
                        entries.add(ModItems.PILE_GRAVEL_RUSTIC);
                        entries.add(ModItems.PILE_SAND);
                        entries.add(ModItems.PILE_SAND_RED);
                        entries.add(ModItems.PILE_SAND_SOUL);
                        entries.add(ModItems.CEMENT);
                        entries.add(ModItems.WITHER_BONE);
                        entries.add(ModItems.NETHER_ASH);
                        entries.add(ModItems.THREAD);
                        entries.add(ModItems.CRUDE_TOOL_HANDLE);
                        entries.add(ModItems.RAW_COPPER_NUGGET);
                        entries.add(ModItems.COPPER_NUGGET);
                        entries.add(ModItems.RAW_IRON_NUGGET);
                        entries.add(ModItems.RAW_GOLD_NUGGET);
                        entries.add(ModItems.TOME);


                    }).build());


    public static void registerItemGroups() {
        TYLsHarderCrafting.LOGGER.info("Registering Item Groups for " + TYLsHarderCrafting.MOD_ID);
    }
}
