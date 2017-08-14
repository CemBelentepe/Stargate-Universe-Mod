package theccb.sgu.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CustomBlock extends Block {

	public CustomBlock(String name) {
		super(Material.ROCK);
		setRegistryName(name);
		setUnlocalizedName(name);
		setHardness(2.5f);
		setResistance(15f);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	public CustomBlock(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(2.5f);
		setResistance(15f);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	public CustomBlock(String name, CreativeTabs creativeTab) {
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(2.5f);
		setResistance(15f);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(creativeTab);
	}
	public CustomBlock(String name, float hardness, float resistance, CreativeTabs creativeTab) {
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(creativeTab);
	}

}
