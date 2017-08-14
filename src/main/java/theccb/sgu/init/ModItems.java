package theccb.sgu.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import theccb.sgu.items.Panel;

public class ModItems {
	
	public static Item stone_panel, dialing_crystal;
	
	public static void init() {
		stone_panel = new Panel("stone_panel");
		dialing_crystal = new Panel("dialing_crystal");
	}
	public static void register() {
		registerItem(stone_panel);
		registerItem(dialing_crystal);
	}
	public static void registerItem(Item item) {
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
