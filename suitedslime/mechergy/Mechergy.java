package suitedslime.mechergy;

import java.util.logging.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;

import suitedslime.mechergy.block.MechergyBlocks;
import suitedslime.mechergy.core.proxy.CommonProxy;
import suitedslime.mechergy.creativetab.CreativeTabMech;
import suitedslime.mechergy.item.MechergyItems;
import suitedslime.mechergy.lib.Reference;
import suitedslime.mechergy.recipe.MechergyRecipes;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.ServerStarting;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version="0.0.1|pre1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Mechergy {

	@Instance(Reference.MOD_ID)
	public static Mechergy instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	public static Logger mLog = Logger.getLogger("Mechergy");
	private Configuration config;
	public static CreativeTabs tabsMech = new CreativeTabMech(CreativeTabs.getNextID(), Reference.MOD_ID);
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		mLog.setParent(FMLLog.getLogger());
		mLog.info("Loading localization");
		LanguageRegistry.instance().loadLocalization("/suitedslime/mechergy/lang/en_GB.properties", "en_GB", false);
		mLog.info("Loading Config");
		loadConfig(event);
		mLog.info("Adding Items");
		MechergyItems.registerItems();
		mLog.info("Adding Blocks");
		MechergyBlocks.registerBlocks();
		mLog.info("Adding Recipes");
		MechergyRecipes.getInstance().RegisterRecipes();
	}

	@Init
	public void load(FMLInitializationEvent event) {
		// Initialize custom rendering and pre-load textures (Client only)
		proxy.initRenderingAndTextures();
	}
	
	@PostInit
	public void modsLoaded(FMLPostInitializationEvent event){
		
	}
	
	@ServerStarting
	public void serverStarting(FMLServerStartingEvent event){
		private void loadConfig(FMLPreInitializationEvent event){
		 	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		 	MechergyBlocks.loadConfig(config);
		 	MechergyItems.loadConfig(config);
		 	config.save();
		 	this.config = config;
		 }
	}
}
