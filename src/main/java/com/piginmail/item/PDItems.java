package com.piginmail.item;

import com.piginmail.item.custom.PipeBombItem;
import com.piginmail.registry.ItemRegistry;
import net.minecraft.item.Item;

public class PDitems {
    public static final Item PIPE_BOMB = new PipeBombItem(new Item.Settings());
    public static final Item BREAD_CRUMBS = new Item(new Item.Settings());


    static {
        ItemRegistry.register("pipe_bomb", PIPE_BOMB);
        ItemRegistry.register("bread_crumbs", BREAD_CRUMBS);
    }

    public static void init() {

    }
}
