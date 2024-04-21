package com.piginmail.entity.client;

import com.piginmail.entity.custom.PigeonEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class PigeonRenderer extends GeoEntityRenderer<PigeonEntity> {
    public PigeonRenderer(EntityRendererFactory.Context context) {
        super(context, new PigeonGeoModel());
    }
}
