package net.justkevinr.schoolmod.item;

import net.justkevinr.schoolmod.SchoolMod;
import net.justkevinr.schoolmod.item.custom.*;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SchoolMod.MOD_ID);

    //Register new item  & item ID
    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> COPPER = ITEMS.register("copper",
            () -> new Item(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> AMETHYST_STICK = ITEMS.register("amethyst_stick",
            () -> new Item(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> COPPER_STICK = ITEMS.register("copper_stick",
            () -> new Item(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> RUBY_STICK = ITEMS.register("ruby_stick",
            () -> new Item(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> FIRE_RESISTANCE_STONE = ITEMS.register("fire_resistance_stone",
            () -> new FireResistanceStone(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP).maxDamage(8)));

    public static final RegistryObject<Item> WATER_BREATHING_STONE = ITEMS.register("water_breathing_stone",
            () -> new WaterBreathingStone(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP).maxDamage(8)));

    public static final RegistryObject<Item> STRENGTH_STONE = ITEMS.register("strength_stone",
            () -> new StrengthStone(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP).maxDamage(8)));

    public static final RegistryObject<Item> SPEED_STONE = ITEMS.register("speed_stone",
            () -> new SpeedStone(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP).maxDamage(8)));

    public static final RegistryObject<Item> RESISTANCE_STONE = ITEMS.register("resistance_stone",
            () -> new ResistanceStone(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP).maxDamage(8)));

    public static final RegistryObject<Item> REGENERATION_STONE = ITEMS.register("regeneration_stone",
            () -> new RegenerationStone(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP).maxDamage(8)));

    public static final RegistryObject<Item> NIGHT_VISION_STONE = ITEMS.register("night_vision_stone",
            () -> new NightVisionStone(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP).maxDamage(8)));

    public static final RegistryObject<Item> INVISIBILITY_STONE = ITEMS.register("invisibility_stone",
            () -> new InvisibilityStone(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP).maxDamage(8)));

    public static final RegistryObject<Item> HASTE_STONE = ITEMS.register("haste_stone",
            () -> new HasteStone(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP).maxDamage(8)));

    public static final RegistryObject<Item> RUNESTONE = ITEMS.register("runestone",
            () -> new Item(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> RUNESTONE_TIME_UPGRADE = ITEMS.register("runestone_time_upgrade",
            () -> new Item(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> RUNESTONE_STRENGTH_UPGRADE = ITEMS.register("runestone_strength_upgrade",
            () -> new Item(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> ULTIMATE_FIRE_RESISTANCE_STONE = ITEMS.register("ultimate_fire_resistance_stone",
            () -> new UltimateFireResistanceStone(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP).maxDamage(40)));

    public static final RegistryObject<Item> ULTIMATE_HASTE_STONE = ITEMS.register("ultimate_haste_stone",
            () -> new UltimateHasteStone(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP).maxDamage(40)));

    public static final RegistryObject<Item> ULTIMATE_INVISIBILITY_STONE = ITEMS.register("ultimate_invisibility_stone",
            () -> new UltimateInvisibilityStone(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP).maxDamage(40)));

    public static final RegistryObject<Item> ULTIMATE_NIGHT_VISION_STONE = ITEMS.register("ultimate_night_vision_stone",
            () -> new UltimateNightVisionStone(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP).maxDamage(40)));

    public static final RegistryObject<Item> ULTIMATE_REGENERATION_STONE = ITEMS.register("ultimate_regeneration_stone",
            () -> new UltimateRegenerationStone(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP).maxDamage(40)));

    public static final RegistryObject<Item> ULTIMATE_RESISTANCE_STONE = ITEMS.register("ultimate_resistance_stone",
            () -> new UltimateResistanceStone(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP).maxDamage(40)));

    public static final RegistryObject<Item> ULTIMATE_SPEED_STONE = ITEMS.register("ultimate_speed_stone",
            () -> new UltimateSpeedStone(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP).maxDamage(40)));

    public static final RegistryObject<Item> ULTIMATE_STRENGTH_STONE = ITEMS.register("ultimate_strength_stone",
            () -> new UltimateStrengthStone(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP).maxDamage(40)));

    public static final RegistryObject<Item> ULTIMATE_WATER_BREATHING_STONE = ITEMS.register("ultimate_water_breathing_stone",
            () -> new UltimateWaterBreathingStone(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP).maxDamage(40)));

    public static final RegistryObject<Item> INFINITY_STONES = ITEMS.register("infinity_stones",
            () -> new InfinityStones(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP).maxDamage(240)));

    public static final RegistryObject<Item> THE_BIBLE = ITEMS.register("the_bible",
            () -> new TheBible(new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

        public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () -> new SwordItem(ModItemTier.AMETHYST, 2, 3f,
                    new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(ModItemTier.AMETHYST, 0, -1f,
                    new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(ModItemTier.AMETHYST, 0, -1f,
                    new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new AxeItem(ModItemTier.AMETHYST, 4, -3f,
                    new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
            () -> new HoeItem(ModItemTier.AMETHYST, 0, 0f,
                    new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModItemTier.RUBY, 2, 3f,
                    new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModItemTier.RUBY, 0, -1f,
                    new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModItemTier.RUBY, 0, -1f,
                    new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModItemTier.RUBY, 4, -3f,
                    new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModItemTier.RUBY, 0, 0f,
                    new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModItemTier.COPPER, 2, 3f,
                    new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));


    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModItemTier.COPPER, 0, -1f,
                    new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModItemTier.COPPER, 0, -1f,
                    new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModItemTier.RUBY, 4, -3f,
                    new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModItemTier.RUBY, 0, 0f,
                    new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new SwordItem(ModItemTier.EMERALD, 2, 3f,
                    new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));


    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem(ModItemTier.EMERALD, 0, -1f,
                    new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem(ModItemTier.EMERALD, 0, -1f,
                    new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new AxeItem(ModItemTier.EMERALD, 4, -3f,
                    new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));

    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe",
            () -> new HoeItem(ModItemTier.EMERALD, 0, 0f,
                    new Item.Properties().group(ModItemGroup.SCHOOL_GROUP)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
