package com.legendary75.block;

import java.util.function.Supplier;

import com.legendary75.create_hot_stuff.CreateHotStuff;
import com.legendary75.fluid.ModFluids;
import com.legendary75.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateHotStuff.MODID);

    public static final RegistryObject<LiquidBlock> MOLTEN_IRON_BLOCK = BLOCKS.register("molten_iron_block",
            () -> new BurningFluidBlock(ModFluids.SOURCE_MOLTEN_IRON, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_GOLD_BLOCK = BLOCKS.register("molten_gold_block",
            () -> new BurningFluidBlock(ModFluids.SOURCE_MOLTEN_GOLD, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_COPPER_BLOCK = BLOCKS.register("molten_copper_block",
            () -> new BurningFluidBlock(ModFluids.SOURCE_MOLTEN_COPPER, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_ALUMINUM_BLOCK = BLOCKS.register("molten_aluminum_block",
            () -> new BurningFluidBlock(ModFluids.SOURCE_MOLTEN_ALUMINUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_IRIDIUM_BLOCK = BLOCKS.register("molten_iridium_block",
            () -> new BurningFluidBlock(ModFluids.SOURCE_MOLTEN_IRIDIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_LEAD_BLOCK = BLOCKS.register("molten_lead_block",
            () -> new BurningFluidBlock(ModFluids.SOURCE_MOLTEN_LEAD, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_NICKEL_BLOCK = BLOCKS.register("molten_nickel_block",
            () -> new BurningFluidBlock(ModFluids.SOURCE_MOLTEN_NICKEL, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_OSMIUM_BLOCK = BLOCKS.register("molten_osmium_block",
            () -> new BurningFluidBlock(ModFluids.SOURCE_MOLTEN_OSMIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_PLATINUM_BLOCK = BLOCKS.register("molten_platinum_block",
            () -> new BurningFluidBlock(ModFluids.SOURCE_MOLTEN_PLATINUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_SILVER_BLOCK = BLOCKS.register("molten_silver_block",
            () -> new BurningFluidBlock(ModFluids.SOURCE_MOLTEN_SILVER, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_TIN_BLOCK = BLOCKS.register("molten_tin_block",
            () -> new BurningFluidBlock(ModFluids.SOURCE_MOLTEN_TIN, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_URANIUM_BLOCK = BLOCKS.register("molten_uranium_block",
            () -> new BurningFluidBlock(ModFluids.SOURCE_MOLTEN_URANIUM, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static final RegistryObject<LiquidBlock> MOLTEN_ZINC_BLOCK = BLOCKS.register("molten_zinc_block",
            () -> new BurningFluidBlock(ModFluids.SOURCE_MOLTEN_ZINC, BlockBehaviour.Properties.copy(Blocks.LAVA)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
