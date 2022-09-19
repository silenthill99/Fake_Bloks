package fr.silenthill99.fakebloks.init;

import fr.silenthill99.fakebloks.Main;
import fr.silenthill99.fakebloks.init.blocks.FakeCobbleStone;
import fr.silenthill99.fakebloks.init.blocks.FakeStone;
import fr.silenthill99.fakebloks.utils.ModItemGroups;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MODID);

    public static final RegistryObject<Block> FAKE_STONE = createBlock("fake_stone", FakeStone::new);
    public static final RegistryObject<Block> FAKE_COBBLE = createBlock("fake_cobblestone", FakeCobbleStone::new);

    private static RegistryObject<Block> createBlock(String id, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS.register(id, supplier);
        ModItems.ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Properties().tab(ModItemGroups.FAKE_BLOKS)));
        return block;
    }
}
