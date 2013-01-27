package suitedslime.mechergy.item;

import net.minecraft.item.Item;
import suitedslime.mechergy.Mechergy;
import suitedslime.mechergy.lib.Sprites;
import suitedslime.mechergy.lib.Strings;

public class ItemPlatinumIngot extends Item{
	public ItemPlatinumIngot(int par1) {
		super(par1);
		this.setItemName(Strings.PLATINUM_INGOT_NAME);
		this.setCreativeTab(Mechergy.tabsMech);
		this.setIconIndex(6);
	}
	
	@Override
    public String getTextureFile() {
        return Sprites.SPRITE_SHEET_LOCATION + Sprites.ITEM_SPRITE_SHEET;
    }
}
