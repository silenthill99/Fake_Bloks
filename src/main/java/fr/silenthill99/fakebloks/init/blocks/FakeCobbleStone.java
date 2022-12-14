package fr.silenthill99.fakebloks.init.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class FakeCobbleStone extends Block
{
    public FakeCobbleStone() {
        super(AbstractBlock.Properties.of(Material.STONE).strength(1.5f).harvestLevel(0).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().noCollission());
    }

    @Override
    public int getLightBlock(BlockState p_200011_1_, IBlockReader p_200011_2_, BlockPos p_200011_3_) {
        return 15;
    }
}
