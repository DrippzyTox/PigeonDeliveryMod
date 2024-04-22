package com.piginmail.client.model;

import com.piginmail.Pigindelivery;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer PIGEON =
            new EntityModelLayer(new Identifier(Pigindelivery.MOD_ID, "pigeon"), "main");

}
