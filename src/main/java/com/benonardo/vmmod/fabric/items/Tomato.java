package com.benonardo.vmmod.fabric.items;

import com.benonardo.vmmod.fabric.VmMod;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class Tomato extends Item {
    public Tomato() {
        super(new Settings()
                .group(VmMod.VM_GROUP)
                .food(new FoodComponent.Builder()
                        .hunger(5)
                        .saturationModifier(1.5f)
                        .build()
                )
        );
    }
}
