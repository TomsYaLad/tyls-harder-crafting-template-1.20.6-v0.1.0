/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.tomsyalad.hardercrafting.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;

public class KnifeItem
extends MiningWeaponItem {
    public KnifeItem(ToolMaterial material, Settings settings) {
        super(material, BlockTags.PICKAXE_MINEABLE, settings);
    }
}

