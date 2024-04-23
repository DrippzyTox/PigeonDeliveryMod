package com.piginmail.item.group;

import com.piginmail.item.PDItems;
import com.piginmail.registry.ItemRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class PDItemGroup {
    public static ItemGroup main = FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.piginmail.main"))
            .icon(()-> new ItemStack(PDItems.FOREST_PIGEON))
            .entries((displayContext, entries) -> {
                ItemRegistry.getItems().forEach((s, item) -> entries.add(new ItemStack(item)));
            })
            .build();

    public static void init() {
        Registry.register(Registries.ITEM_GROUP, new Identifier("piginmail", "main"), main);
    }
}
