package com.piginmail.item;

import com.piginmail.entity.ModEntities;
import com.piginmail.item.custom.PipeBombItem;
import com.piginmail.registry.ItemRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;

public class PDItems {
    public static final Item PIPE_BOMB = new PipeBombItem(new Item.Settings());
    public static final Item BREAD_CRUMBS = new Item(new Item.Settings());
    public static final Item FOREST_PIGEON = new SpawnEggItem(ModEntities.PIGEON, 0x80FF80, 0x808080, new Item.Settings());


    static {
        ItemRegistry.register("pipe_bomb", PIPE_BOMB);
        ItemRegistry.register("bread_crumbs", BREAD_CRUMBS);
        ItemRegistry.register("forest_pigeon_spawn_egg", FOREST_PIGEON);
    }

    public static void init() {

    }
}
