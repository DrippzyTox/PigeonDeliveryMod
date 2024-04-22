package com.piginmail.data.gen.provider;

import com.piginmail.registry.ItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class PDModelProvider extends FabricModelProvider {
    private final Model TEMPLATE_SPAWN_EGG = item("template_spawn_egg");
    public PDModelProvider(FabricDataOutput output) {
        super(output);
    }

    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    };

    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        ItemRegistry.getItems().forEach((s, item) -> {
            if (item instanceof SpawnEggItem) {
                itemModelGenerator.register(item, TEMPLATE_SPAWN_EGG);
            } else {
                itemModelGenerator.register(item, Models.GENERATED);
            }
        });
    };

    private static Model item(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(new Identifier("minecraft", "item/" + parent)), Optional.empty(), requiredTextureKeys);
    }
}
