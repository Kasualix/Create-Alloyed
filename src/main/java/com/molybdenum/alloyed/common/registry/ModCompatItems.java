package com.molybdenum.alloyed.common.registry;

import com.molybdenum.alloyed.Alloyed;
import com.molybdenum.alloyed.common.compat.farmersdelight.FarmersDelightCompat;
import com.molybdenum.alloyed.common.compat.hidden.HiddenItem;
import com.simibubi.create.repack.registrate.util.entry.ItemEntry;
import net.minecraft.item.Item;

@SuppressWarnings("unused")
public class ModCompatItems {
    // Farmer's Delight
    public static final ItemEntry<Item> STEEL_KNIFE = ModItems.handheldItem(
            "steel_knife",
            properties -> Alloyed.isFarmersDelightLoaded ?
                    FarmersDelightCompat.newSteelKnife(properties) :
                    new HiddenItem(properties.stacksTo(1)),
            ModTags.Items.STEEL_KNIFE, ModTags.Items.STEEL_KNIFE_FD
    );

    public static void register() { Alloyed.LOGGER.debug("Registering ModCompatItems!"); }
}
