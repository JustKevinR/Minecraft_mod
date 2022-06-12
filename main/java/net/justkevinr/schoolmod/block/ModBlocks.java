package net.justkevinr.schoolmod.block;

import net.justkevinr.schoolmod.SchoolMod;
import net.justkevinr.schoolmod.block.custom.firestoneBlock;
import net.justkevinr.schoolmod.item.ModItemGroup;
import net.justkevinr.schoolmod.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SchoolMod.MOD_ID);

    //blocks here!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public static final RegistryObject<Block> AMETHYST_ORE = registerBlock("amethyst_ore",
            //0 = wood, 4 = nether
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()
                    // 6= emerald
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> AMETHYST_BLOCK = registerBlock("amethyst_block",
            //0 = wood, 4 = nether
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()
                    // 6= emerald
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> COPPER_BLOCK = registerBlock("copper_block",
            //0 = wood, 4 = nether
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()
                    // 6= emerald
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            //0 = wood, 4 = nether
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()
                    // 6= emerald
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> COPPER_STAIRS = registerBlock("copper_stairs",
            () -> new StairsBlock(() -> COPPER_BLOCK.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.IRON).harvestLevel(3).harvestTool(ToolType.PICKAXE)
                            .setRequiresTool().hardnessAndResistance(4f)));

    public static final RegistryObject<Block> AMETHYST_STAIRS = registerBlock("amethyst_stairs",
            () -> new StairsBlock(() -> AMETHYST_BLOCK.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.IRON).harvestLevel(3).harvestTool(ToolType.PICKAXE)
                            .setRequiresTool().hardnessAndResistance(4f)));

    public static final RegistryObject<Block> COPPER_ORE = registerBlock("copper_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> FIRESTONE_BLOCK = registerBlock("firestone_block",
            () -> new firestoneBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()
                    .hardnessAndResistance(4f)));

    public static final RegistryObject<Block> RUBY_STAIRS = registerBlock("ruby_stairs",
            () -> new StairsBlock(() -> RUBY_BLOCK.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.IRON).harvestLevel(3).harvestTool(ToolType.PICKAXE)
                            .setRequiresTool().hardnessAndResistance(4f)));

    public static final RegistryObject<Block> AMETHYST_FENCE = registerBlock("amethyst_fence",
            //0 = wood, 4 = nether
            () -> new FenceBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()
                    // 6= emerald
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> AMETHYST_FENCE_GATE = registerBlock("amethyst_fence_gate",
            //0 = wood, 4 = nether
            () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()
                    // 6= emerald
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> COPPER_FENCE = registerBlock("copper_fence",
            //0 = wood, 4 = nether
            () -> new FenceBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()
                    // 6= emerald
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> COPPER_FENCE_GATE = registerBlock("copper_fence_gate",
            //0 = wood, 4 = nether
            () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()
                    // 6= emerald
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> RUBY_FENCE = registerBlock("ruby_fence",
            //0 = wood, 4 = nether
            () -> new FenceBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()
                    // 6= emerald
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> RUBY_FENCE_GATE = registerBlock("ruby_fence_gate",
            //0 = wood, 4 = nether
            () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()
                    // 6= emerald
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> AMETHYST_SLAB = registerBlock("amethyst_slab",
            //0 = wood, 4 = nether
            () -> new SlabBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()
                    // 6= emerald
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> RUBY_SLAB = registerBlock("ruby_slab",
            //0 = wood, 4 = nether
            () -> new SlabBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()
                    // 6= emerald
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> COPPER_SLAB = registerBlock("copper_slab",
            //0 = wood, 4 = nether
            () -> new SlabBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool()
                    // 6= emerald
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> AMETHYST_BUTTON = registerBlock("amethyst_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(6f).doesNotBlockMovement()));

    public static final RegistryObject<Block> AMETHYST_PRESSURE_PLATE = registerBlock("amethyst_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(6f)));

    public static final RegistryObject<Block> COPPER_BUTTON = registerBlock("copper_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(6f).doesNotBlockMovement()));

    public static final RegistryObject<Block> COPPER_PRESSURE_PLATE = registerBlock("copper_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(6f)));

    public static final RegistryObject<Block> RUBY_BUTTON = registerBlock("ruby_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(6f).doesNotBlockMovement()));

    public static final RegistryObject<Block> RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(6f)));


    //register a block & make a new item for it
    //return T and it has to extend block
    private static <T extends Block>RegistryObject<T>registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);

        return toReturn;
    };

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    };
}
