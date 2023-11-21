package net.fadingdragon.extraemeralds;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fadingdragon.extraemeralds.datagen.ItemTagGen;
import net.fadingdragon.extraemeralds.datagen.LanguageGen;
import net.fadingdragon.extraemeralds.datagen.ModelsGen;
import net.fadingdragon.extraemeralds.datagen.RecipeGeneration;

public class ExtraEmeraldsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(LanguageGen::new);
		pack.addProvider(ModelsGen::new);
		pack.addProvider(ItemTagGen::new);
		pack.addProvider(RecipeGeneration::new);

	}
}
