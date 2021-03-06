package com.impactflux.terracraft.items;
import cofh.util.ItemHelper;









import com.impactflux.terracraft.TerraCraft;
import com.impactflux.terracraft.blocks.TerraBlocks;
import com.impactflux.terracraft.blocks.TerraEcopoiesisBlockStorage;
import com.impactflux.terracraft.blocks.TerraGenesisBlockStorage;
import com.impactflux.terracraft.fluid.BucketHandler;
import com.impactflux.terracraft.fluid.TerraFluids;
import com.impactflux.terracraft.library.RegisterHelper;
import com.impactflux.terracraft.library.items.TerraItemBase;
import com.impactflux.terracraft.library.items.TerraItemBucket;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class TerraItems
{
	public static final String TOOL = "terracraft.tool.";
	public static final String TOOL_CONFIG_GENESIS = "Tool.Genesis.";
	public static final String TOOL_CONFIG_ECOPOIESIS = "Tool.Ecopoiesis.";
	public static final String TOOL_TEX_GENESIS = "terracraft:tool/Genesis";
	public static final String TOOL_TEX_ECOPOIESIS = "terracraft:tool/Ecopoiesis";
	
	
	public static void preInit() 
	{

		itemBucket = (TerraItemBucket) new TerraItemBucket("terracraft").setUnlocalizedName("bucket").setCreativeTab(TerraCraft.tab);
		itemMaterial = (TerraItemBase) new TerraItemBase("terracraft").setUnlocalizedName("material").setCreativeTab(TerraCraft.tab);
		
		
		//
		// Genesis tools
		//
		itemSwordGenesis = new ItemSwordGenesis(TOOL_MATERIAL_GENESIS).setUnlocalizedName(TOOL + "swordGenesis").setTextureName(TOOL_TEX_GENESIS + "Sword")
				.setCreativeTab(TerraCraft.tab);
		itemShovelGenesis = new ItemShovelGenesis(TOOL_MATERIAL_GENESIS).setUnlocalizedName(TOOL + "shovelGenesis").setTextureName(TOOL_TEX_GENESIS + "Shovel")
				.setCreativeTab(TerraCraft.tab);
		itemPickaxeGenesis = new ItemPickaxeGenesis(TOOL_MATERIAL_GENESIS).setUnlocalizedName(TOOL + "pickaxeGenesis").setTextureName(TOOL_TEX_GENESIS + "Pickaxe")
				.setCreativeTab(TerraCraft.tab);
		itemAxeGenesis = new ItemAxeGenesis(TOOL_MATERIAL_GENESIS).setUnlocalizedName(TOOL + "axeGenesis").setTextureName(TOOL_TEX_GENESIS + "Axe")
				.setCreativeTab(TerraCraft.tab);
		itemSickleGenesis = new ItemSickleGenesis(TOOL_MATERIAL_GENESIS).setUnlocalizedName(TOOL + "sickleGenesis").setTextureName(TOOL_TEX_GENESIS + "Sickle")
				.setCreativeTab(TerraCraft.tab);
		itemHoeGenesis = new ItemHoeGenesis(TOOL_MATERIAL_GENESIS).setUnlocalizedName(TOOL + "hoeGenesis").setTextureName(TOOL_TEX_GENESIS + "Hoe")
				.setCreativeTab(TerraCraft.tab);
		
		
		GameRegistry.registerItem(itemSwordGenesis, "tool.swordGenesis");
		GameRegistry.registerItem(itemShovelGenesis, "tool.shovelGenesis");
		GameRegistry.registerItem(itemPickaxeGenesis, "tool.pickaxeGenesis");
		GameRegistry.registerItem(itemAxeGenesis, "tool.axeGenesis");
		GameRegistry.registerItem(itemSickleGenesis, "tool.sickleGenesis");
		GameRegistry.registerItem(itemHoeGenesis, "tool.hoeGenesis");
		
		//
		// Ecopoiesis tools
		//
		itemSwordEcopoiesis = new ItemSwordEcopoiesis(TOOL_MATERIAL_ECOPOIESIS).setUnlocalizedName(TOOL + "swordEcopoiesis").setTextureName(TOOL_TEX_ECOPOIESIS + "Sword")
				.setCreativeTab(TerraCraft.tab);
		itemShovelEcopoiesis = new ItemShovelEcopoiesis(TOOL_MATERIAL_ECOPOIESIS).setUnlocalizedName(TOOL + "shovelEcopoiesis").setTextureName(TOOL_TEX_ECOPOIESIS + "Shovel")
				.setCreativeTab(TerraCraft.tab);
		itemPickaxeEcopoiesis = new ItemPickaxeEcopoiesis(TOOL_MATERIAL_ECOPOIESIS).setUnlocalizedName(TOOL + "pickaxeEcopoiesis").setTextureName(TOOL_TEX_ECOPOIESIS + "Pickaxe")
				.setCreativeTab(TerraCraft.tab);
		itemAxeEcopoiesis = new ItemAxeEcopoiesis(TOOL_MATERIAL_ECOPOIESIS).setUnlocalizedName(TOOL + "axeEcopoiesis").setTextureName(TOOL_TEX_ECOPOIESIS + "Axe")
				.setCreativeTab(TerraCraft.tab);
		itemSickleEcopoiesis = new ItemSickleEcopoiesis(TOOL_MATERIAL_ECOPOIESIS).setUnlocalizedName(TOOL + "sickleEcopoiesis").setTextureName(TOOL_TEX_ECOPOIESIS + "Sickle")
				.setCreativeTab(TerraCraft.tab);
		itemHoeEcopoiesis = new ItemHoeEcopoiesis(TOOL_MATERIAL_ECOPOIESIS).setUnlocalizedName(TOOL + "hoeEcopoiesis").setTextureName(TOOL_TEX_ECOPOIESIS + "Hoe")
				.setCreativeTab(TerraCraft.tab);
		
		
		GameRegistry.registerItem(itemSwordEcopoiesis, "tool.swordEcopoiesis");
		GameRegistry.registerItem(itemShovelEcopoiesis, "tool.shovelEcopoiesis");
		GameRegistry.registerItem(itemPickaxeEcopoiesis, "tool.pickaxeEcopoiesis");
		GameRegistry.registerItem(itemAxeEcopoiesis, "tool.axeEcopoiesis");
		GameRegistry.registerItem(itemSickleEcopoiesis, "tool.sickleEcopoiesis");
		GameRegistry.registerItem(itemHoeEcopoiesis, "tool.hoeEcopoiesis");
		
		
		String category = "itemtweaks";
		String comment = "Random chance to have the item spawn its effect";

		
		
	}

	public static void initialize() {

		bucketEcopoiesis = itemBucket.addItem(0, "bucketEcopoiesis", 1);
		bucketGenesis = itemBucket.addItem(1, "bucketGenesis", 1);
		

		dustEcopoiesis = itemMaterial.addItem(37, "dustEcopoiesis", 1);
		dustGenesis = itemMaterial.addItem(38, "dustGenesis", 2);

		ingotEcopoiesis = itemMaterial.addItem(69, "ingotEcopoiesis", 1);
		ingotGenesis = itemMaterial.addItem(70, "ingotGenesis", 2);

		nuggetEcopoiesis = itemMaterial.addItem(101, "nuggetEcopoiesis");
		nuggetGenesis = itemMaterial.addItem(102, "nuggetGenesis");

		gearEcopoiesis = itemMaterial.addItem(133, "gearEcopoiesis");
		gearGenesis = itemMaterial.addItem(134, "gearGenesis");

		
		ItemHelper.addGearRecipe(gearEcopoiesis, "ingotEcopoiesis");
		ItemHelper.addGearRecipe(gearGenesis, "ingotGenesis");
		
		OreDictionary.registerOre("dustEcopoiesis", dustEcopoiesis);
		OreDictionary.registerOre("dustGenesis", dustGenesis);

		OreDictionary.registerOre("ingotEcopoiesis", ingotEcopoiesis);
		OreDictionary.registerOre("ingotGenesis", ingotGenesis);

		OreDictionary.registerOre("nuggetEcopoiesis", nuggetEcopoiesis);
		OreDictionary.registerOre("nuggetGenesis", nuggetGenesis);

		OreDictionary.registerOre("gearEcopoiesis", gearEcopoiesis);
		OreDictionary.registerOre("gearGenesis", gearGenesis);
		
		FurnaceRecipes.smelting().func_151394_a(dustEcopoiesis, ingotEcopoiesis, 0.0F);
		FurnaceRecipes.smelting().func_151394_a(dustGenesis, ingotGenesis, 0.0F);
		
		GameRegistry.registerItem(itemSwordGenesis, "tool.swordGenesis");
		GameRegistry.registerItem(itemShovelGenesis, "tool.shovelGenesis");
		GameRegistry.registerItem(itemPickaxeGenesis, "tool.pickaxeGenesis");
		GameRegistry.registerItem(itemAxeGenesis, "tool.axeGenesis");
		GameRegistry.registerItem(itemSickleGenesis, "tool.sickleGenesis");
		GameRegistry.registerItem(itemHoeGenesis, "tool.hoeGenesis");
		
		GameRegistry.registerItem(itemSwordEcopoiesis, "tool.swordEcopoiesis");
		GameRegistry.registerItem(itemShovelEcopoiesis, "tool.shovelEcopoiesis");
		GameRegistry.registerItem(itemPickaxeEcopoiesis, "tool.pickaxeEcopoiesis");
		GameRegistry.registerItem(itemAxeEcopoiesis, "tool.axeEcopoiesis");
		GameRegistry.registerItem(itemSickleEcopoiesis, "tool.sickleEcopoiesis");
		GameRegistry.registerItem(itemHoeEcopoiesis, "tool.hoeEcopoiesis");

	}

	public static void postInit() 
	{
		
		ItemHelper.addStorageRecipe(ingotEcopoiesis, "nuggetEcopoiesis");
		ItemHelper.addStorageRecipe(ingotGenesis, "nuggetGenesis");
		
		

		BucketHandler.registerBucket(TerraBlocks.blockFluidEcopoiesis, 0, bucketEcopoiesis);
		BucketHandler.registerBucket(TerraBlocks.blockFluidGenesis, 0, bucketGenesis);


		FluidContainerRegistry.registerFluidContainer(TerraFluids.fluidEcopoiesis, bucketEcopoiesis, FluidContainerRegistry.EMPTY_BUCKET);
		FluidContainerRegistry.registerFluidContainer(TerraFluids.fluidGenesis, bucketGenesis, FluidContainerRegistry.EMPTY_BUCKET);

	}
	
	public static boolean[] genesisEnable = new boolean[6];
	public static boolean[] ecopoiesisEnable = new boolean[6];
	
	public static boolean[] genesisEnableFeature = new boolean[6];
	public static boolean[] ecopoiesisEnableFeature = new boolean[6];
	
	
	public static int[] genesisFeatureChance = new int[6];
	public static int[] ecopoiesisFeatureChance = new int[6];
	public static int AXE = 0,
					   SWORD = 1, 
					   SHOVEL = 2, 
					   PICKAXE = 3,
					   HOE = 4,
					   SICKLE = 5;
	
	
	static {
		String category = "genesisitem.enableitem";
		genesisEnable[AXE] = TerraCraft.config.get(category, TOOL_CONFIG_GENESIS + "Axe", true);
		genesisEnable[SWORD] = TerraCraft.config.get(category, TOOL_CONFIG_GENESIS + "Sword", true);
		genesisEnable[SHOVEL] = TerraCraft.config.get(category, TOOL_CONFIG_GENESIS + "Shovel", true);
		genesisEnable[PICKAXE] = TerraCraft.config.get(category, TOOL_CONFIG_GENESIS + "Pickaxe", true);
		genesisEnable[HOE] = TerraCraft.config.get(category, TOOL_CONFIG_GENESIS + "Hoe", true);
		genesisEnable[SICKLE] = TerraCraft.config.get(category, TOOL_CONFIG_GENESIS + "Sickle", true);

	}
	
	static {
		String category = "ecopoiesisitem.enableitem";
		ecopoiesisEnable[AXE] = TerraCraft.config.get(category, TOOL_CONFIG_ECOPOIESIS + "Axe", true);
		ecopoiesisEnable[SWORD] = TerraCraft.config.get(category, TOOL_CONFIG_ECOPOIESIS + "Sword", true);
		ecopoiesisEnable[SHOVEL] = TerraCraft.config.get(category, TOOL_CONFIG_ECOPOIESIS + "Shovel", true);
		ecopoiesisEnable[PICKAXE] = TerraCraft.config.get(category, TOOL_CONFIG_ECOPOIESIS + "Pickaxe", true);
		ecopoiesisEnable[HOE] = TerraCraft.config.get(category, TOOL_CONFIG_ECOPOIESIS + "Hoe", true);
		ecopoiesisEnable[SICKLE] = TerraCraft.config.get(category, TOOL_CONFIG_ECOPOIESIS + "Sickle", true);

	}
	
	static {
		String category = "genesisitem.feature";
		genesisEnableFeature[AXE] = TerraCraft.config.get(category, TOOL_CONFIG_GENESIS + "Axe", true);
		genesisEnableFeature[SWORD] = TerraCraft.config.get(category, TOOL_CONFIG_GENESIS + "Sword", true);
		genesisEnableFeature[SHOVEL] = TerraCraft.config.get(category, TOOL_CONFIG_GENESIS + "Shovel", true);
		genesisEnableFeature[PICKAXE] = TerraCraft.config.get(category, TOOL_CONFIG_GENESIS + "Pickaxe", true);
		genesisEnableFeature[HOE] = TerraCraft.config.get(category, TOOL_CONFIG_GENESIS + "Hoe", true);
		genesisEnableFeature[SICKLE] = TerraCraft.config.get(category, TOOL_CONFIG_GENESIS + "Sickle", true);

	}
	
	static {
		String category = "ecopoiesisitem.feature";
		ecopoiesisEnableFeature[AXE] = TerraCraft.config.get(category, TOOL_CONFIG_ECOPOIESIS + "Axe", true);
		ecopoiesisEnableFeature[SWORD] = TerraCraft.config.get(category, TOOL_CONFIG_ECOPOIESIS + "Sword", true);
		ecopoiesisEnableFeature[SHOVEL] = TerraCraft.config.get(category, TOOL_CONFIG_ECOPOIESIS + "Shovel", true);
		ecopoiesisEnableFeature[PICKAXE] = TerraCraft.config.get(category, TOOL_CONFIG_ECOPOIESIS + "Pickaxe", true);
		ecopoiesisEnableFeature[HOE] = TerraCraft.config.get(category, TOOL_CONFIG_ECOPOIESIS + "Hoe", true);
		ecopoiesisEnableFeature[SICKLE] = TerraCraft.config.get(category, TOOL_CONFIG_ECOPOIESIS + "Sickle", true);

	}
	
	static {
		String category = "genesisitem.feature.chance";
		genesisFeatureChance[AXE] = TerraCraft.config.get(category, TOOL_CONFIG_GENESIS + "Axe", 3);
		genesisFeatureChance[SWORD] = TerraCraft.config.get(category, TOOL_CONFIG_GENESIS + "Sword", 3);
		genesisFeatureChance[SHOVEL] = TerraCraft.config.get(category, TOOL_CONFIG_GENESIS + "Shovel", 3);
		genesisFeatureChance[PICKAXE] = TerraCraft.config.get(category, TOOL_CONFIG_GENESIS + "Pickaxe", 3);
		genesisFeatureChance[HOE] = TerraCraft.config.get(category, TOOL_CONFIG_GENESIS + "Hoe", 3);
		genesisFeatureChance[SICKLE] = TerraCraft.config.get(category, TOOL_CONFIG_GENESIS + "Sickle", 3);

	}
	
	static {
		String category = "ecopoiesisitem.feature.chance";
		ecopoiesisFeatureChance[AXE] = TerraCraft.config.get(category, TOOL_CONFIG_ECOPOIESIS + "Axe", 3);
		ecopoiesisFeatureChance[SWORD] = TerraCraft.config.get(category, TOOL_CONFIG_ECOPOIESIS + "Sword", 3);
		ecopoiesisFeatureChance[SHOVEL] = TerraCraft.config.get(category, TOOL_CONFIG_ECOPOIESIS + "Shovel", 3);
		ecopoiesisFeatureChance[PICKAXE] = TerraCraft.config.get(category, TOOL_CONFIG_ECOPOIESIS + "Pickaxe", 3);
		ecopoiesisFeatureChance[HOE] = TerraCraft.config.get(category, TOOL_CONFIG_ECOPOIESIS + "Hoe", 3);
		ecopoiesisFeatureChance[SICKLE] = TerraCraft.config.get(category, TOOL_CONFIG_ECOPOIESIS + "Sickle", 3);

	}



	public static TerraItemBucket itemBucket;
	public static TerraItemBase itemMaterial;

	public static ItemStack bucketEcopoiesis;
	public static ItemStack bucketGenesis;

	public static ItemStack ingotEcopoiesis;
	public static ItemStack ingotGenesis;

	public static ItemStack dustEcopoiesis;
	public static ItemStack dustGenesis;

	public static ItemStack nuggetEcopoiesis;
	public static ItemStack nuggetGenesis;

	public static ItemStack gearEcopoiesis;
	public static ItemStack gearGenesis;
	
	
	public static Item itemSwordGenesis;
	public static Item itemShovelGenesis;
	public static Item itemPickaxeGenesis;
	public static Item itemAxeGenesis;
	public static Item itemSickleGenesis;
	public static Item itemHoeGenesis;
	
	public static Item itemSwordEcopoiesis;
	public static Item itemShovelEcopoiesis;
	public static Item itemPickaxeEcopoiesis;
	public static Item itemAxeEcopoiesis;
	public static Item itemSickleEcopoiesis;
	public static Item itemHoeEcopoiesis;
	
	public static final Item.ToolMaterial TOOL_MATERIAL_GENESIS = EnumHelper.addToolMaterial("TC_GENESIS", 3, 100, 8.0F, 0, 25);
	public static final Item.ToolMaterial TOOL_MATERIAL_ECOPOIESIS = EnumHelper.addToolMaterial("TC_ECOPOIESIS", 3, 100, 8.0F, 0, 25);




	
}
