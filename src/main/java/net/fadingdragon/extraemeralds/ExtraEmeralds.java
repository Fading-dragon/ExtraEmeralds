package net.fadingdragon.extraemeralds;

import net.fabricmc.api.ModInitializer;

import net.fadingdragon.extraemeralds.item.EmeraldItemGroup;
import net.fadingdragon.extraemeralds.item.EmeraldItems;
import net.fadingdragon.extraemeralds.util.EmeraldCustomTrades;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtraEmeralds implements ModInitializer {
	public static final String MOD_ID = "extraemeralds";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		EmeraldItems.registerModItems();
		EmeraldItemGroup.registerItemGroups();
		EmeraldCustomTrades.registerCustomTrades();

		LOGGER.info("Hello Fabric world!");
	}
}