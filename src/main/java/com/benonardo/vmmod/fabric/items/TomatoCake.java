package com.benonardo.vmmod.fabric.items;

import com.benonardo.vmmod.fabric.VmMod;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class TomatoCake extends Item {
    public TomatoCake() {
        super(new Settings()
                .group(VmMod.VM_GROUP)
                .food(new FoodComponent.Builder()
                        .hunger(10)
                        .saturationModifier(3.0f)
                        .build()
                )
        );
    }
}
