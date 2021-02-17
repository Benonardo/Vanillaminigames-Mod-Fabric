package com.benonardo.vmmod.fabric.registry;

import com.benonardo.vmmod.fabric.VmMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class VmItems {

    public static final Item TOMATO = new Item(new Item.Settings().group(VmMod.VM_GROUP));
    public static final Item POISON_TOMATO = new Item(new Item.Settings().group(VmMod.VM_GROUP));
    public static final Item TOMATO_CAKE = new Item(new Item.Settings().group(VmMod.VM_GROUP));
    public static final Item TROLL_FACE = new Item(new Item.Settings().group(VmMod.VM_GROUP));
    public static final Item UNBAKED_TOMATO_CAKE = new Item(new Item.Settings().group(VmMod.VM_GROUP));

    public static void RegisterItems() {
        Registry.register(Registry.ITEM, new Identifier(VmMod.MOD_ID, "tomato"), TOMATO);
        Registry.register(Registry.ITEM, new Identifier(VmMod.MOD_ID, "poison_tomato"), POISON_TOMATO);
        Registry.register(Registry.ITEM, new Identifier(VmMod.MOD_ID, "tomato_cake"), TOMATO_CAKE);
        Registry.register(Registry.ITEM, new Identifier(VmMod.MOD_ID, "troll_face"), TROLL_FACE);
        Registry.register(Registry.ITEM, new Identifier(VmMod.MOD_ID, "unbaked_tomato_cake"), UNBAKED_TOMATO_CAKE);
    }
}
