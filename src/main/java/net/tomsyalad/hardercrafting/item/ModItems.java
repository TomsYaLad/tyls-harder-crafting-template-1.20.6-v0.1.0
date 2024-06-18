package net.tomsyalad.hardercrafting.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tomsyalad.hardercrafting.TYLsHarderCrafting;

public class ModItems {
    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new Item.Settings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(COPPER_NUGGET);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TYLsHarderCrafting.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TYLsHarderCrafting.LOGGER.info("Registering Mod Items for " + TYLsHarderCrafting.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
