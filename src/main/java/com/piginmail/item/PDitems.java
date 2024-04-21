package com.piginmail.item;

import com.piginmail.item.custom.PipeBombItem;
import com.piginmail.registry.ItemRegistry;
import net.minecraft.item.Item;

public class PDitems {
    public static final Item PIPE_BOMB = new PipeBombItem(new Item.Settings());

    static {
        ItemRegistry.register("pipe_bomb", PIPE_BOMB);
    }

    public static void init() {

    }
}
