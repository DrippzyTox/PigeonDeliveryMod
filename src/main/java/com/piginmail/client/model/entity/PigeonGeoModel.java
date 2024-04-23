package com.piginmail.client.model.entity;

import com.piginmail.Pigindelivery;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class PigeonGeoModel extends DefaultedEntityGeoModel {
    public PigeonGeoModel() {
        super(new Identifier(Pigindelivery.MOD_ID, "pigeon"));
    }

    @Override
    public Identifier getTextureResource(GeoAnimatable animatable) {
        return new Identifier(Pigindelivery.MOD_ID, "textures/entity/forest_pigeon.png");
    }
}
