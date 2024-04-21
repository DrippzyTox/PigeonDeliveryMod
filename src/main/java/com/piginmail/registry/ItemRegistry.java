package com.piginmail.registry;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public class ItemRegistry {
    private static final Map<String, Item> Items = new HashMap<>();

    public static Item register(String name, Item item) {
        Items.put(name, item);
        return Registry.register(Registries.ITEM, new Identifier("pigin_mail", name), item);
    }

    public static Map<String, Item> getItems() {
        return Items;
    }
}