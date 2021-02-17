package com.benonardo.vmmod.fabric.items;

import com.benonardo.vmmod.fabric.VmMod;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class PoisonTomato extends Item {
    public PoisonTomato() {
        super(new Settings()
                .group(VmMod.VM_GROUP)
                .food(new FoodComponent.Builder()
                        .hunger(4)
                        .saturationModifier(1.2f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 15 * 20, 0), 1.0f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 15 * 20, 0), 1.0f)
                        .build()
                )
        );
    }
}
