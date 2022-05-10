package net.justkevinr.schoolmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class firestoneBlock extends Block {

    public firestoneBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        lightEntityOnFire(entityIn, 5);
        super.onEntityWalk(worldIn, pos, entityIn);
    }

    @Override
    public void addInformation(ItemStack p_190948_1_, @Nullable IBlockReader p_190948_2_,
                               List<ITextComponent> tooltip, ITooltipFlag flagIn) {

        if (Screen.hasShiftDown()){
            tooltip.add(new TranslationTextComponent("tooltip.schoolmod.firestoneBlock_shift"));
        }else {
            tooltip.add(new TranslationTextComponent("tooltip.schoolmod.firestoneBlock"));
        }

        super.addInformation(p_190948_1_, p_190948_2_, tooltip, flagIn);
    }

    public static void lightEntityOnFire(Entity entity, int second){
        entity.setFire(second);
    }
}
