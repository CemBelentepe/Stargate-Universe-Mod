package theccb.sgu.handlers;

import theccb.sgu.init.ModBlocks;
import theccb.sgu.init.ModItems;

public class RegistryHandler {
	public static void Common() {
		ModItems.init();
		ModItems.register();
		ModBlocks.init();
		ModBlocks.register();
	}
	
	public static void Client() {
		
	}
}
