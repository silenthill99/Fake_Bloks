package fr.silenthill99.fakebloks.utils;

import fr.silenthill99.fakebloks.init.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups
{
    public static final ItemGroup FAKE_BLOKS = new ItemGroup("fake_bloks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.FAKE_STONE.get());
        }
    };
}
