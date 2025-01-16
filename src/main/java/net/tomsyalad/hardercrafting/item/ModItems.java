package net.tomsyalad.hardercrafting.item;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tomsyalad.hardercrafting.TYLsHarderCrafting;

public class ModItems {
    public static final Item RAW_COPPER_NUGGET = registerItem("raw_copper_nugget", new Item(new Item.Settings()));
    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new Item.Settings()));
    public static final Item RAW_IRON_NUGGET = registerItem("raw_iron_nugget", new Item(new Item.Settings()));
    public static final Item RAW_GOLD_NUGGET = registerItem("raw_gold_nugget", new Item(new Item.Settings()));
    public static final Item RAW_NETHER_GOLD_NUGGET = registerItem("raw_nether_gold_nugget", new Item(new Item.Settings()));
    public static final Item RAW_NETHER_GOLD = registerItem("raw_nether_gold", new Item(new Item.Settings()));
    public static final Item NETHER_GOLD_NUGGET = registerItem("nether_gold_nugget", new Item(new Item.Settings()));
    public static final Item NETHER_GOLD_INGOT = registerItem("nether_gold_ingot", new Item(new Item.Settings()));
    public static final Item HINGE = registerItem("hinge", new Item(new Item.Settings()));
    public static final Item SENSOR_PANEL = registerItem("sensor_panel", new Item(new Item.Settings()));
    public static final Item PILE_GRAVEL = registerItem("pile_gravel", new Item(new Item.Settings()));
    public static final Item PILE_GRAVEL_PALE = registerItem("pile_gravel_pale", new Item(new Item.Settings()));
    public static final Item PILE_GRAVEL_RUSTIC = registerItem("pile_gravel_rustic", new Item(new Item.Settings()));
    public static final Item PILE_SAND = registerItem("pile_sand", new Item(new Item.Settings()));
    public static final Item PILE_SAND_RED = registerItem("pile_sand_red", new Item(new Item.Settings()));
    public static final Item PILE_SAND_SOUL = registerItem("pile_sand_soul", new Item(new Item.Settings()));
    public static final Item RAW_GLASS = registerItem("raw_glass", new Item(new Item.Settings()));
    public static final Item ROCK = registerItem("rock", new Item(new Item.Settings()));
    public static final Item ROCK_DARK = registerItem("rock_dark", new Item(new Item.Settings()));
    public static final Item ROCK_ANDESITE = registerItem("rock_andesite", new Item(new Item.Settings()));
    public static final Item ROCK_CALCITE = registerItem("rock_calcite", new Item(new Item.Settings()));
    public static final Item ROCK_DIORITE = registerItem("rock_diorite", new Item(new Item.Settings()));
    public static final Item ROCK_GRANITE = registerItem("rock_granite", new Item(new Item.Settings()));
    public static final Item ROCK_SLATE = registerItem("rock_slate", new Item(new Item.Settings()));
    public static final Item ROCK_TUFF = registerItem("rock_tuff", new Item(new Item.Settings()));
    public static final Item TAILINGS = registerItem("tailings", new Item(new Item.Settings()));
    public static final Item CEMENT = registerItem("cement", new Item(new Item.Settings()));
    public static final Item MORTAR = registerItem("mortar", new Item(new Item.Settings()));
    public static final Item WITHER_BONE = registerItem("wither_bone", new Item(new Item.Settings()));
    public static final Item NETHER_ASH = registerItem("nether_ash", new Item(new Item.Settings()));
    public static final Item BARK_PIECE = registerItem("bark_piece", new Item(new Item.Settings()));
    public static final Item THREAD = registerItem("thread", new Item(new Item.Settings()));
    public static final Item CRUDE_TOOL_HANDLE = registerItem("crude_tool_handle", new Item(new Item.Settings()));
    public static final Item TOME = registerItem("tome", new Item(new Item.Settings()));
    public static final Item LUMBER_OAK = registerItem("lumber_oak", new Item(new Item.Settings()));
    public static final Item LUMBER_BIRCH = registerItem("lumber_birch", new Item(new Item.Settings()));
    public static final Item LUMBER_SPRUCE = registerItem("lumber_spruce", new Item(new Item.Settings()));
    public static final Item LUMBER_ACACIA = registerItem("lumber_acacia", new Item(new Item.Settings()));
    public static final Item CLAY_BOWL = registerItem("clay_bowl", new Item(new Item.Settings()));
    public static final Item HIDE_COARSE = registerItem("hide_coarse", new Item(new Item.Settings()));
    public static final Item HIDE_SCRAPED = registerItem("hide_scraped", new Item(new Item.Settings()));
    public static final Item HIDE_SMOKED = registerItem("hide_smoked", new Item(new Item.Settings()));
    public static final Item LEATHER_TANNED = registerItem("leather_tanned", new Item(new Item.Settings()));
    public static final Item LEATHER_TRIMMED = registerItem("leather_trimmed", new Item(new Item.Settings()));
    public static final Item WOODEN_FRAMING = registerItem("wooden_framing", new Item(new Item.Settings()));
    public static final Item CLOTH = registerItem("cloth", new Item(new Item.Settings()));
    public static final Item QUILL = registerItem("quill", new Item(new Item.Settings()));
    public static final Item FUR = registerItem("fur", new Item(new Item.Settings()));

    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.COPPER, 3, -2.4f))));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new PickaxeItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.COPPER, 1, -2.8f))));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new AxeItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.COPPER, 6, -3.2f))));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.COPPER, 1.5f, -3.0f))));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new HoeItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.COPPER, 0, -3.0f))));
    public static final Item SHARPENED_STICK = registerItem("sharpened_stick",
            new KnifeItem(ModToolMaterials.STICKS, new Item.Settings()
                    .attributeModifiers(KnifeItem.createAttributeModifiers(ModToolMaterials.STICKS, 3, -1.0f))));
    public static final Item SHARPENED_BONE = registerItem("sharpened_bone",
            new KnifeItem(ModToolMaterials.BONES, new Item.Settings()
                    .attributeModifiers(KnifeItem.createAttributeModifiers(ModToolMaterials.BONES, 3, -1.2f))));
    public static final Item SHARPENED_BONE_WITHER = registerItem("sharpened_bone_wither",
            new KnifeItem(ModToolMaterials.BONES, new Item.Settings()
                    .attributeModifiers(KnifeItem.createAttributeModifiers(ModToolMaterials.BONES, 3, -1.8f))));
    public static final Item BONE_SCRAPER = registerItem("bone_scraper",
            new StripperItem(ModToolMaterials.BONES, new Item.Settings()));
    public static final Item BONE_SCRAPER_COARSE = registerItem("bone_scraper_coarse",
            new StripperItem(ModToolMaterials.BONES, new Item.Settings()));
    public static final Item MYTHIC_QUILL = registerItem("mythic_quill",
            new ToolItem(ModToolMaterials.GLOW_INK, new Item.Settings()));

    public static final Item POTION_BOWL = registerItem("potion_bowl",
            new PotionBowlItem(new Item.Settings().recipeRemainder(Items.BOWL).maxCount(1).component(DataComponentTypes.POTION_CONTENTS, PotionContentsComponent.DEFAULT)));
    public static final Item MOD_BOWL = registerItem("mod_bowl", new BowlItem(new Item.Settings()));

    public static final Item PH_TYL_HC = registerItem("ph_tyl_hc", new Item(new Item.Settings()));

//    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
//        entries.add(RAW_COPPER_NUGGET);
//        entries.add(COPPER_NUGGET);
//        entries.add(RAW_IRON_NUGGET);
//        entries.add(RAW_GOLD_NUGGET);
//        entries.add(PILE_GRAVEL);
//        entries.add(PILE_GRAVEL_PALE);
//        entries.add(PILE_GRAVEL_RUSTIC);
//        entries.add(PILE_SAND);
//        entries.add(PILE_SAND_RED);
//        entries.add(PILE_SAND_SOUL);
//        entries.add(ROCK);
//        entries.add(ROCK_DARK);
//        entries.add(ROCK_ANDESITE);
//        entries.add(ROCK_CALCITE);
//        entries.add(ROCK_DIORITE);
//        entries.add(ROCK_GRANITE);
//        entries.add(ROCK_SHALE);
//        entries.add(ROCK_TUFF);
//        entries.add(CEMENT);
//        entries.add(WITHER_BONE);
//        entries.add(NETHER_ASH);
//    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TYLsHarderCrafting.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TYLsHarderCrafting.LOGGER.info("Registering Mod Items for " + TYLsHarderCrafting.MOD_ID);

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
