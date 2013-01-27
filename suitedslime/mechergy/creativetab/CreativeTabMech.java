package suitedslime.mechergy.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabMech extends CreativeTabs {
	
	public CreativeTabMech(int par1, String par2Str){
		super(par1, par2Str);
	}
	
	/**
     * Get the ItemStack that will be rendered to the tab.
     */
    public ItemStack getIconItemStack()
    {
        return new ItemStack(getTabIconItem());
    }
}
