package net.fadingdragon.extraemeralds.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fadingdragon.extraemeralds.item.EmeraldItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModelsGen extends FabricModelProvider {
    public ModelsGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
            itemModelGenerator.register(EmeraldItems.EMERALD_AXE, Models.HANDHELD);
            itemModelGenerator.register(EmeraldItems.EMERALD_PICKAXE, Models.HANDHELD);
            itemModelGenerator.register(EmeraldItems.EMERALD_HOE, Models.HANDHELD);
            itemModelGenerator.register(EmeraldItems.EMERALD_SHOVEL, Models.HANDHELD);
            itemModelGenerator.register(EmeraldItems.EMERALD_SWORD, Models.HANDHELD);
            itemModelGenerator.registerArmor(((ArmorItem) EmeraldItems.EMERALD_HELMET));
            itemModelGenerator.registerArmor(((ArmorItem) EmeraldItems.EMERALD_BOOTS));
            itemModelGenerator.registerArmor(((ArmorItem) EmeraldItems.EMERALD_LEGGINGS));
            itemModelGenerator.registerArmor(((ArmorItem) EmeraldItems.EMERALD_CHESTPLATE));
    }
}
