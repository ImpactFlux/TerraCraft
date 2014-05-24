package com.impactflux.terracraft.blocks;

import cofh.util.ItemHelper;
import cofh.util.StringHelper;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class TerraEcopoiesisItemBlockOre extends ItemBlock
{

	public TerraEcopoiesisItemBlockOre(Block block) {

		super(block);
		setHasSubtypes(true);
		setMaxDamage(0);
	}

	@Override
	public String getItemStackDisplayName(ItemStack item) {

		return StringHelper.localize(getUnlocalizedName(item));
	}

	@Override
	public String getUnlocalizedName(ItemStack item) {

		return "tile.terracraft.ore." + TerraEcopoiesisBlockOre.NAME + ".name";
	}

	@Override
	public int getMetadata(int i) {

		return i;
	}

	@Override
	public EnumRarity getRarity(ItemStack stack) {

		return EnumRarity.values()[TerraEcopoiesisBlockOre.RARITY];
	}

}
