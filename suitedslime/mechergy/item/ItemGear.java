package suitedslime.mechergy.item;

import suitedslime.mechergy.Mechergy;
import suitedslime.mechergy.lib.Strings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

public class ItemGear extends Item{
	
	public static final String[] gearNames = new String[] {"iron", "copper", "gold", "diamond", "platinum"};

	public ItemGear(int par1) {
		super(par1);
		this.setItemName(Strings.GEAR_NAME);
		this.setCreativeTab(Mechergy.tabsMech);
		this.setIconIndex(0);
		this.setHasSubtypes(true);
	}
	
	public int getIconFromDamage(int damage) {
		return this.iconIndex + damage;
	}

	public String getItemNameIS(ItemStack par1ItemStack) {
		return super.getItemName() + "." + gearNames[par1ItemStack.getItemDamage()];
	}
	
	
	
}
