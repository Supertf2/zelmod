package net.zel.zeltest.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zel.zeltest.ZelTest;

public class ModItems {
        public static final Item MOTHER_PLATE = registerItem("mother_plate", new Item(new Item.Settings()));
        public static final Item MINOS_PRIME = registerItem("minos_prime", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ZelTest.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ZelTest.LOGGER.info("Registering Mod Items for " + ZelTest.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {

            fabricItemGroupEntries.add(MOTHER_PLATE);
            fabricItemGroupEntries.add(MINOS_PRIME);
        });
    }

}