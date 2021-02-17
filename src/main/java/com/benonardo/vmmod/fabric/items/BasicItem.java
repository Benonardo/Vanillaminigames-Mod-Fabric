package com.benonardo.vmmod.fabric.items;

import com.benonardo.vmmod.fabric.VmMod;
import net.minecraft.item.Item;

public class BasicItem extends Item {
    public BasicItem() {
        super(new Settings().group(VmMod.VM_GROUP));
    }
}
