package theccb.sgu.init;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import theccb.sgu.blocks.CustomBlock;
import theccb.sgu.items.Panel;

public class ModBlocks {
	
	//Blocks
	public static Block base_block, chevron_block, stargate_block, dhd, naquadah_block, naquadria_block;
	
	//Ores
	public static Block naquadah_ore, trinium_ore;
	
	//Mechanics
	public static Block naquadah_generator, naquadria_compressor;
	
	public static void init() {
		base_block = new CustomBlock("base_block");
		chevron_block = new CustomBlock("chevron_block");
		stargate_block = new CustomBlock("stargate_block");
		dhd = new CustomBlock("dhd");
		naquadah_block = new CustomBlock("naquadah_block");
		naquadria_block = new CustomBlock("naquadria_block");
		
		naquadah_ore = new CustomBlock("naquadah_ore");
		trinium_ore = new CustomBlock("trinium_ore");
	}
	public static void register() {
		registerBlock(base_block);
		registerBlock(chevron_block);
		registerBlock(stargate_block);
		registerBlock(dhd);
		registerBlock(naquadah_block);
		registerBlock(naquadria_block);

		registerBlock(naquadah_ore);
		registerBlock(trinium_ore);
	}
	public static void registerBlock(Block block) {
		ForgeRegistries.BLOCKS.register(block);
		Item item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
