package theccb.sgu.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Panel extends Item{
	public Panel(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
	}
}
