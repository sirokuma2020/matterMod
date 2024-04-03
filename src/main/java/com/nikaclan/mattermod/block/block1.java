/*package com.nikaclan.mattermod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class block1 {
    public static final String MOD_ID = "mattermod";
    public block1(){
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Blocks.register(modEventBus);
        Items.register(modEventBus);
    }

    public static class Blocks {
        private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
        public static final RegistryObject<Block> ANTIMATTER_BLOCK = BLOCKS.register("anti_matter_block", () -> new Block(AbstractBlock.Properties
                .of(Material.METAL, MaterialColor.METAL)
                .requiresCorrectToolForDrops()
                .strength(200F, 60000F)
                .sound(SoundType.METAL)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(4)
        ));

        public static void register(IEventBus eventBus) {
            BLOCKS.register(eventBus);
        }
    }

    public static class Items {
        private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
        public static final RegistryObject<Item> ANTIMATTER_BLOCK = ITEMS.register("anti_matter_block", () -> new BlockItem(Blocks.ANTIMATTER_BLOCK.get(), new Item.Properties()
                .tab(ItemGroup.TAB_BUILDING_BLOCKS)));
        public static void register(IEventBus eventBus) {
            ITEMS.register(eventBus);
        }
    }
}*/