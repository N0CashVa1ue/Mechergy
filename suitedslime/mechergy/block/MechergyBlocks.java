package suitedslime.mechergy.block;

import net.minecraftforge.common.Configuration;

public class MechergyBlocks {
	
	public static BlockPress machinePress;
	
	public static int machinePressID;
	
	public static void loadConfig(Configuration config){
		int baseID = 880;
		machinePressID = getBlockConfig(config, "gear", baseID++);
	}

	private static int getBlockConfig(Configuration config, String key, int defaultID) {
		return config.getItem(config.CATEGORY_BLOCK, key, defaultID).getInt(defaultID);
	}
	
	public static void registerBlocks(){
		machinePress = new BlockPress(machinePressID);
	}
}
