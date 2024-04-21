package com.piginmail.entity.client;

import com.piginmail.Pigindelivery;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;

public class PigeonGeoModel extends GeoModel {
    @Override
    public Identifier getModelResource(GeoAnimatable animatable) {
        return new Identifier(Pigindelivery.MOD_ID, "geo/entity/pigeon.geo.json");
    }

    @Override
    public Identifier getTextureResource(GeoAnimatable animatable) {
        return new Identifier(Pigindelivery.MOD_ID, "textures/entity/forest_pigeon.png");
    }

    @Override
    public Identifier getAnimationResource(GeoAnimatable animatable) {
        return new Identifier(Pigindelivery.MOD_ID, "animations/entity/pigeon.animation.json");
    }
}
