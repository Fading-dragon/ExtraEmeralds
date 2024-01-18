package net.fadingdragon.extraemeralds.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class EmeraldCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 5,
                factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.COAL, 64),
                    new ItemStack(Items.EMERALD, 10),
                    10, 25, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 5,
                factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.COAL, 64),
                    new ItemStack(Items.EMERALD, 10),
                    10, 25, 0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 2,
                factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(EmeraldItems.EMERALD_PICKAXE, 1),
                    10, 25, 0.05f));
                });
    }
}
