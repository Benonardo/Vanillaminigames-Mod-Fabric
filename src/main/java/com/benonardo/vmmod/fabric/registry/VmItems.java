package com.benonardo.vmmod.fabric.registry;

import com.benonardo.vmmod.fabric.VmMod;
import com.benonardo.vmmod.fabric.items.BasicItem;
import com.benonardo.vmmod.fabric.items.PoisonTomato;
import com.benonardo.vmmod.fabric.items.Tomato;
import com.benonardo.vmmod.fabric.items.TomatoCake;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.minecraft.util.registry.Registry.register;

public class VmItems {

    public static final Item TOMATO = new Tomato();
    public static final Item POISON_TOMATO = new PoisonTomato();
    public static final Item TOMATO_CAKE = new TomatoCake();
    public static final Item TROLL_FACE = new BasicItem();
    public static final Item UNBAKED_TOMATO_CAKE = new BasicItem();

    public static void RegisterItems() {
        register(Registry.ITEM, new Identifier(VmMod.MOD_ID, "tomato"), TOMATO);
        register(Registry.ITEM, new Identifier(VmMod.MOD_ID, "poison_tomato"), POISON_TOMATO);
        register(Registry.ITEM, new Identifier(VmMod.MOD_ID, "tomato_cake"), TOMATO_CAKE);
        register(Registry.ITEM, new Identifier(VmMod.MOD_ID, "troll_face"), TROLL_FACE);
        register(Registry.ITEM, new Identifier(VmMod.MOD_ID, "unbaked_tomato_cake"), UNBAKED_TOMATO_CAKE);
    }
}
