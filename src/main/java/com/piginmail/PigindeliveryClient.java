package com.piginmail;

import com.piginmail.entity.ModEntities;
import com.piginmail.entity.client.ModModelLayers;
import com.piginmail.entity.client.PigeonModel;
import com.piginmail.entity.client.PigeonRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class PigindeliveryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient()
    {
        EntityRendererRegistry.register(ModEntities.PIGEON, PigeonRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.PIGEON, PigeonModel::getTexturedModelData);
    }
}
