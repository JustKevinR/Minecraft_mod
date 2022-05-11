package net.justkevinr.schoolmod.world.gen;

import net.justkevinr.schoolmod.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {
    AMETHYST(Lazy.of(ModBlocks.AMETHYST_ORE), 13, 25, 50),
    COPPER(Lazy.of(ModBlocks.COPPER_ORE), 10, 25, 50),
    RUBY(Lazy.of(ModBlocks.RUBY_ORE), 20, 25, 50);
    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;

    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }
    public static OreType get(Block block){
        for (OreType ore : values()){
            if (block == ore.block){
                return ore;
            }
        }
        return null;
    }
}
