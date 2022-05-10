package net.justkevinr.schoolmod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup SCHOOL_GROUP = new ItemGroup("schoolModTab") {
        @Override
        public ItemStack createIcon() {
            //Set this item as tab icon
            return new ItemStack(ModItems.AMETHYST.get());
        }
    };
}
