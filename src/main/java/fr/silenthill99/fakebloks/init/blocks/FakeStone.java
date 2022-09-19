package fr.silenthill99.fakebloks.init.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class FakeStone extends Block {
    public FakeStone()
    {
        super(AbstractBlock.Properties.of(Material.STONE).strength(1.5f).harvestLevel(0).harvestTool(ToolType.PICKAXE).noCollission());
    }

}
