package com.benonardo.vmmod.fabric;

import com.benonardo.vmmod.fabric.registry.VmItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class VmMod implements ModInitializer {

    public static final String MOD_ID = "vmmod";

    public static final ItemGroup VM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "vanillaminigames"),
            () -> new ItemStack(VmItems.TOMATO)
    );

    @Override
    public void onInitialize() {
        VmItems.RegisterItems();
    }
}
