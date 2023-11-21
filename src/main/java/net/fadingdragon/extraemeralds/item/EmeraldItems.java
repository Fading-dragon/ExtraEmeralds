package net.fadingdragon.extraemeralds.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fadingdragon.extraemeralds.ExtraEmeralds;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EmeraldItems {

    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe", new PickaxeItem(EmeraldToolMaterial.EMERALD, 0, -2.5f, new FabricItemSettings()));
    public static final Item EMERALD_AXE = registerItem("emerald_axe", new AxeItem(EmeraldToolMaterial.EMERALD, 4, -3f, new FabricItemSettings()));
    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel", new ShovelItem(EmeraldToolMaterial.EMERALD, 1, -3f, new FabricItemSettings()));
    public static final Item EMERALD_SWORD = registerItem("emerald_sword", new SwordItem(EmeraldToolMaterial.EMERALD, 5, -2.3f, new FabricItemSettings()));
    public static final Item EMERALD_HOE = registerItem("emerald_hoe", new HoeItem(EmeraldToolMaterial.EMERALD, -2, -2.5f, new FabricItemSettings()));

    public static final Item EMERALD_HELMET = registerItem("emerald_helmet",
            new ArmorItem(EmeraldArmorMaterial.EMERALD, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate",
            new ArmorItem(EmeraldArmorMaterial.EMERALD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings",
            new ArmorItem(EmeraldArmorMaterial.EMERALD, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item EMERALD_BOOTS = registerItem("emerald_boots",
            new ArmorItem(EmeraldArmorMaterial.EMERALD, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    private static Item registerItem (String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ExtraEmeralds.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ExtraEmeralds.LOGGER.info("Registering Mod Items for" + ExtraEmeralds.MOD_ID);
    }

}
