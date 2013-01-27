package suitedslime.mechergy.item;

import net.minecraftforge.common.Configuration;

public class MechergyItems {
	public static ItemGear gear;
	public static ItemCopperIngot copperIngot;
	public static ItemPlatinumIngot platinumIngot;
	
	public static int gearID;
	public static int copperIngotID;
	public static int platinumIngotID;
	
	public static void loadConfig(Configuration config){
		int baseID = 4500;
		gearID = getItemConfig(config, "gear", baseID++);
		copperIngotID = getItemConfig(config, "copperIngot", baseID++);
		platinumIngotID = getItemConfig(config, "platinumIngot", baseID++);
	}
	
	private static int getItemConfig(Configuration config, String key, int defaultID) {
		return config.getItem(config.CATEGORY_ITEM, key, defaultID).getInt(defaultID);
	}
	
	public static void registerItems(){
		gear = new ItemGear(gearID);
		copperIngot = new ItemCopperIngot(copperIngotID);
		platinumIngot = new ItemPlatinumIngot(platinumIngotID);
	}
}
