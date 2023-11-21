package net.fadingdragon.extraemeralds.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fadingdragon.extraemeralds.ExtraEmeralds;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class EmeraldItemGroup {
    public static final ItemGroup EMERALD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ExtraEmeralds.MOD_ID, "emerald"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.emerald"))
                    .icon(() -> new ItemStack(Items.EMERALD)).entries((displayContext, entries) ->  {
                        entries.add(EmeraldItems.EMERALD_AXE);
                        entries.add(EmeraldItems.EMERALD_PICKAXE);
                        entries.add(EmeraldItems.EMERALD_HOE);
                        entries.add(EmeraldItems.EMERALD_SWORD);
                        entries.add(EmeraldItems.EMERALD_SHOVEL);
                        entries.add(EmeraldItems.EMERALD_CHESTPLATE);
                        entries.add(EmeraldItems.EMERALD_LEGGINGS);
                        entries.add(EmeraldItems.EMERALD_BOOTS);
                        entries.add(EmeraldItems.EMERALD_HELMET);
                    }).build());

    public static void registerItemGroups() {
        ExtraEmeralds.LOGGER.info("Registering Item Group for" + ExtraEmeralds.MOD_ID);
    }
}
