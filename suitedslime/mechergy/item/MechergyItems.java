package suitedslime.mechergy.item;

import net.minecraftforge.common.Configuration;

public class MechergyItems {
	public static ItemGear gear;
	
	public static int gearID;
	
	public static void loadConfig(Configuration config){
		int baseID = 4500;
		gearID = getItemConfig(config, "gear", baseID++);
	}
	
	private static int getItemConfig(Configuration config, String key, int defaultID) {
		return config.getItem(config.CATEGORY_ITEM, key, defaultID).getInt(defaultID);
	}
	
	public static void registerItems(){
		gear = new ItemGear(gearID);
	}
}
