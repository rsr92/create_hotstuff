package com.legendary75.fluid;

import com.legendary75.create_hot_stuff.CreateHotStuff;
import com.legendary75.fluid_type.ModFluidTypes;
import com.legendary75.item.ModItems;
import com.legendary75.block.ModBlocks;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {

    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, CreateHotStuff.MODID);

    //=== IRON ==/
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_IRON = FLUIDS.register("molten_iron",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_IRON_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_IRON = FLUIDS.register("flowing_molten_iron",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_IRON_PROPERTIES));

    //=== GOLD ==/
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_GOLD = FLUIDS.register("molten_gold",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_GOLD_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_GOLD = FLUIDS.register("flowing_molten_gold",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_GOLD_PROPERTIES));

    //=== COPPER ==/
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_COPPER = FLUIDS.register("molten_copper",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_COPPER_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_COPPER = FLUIDS.register("flowing_molten_copper",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_COPPER_PROPERTIES));

    //=== ALUMINUM ==/
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ALUMINUM = FLUIDS.register("molten_aluminum",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_ALUMINUM_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ALUMINUM = FLUIDS.register("flowing_molten_aluminum",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_ALUMINUM_PROPERTIES));

    //=== IRIDIUM ==/
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_IRIDIUM = FLUIDS.register("molten_iridium",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_IRIDIUM_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_IRIDIUM = FLUIDS.register("flowing_molten_iridium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_IRIDIUM_PROPERTIES));

    //=== LEAD ==/
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_LEAD = FLUIDS.register("molten_lead",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_LEAD_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_LEAD = FLUIDS.register("flowing_molten_lead",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_LEAD_PROPERTIES));

    //=== NICKEL ==/
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_NICKEL = FLUIDS.register("molten_nickel",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_NICKEL_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_NICKEL = FLUIDS.register("flowing_molten_nickel",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_NICKEL_PROPERTIES));

    //=== OSMIUM ==/
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_OSMIUM = FLUIDS.register("molten_osmium",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_OSMIUM_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_OSMIUM = FLUIDS.register("flowing_molten_osmium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_OSMIUM_PROPERTIES));

    //=== PLATINUM ==/
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_PLATINUM = FLUIDS.register("molten_platinum",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_PLATINUM_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_PLATINUM = FLUIDS.register("flowing_molten_platinum",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_PLATINUM_PROPERTIES));

    //=== SILVER ==/
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_SILVER = FLUIDS.register("molten_silver",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_SILVER_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_SILVER = FLUIDS.register("flowing_molten_silver",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_SILVER_PROPERTIES));

    //=== TIN ==/
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_TIN = FLUIDS.register("molten_tin",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_TIN_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_TIN = FLUIDS.register("flowing_molten_tin",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_TIN_PROPERTIES));

    //=== URANIUM ==/
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_URANIUM = FLUIDS.register("molten_uranium",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_URANIUM_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_URANIUM = FLUIDS.register("flowing_molten_uranium",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_URANIUM_PROPERTIES));

    //=== ZINC ==/
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_ZINC = FLUIDS.register("molten_zinc",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_ZINC_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_ZINC = FLUIDS.register("flowing_molten_zinc",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_ZINC_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_IRON_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_IRON_TYPE, SOURCE_MOLTEN_IRON, FLOWING_MOLTEN_IRON)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_IRON_BLOCK)
            .bucket(ModItems.MOLTEN_IRON_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_GOLD_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_GOLD_TYPE, SOURCE_MOLTEN_GOLD, FLOWING_MOLTEN_GOLD)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_GOLD_BLOCK)
            .bucket(ModItems.MOLTEN_GOLD_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_COPPER_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_COPPER_TYPE, SOURCE_MOLTEN_COPPER, FLOWING_MOLTEN_COPPER)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_COPPER_BLOCK)
            .bucket(ModItems.MOLTEN_COPPER_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_ALUMINUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_ALUMINUM_TYPE, SOURCE_MOLTEN_ALUMINUM, FLOWING_MOLTEN_ALUMINUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_ALUMINUM_BLOCK)
            .bucket(ModItems.MOLTEN_ALUMINUM_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_IRIDIUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_IRIDIUM_TYPE, SOURCE_MOLTEN_IRIDIUM, FLOWING_MOLTEN_IRIDIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_IRIDIUM_BLOCK)
            .bucket(ModItems.MOLTEN_IRIDIUM_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_LEAD_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_LEAD_TYPE, SOURCE_MOLTEN_LEAD, FLOWING_MOLTEN_LEAD)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_LEAD_BLOCK)
            .bucket(ModItems.MOLTEN_LEAD_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_NICKEL_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_NICKEL_TYPE, SOURCE_MOLTEN_NICKEL, FLOWING_MOLTEN_NICKEL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_NICKEL_BLOCK)
            .bucket(ModItems.MOLTEN_NICKEL_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_OSMIUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_OSMIUM_TYPE, SOURCE_MOLTEN_OSMIUM, FLOWING_MOLTEN_OSMIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_OSMIUM_BLOCK)
            .bucket(ModItems.MOLTEN_OSMIUM_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_PLATINUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_PLATINUM_TYPE, SOURCE_MOLTEN_PLATINUM, FLOWING_MOLTEN_PLATINUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_PLATINUM_BLOCK)
            .bucket(ModItems.MOLTEN_PLATINUM_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_SILVER_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_SILVER_TYPE, SOURCE_MOLTEN_SILVER, FLOWING_MOLTEN_SILVER)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_SILVER_BLOCK)
            .bucket(ModItems.MOLTEN_SILVER_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_TIN_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_TIN_TYPE, SOURCE_MOLTEN_TIN, FLOWING_MOLTEN_TIN)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_TIN_BLOCK)
            .bucket(ModItems.MOLTEN_TIN_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_URANIUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_URANIUM_TYPE, SOURCE_MOLTEN_URANIUM, FLOWING_MOLTEN_URANIUM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_URANIUM_BLOCK)
            .bucket(ModItems.MOLTEN_URANIUM_BUCKET);

    public static final ForgeFlowingFluid.Properties MOLTEN_ZINC_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_ZINC_TYPE, SOURCE_MOLTEN_ZINC, FLOWING_MOLTEN_ZINC)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_ZINC_BLOCK)
            .bucket(ModItems.MOLTEN_ZINC_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }


};