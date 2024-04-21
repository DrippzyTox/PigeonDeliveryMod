package com.piginmail.data.gen.provider;

import com.piginmail.registry.ItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class PDModelProvider extends FabricModelProvider {
    public PDModelProvider(FabricDataOutput output) {
        super(output);
    }

    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    };

    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        ItemRegistry.getItems().forEach((s, item) -> itemModelGenerator.register(item, Models.GENERATED));
    };
}
