package net.justkevinr.schoolmod.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;


public class TheBible extends Item {
    public TheBible(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack item = playerIn.getHeldItem(handIn);
        if (!worldIn.isRemote()) {
            playerIn.addPotionEffect(new EffectInstance(Effects.SPEED, 12000 , 10));
            playerIn.addPotionEffect(new EffectInstance(Effects.HASTE, 12000 , 10));
            playerIn.addPotionEffect(new EffectInstance(Effects.STRENGTH, 12000 , 10));
            playerIn.addPotionEffect(new EffectInstance(Effects.REGENERATION, 12000 , 10));
            playerIn.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 12000 , 10));
            playerIn.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 12000 , 10));
            playerIn.addPotionEffect(new EffectInstance(Effects.WATER_BREATHING, 12000 , 10));
            playerIn.addPotionEffect(new EffectInstance(Effects.INVISIBILITY, 12000 , 10));
            playerIn.addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, 12000 , 10));
            playerIn.addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, 12000 , 10));
            playerIn.addPotionEffect(new EffectInstance(Effects.ABSORPTION, 12000 , 10));
            playerIn.addPotionEffect(new EffectInstance(Effects.SATURATION, 12000 , 10));
            playerIn.addPotionEffect(new EffectInstance(Effects.LUCK, 12000 , 10));
            playerIn.addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, 12000 , 10));
            playerIn.addPotionEffect(new EffectInstance(Effects.CONDUIT_POWER, 12000 , 10));
            playerIn.addPotionEffect(new EffectInstance(Effects.DOLPHINS_GRACE, 12000 , 10));
        }
//        item.damageItem(1, playerIn, player -> player.sendBreakAnimation(handIn));
        return super.onItemRightClick(worldIn, playerIn, handIn);

    }



    @Override
    public void addInformation(ItemStack p_77624_1_, @Nullable World p_77624_2_,
                               List<ITextComponent> tooltip, ITooltipFlag flagIn) {

        if (Screen.hasShiftDown()){
            tooltip.add(new TranslationTextComponent("tooltip.schoolmod.the_bible_shift"));
        }else {
            tooltip.add(new TranslationTextComponent("tooltip.schoolmod.the_bible"));
        }

        super.addInformation(p_77624_1_, p_77624_2_, tooltip, flagIn);
    }

}
