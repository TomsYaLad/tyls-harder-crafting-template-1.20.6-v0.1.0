package net.tomsyalad.hardercrafting.util;

import net.tomsyalad.hardercrafting.TYLsHarderCrafting;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> SPLIT_LOGS = createTag("split_logs");
        public static final TagKey<Block> COBBLESTONES = createTag("cobblestones");
        public static final TagKey<Block> STONE_SLABS = createTag("stone_slabs");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(TYLsHarderCrafting.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> LUMBERS = createTag("lumbers");
        public static final TagKey<Item> ROCKS = createTag("rocks");
        public static final TagKey<Item> QUARTZ_TAG = createTag("quartz_tag");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(TYLsHarderCrafting.MOD_ID, name));
        }

    }
}