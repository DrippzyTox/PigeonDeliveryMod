package com.piginmail.entity;

import com.piginmail.Pigindelivery;
import com.piginmail.entity.custom.PigeonEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static void registerModEntities() {
        Pigindelivery.LOGGER.info("Setting up the flapping Birds " + Pigindelivery.MOD_ID);
    }

    public static final EntityType<PigeonEntity> PIGEON = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Pigindelivery.MOD_ID, "pigeon"),
            EntityType.Builder.create(PigeonEntity::new, SpawnGroup.CREATURE)
                    .setDimensions(0.28f, 0.28f)
                    .build()
    );
}
