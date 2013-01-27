package suitedslime.mechergy.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import suitedslime.mechergy.Mechergy;
import suitedslime.mechergy.lib.Sprites;
import suitedslime.mechergy.lib.Strings;

public class BlockPress extends Block {
	public BlockPress(int id) {
		super(id, Material.iron);
		this.setBlockName(Strings.MACHINE_PRESS_NAME);
		this.setCreativeTab(Mechergy.tabsMech);
	}
	
	/*
	 * Get block texture based on side.
	 */
	public int getBlockTextureFromSide(int i){
		switch(i){
		case 0: return 0;
		case 1: return 0;
		default: return 2;
		}
	}
	
	@Override
    public String getTextureFile() {
        return Sprites.SPRITE_SHEET_LOCATION + Sprites.BLOCK_SPRITE_SHEET;
    }

}
