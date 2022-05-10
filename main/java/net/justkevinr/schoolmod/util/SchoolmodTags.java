package net.justkevinr.schoolmod.util;

import net.justkevinr.schoolmod.SchoolMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class SchoolmodTags {

    public static class Blocks{

        private static Tags.IOptionalNamedTag<Block> createTag(String name){
            return BlockTags.createOptional(new ResourceLocation(SchoolMod.MOD_ID, name));
        }
        private static Tags.IOptionalNamedTag<Block> createForgeTag(String name){
            return BlockTags.createOptional(new ResourceLocation("Forge", name));
        }
    }

    public static class Items{

        public static final Tags.IOptionalNamedTag<Item> AMETHYST = createForgeTag("gems/amethyst");
        public static final Tags.IOptionalNamedTag<Item> RUBY = createForgeTag("gems/ruby");
        public static final Tags.IOptionalNamedTag<Item> COPPER = createForgeTag("gems/copper");

        private static Tags.IOptionalNamedTag<Item> createTag(String name){
            return ItemTags.createOptional(new ResourceLocation(SchoolMod.MOD_ID, name));
        }
        private static Tags.IOptionalNamedTag<Item> createForgeTag(String name){
            return ItemTags.createOptional(new ResourceLocation("Forge", name));
        }
    }
}
