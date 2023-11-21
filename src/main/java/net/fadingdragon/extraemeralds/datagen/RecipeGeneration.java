package net.fadingdragon.extraemeralds.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fadingdragon.extraemeralds.item.EmeraldItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

public class RecipeGeneration extends FabricRecipeProvider {
    public RecipeGeneration(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EmeraldItems.EMERALD_PICKAXE, 1).pattern("EEE").pattern(" S ").pattern(" S ").input('E', Items.EMERALD).input('S', Items.STICK).criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(getRecipeName(EmeraldItems.EMERALD_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EmeraldItems.EMERALD_AXE, 1).pattern(" EE").pattern(" SE").pattern(" S ").input('E', Items.EMERALD).input('S', Items.STICK).criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(getRecipeName(EmeraldItems.EMERALD_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, EmeraldItems.EMERALD_SWORD, 1).pattern(" E ").pattern(" E ").pattern(" S ").input('E', Items.EMERALD).input('S', Items.STICK).criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(getRecipeName(EmeraldItems.EMERALD_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EmeraldItems.EMERALD_SHOVEL, 1).pattern(" E ").pattern(" S ").pattern(" S ").input('E', Items.EMERALD).input('S', Items.STICK).criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(getRecipeName(EmeraldItems.EMERALD_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, EmeraldItems.EMERALD_HOE, 1).pattern(" EE").pattern(" S ").pattern(" S ").input('E', Items.EMERALD).input('S', Items.STICK).criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter, new Identifier(getRecipeName(EmeraldItems.EMERALD_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, EmeraldItems.EMERALD_HELMET, 1).pattern("EEE").pattern("E E").input('E', Items.EMERALD).criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD)).offerTo(exporter, new Identifier(getRecipeName(EmeraldItems.EMERALD_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, EmeraldItems.EMERALD_CHESTPLATE, 1).pattern("E E").pattern("EEE").pattern("EEE").input('E', Items.EMERALD).criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD)).offerTo(exporter, new Identifier(getRecipeName(EmeraldItems.EMERALD_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, EmeraldItems.EMERALD_LEGGINGS, 1).pattern("EEE").pattern("E E").pattern("E E").input('E', Items.EMERALD).criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD)).offerTo(exporter, new Identifier(getRecipeName(EmeraldItems.EMERALD_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, EmeraldItems.EMERALD_BOOTS, 1).pattern("E E").pattern("E E").input('E', Items.EMERALD).criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD)).offerTo(exporter, new Identifier(getRecipeName(EmeraldItems.EMERALD_BOOTS)));

    }
}
