package suitedslime.mechergy.item;

import suitedslime.mechergy.Mechergy;
import suitedslime.mechergy.lib.Sprites;
import suitedslime.mechergy.lib.Strings;
import net.minecraft.item.Item;

public class ItemCopperIngot extends Item {
	public ItemCopperIngot(int par1) {
		super(par1);
		this.setItemName(Strings.COPPER_INGOT_NAME);
		this.setCreativeTab(Mechergy.tabsMech);
		this.setIconIndex(5);
	}
	
	@Override
    public String getTextureFile() {
        return Sprites.SPRITE_SHEET_LOCATION + Sprites.ITEM_SPRITE_SHEET;
    }
}
