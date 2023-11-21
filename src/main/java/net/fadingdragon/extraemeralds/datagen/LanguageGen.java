package net.fadingdragon.extraemeralds.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.fadingdragon.extraemeralds.item.EmeraldItemGroup;
import net.fadingdragon.extraemeralds.item.EmeraldItems;

public class LanguageGen extends FabricLanguageProvider {
    public LanguageGen(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(EmeraldItems.EMERALD_AXE, "Emerald Axe");
        translationBuilder.add(EmeraldItems.EMERALD_SHOVEL, "Emerald Shovel");
        translationBuilder.add(EmeraldItems.EMERALD_HOE, "Emerald Hoe");
        translationBuilder.add(EmeraldItems.EMERALD_SWORD, "Emerald Sword");
        translationBuilder.add(EmeraldItems.EMERALD_PICKAXE, "Emerald Pickaxe");
        translationBuilder.add(String.valueOf(EmeraldItemGroup.EMERALD_GROUP), "Emerald Group");
        translationBuilder.add(EmeraldItems.EMERALD_CHESTPLATE, "Emerald Chestplate");
        translationBuilder.add(EmeraldItems.EMERALD_LEGGINGS, "Emerald Leggings");
        translationBuilder.add(EmeraldItems.EMERALD_BOOTS, "Emerald Boots");
        translationBuilder.add(EmeraldItems.EMERALD_HELMET, "Emerald Helmet");
    }
}
