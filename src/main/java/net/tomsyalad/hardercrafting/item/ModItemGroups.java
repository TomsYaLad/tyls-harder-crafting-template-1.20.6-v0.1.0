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
                        entries.add(ModItems.RAW_COPPER_NUGGET);
                        entries.add(ModItems.COPPER_NUGGET);


                    }).build());


    public static void registerItemGroups() {
        TYLsHarderCrafting.LOGGER.info("Registering Item Groups for " + TYLsHarderCrafting.MOD_ID);
    }
}
