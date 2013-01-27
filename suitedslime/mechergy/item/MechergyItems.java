package suitedslime.mechergy.item;

public class MechergyItems {
	public static ItemGear gear;
	
	public static int gearID;
	
	
	public static void registerItems(){
		gear = new ItemGear(gearID);
	}
}
