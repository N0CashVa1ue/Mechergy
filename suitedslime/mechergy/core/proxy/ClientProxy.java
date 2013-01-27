package suitedslime.mechergy.core.proxy;

import suitedslime.mechergy.lib.Sprites;

import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void initRenderingAndTextures() {
		MinecraftForgeClient.preloadTexture(Sprites.SPRITE_SHEET_LOCATION + Sprites.BLOCK_SPRITE_SHEET);
		MinecraftForgeClient.preloadTexture(Sprites.SPRITE_SHEET_LOCATION + Sprites.ITEM_SPRITE_SHEET);
	}
}
