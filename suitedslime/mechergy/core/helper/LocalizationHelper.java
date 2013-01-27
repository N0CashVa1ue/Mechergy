package suitedslime.mechergy.core.helper;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHelper {
	public static String getLocalString(String key) {
		LanguageRegistry lr = LanguageRegistry.instance();
		String localString = lr.getStringLocalization(key);
		if (localString.equals("")) {
			localString = lr.getStringLocalization(key, "en_GB");
		}
		return localString;
	}
}
