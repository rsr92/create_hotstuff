package com.legendary75.fluid_type;

import com.legendary75.create_hot_stuff.CreateHotStuff;
import org.joml.Vector3f;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidTypes {
    //public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    //public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    //public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    public static final ResourceLocation NULL_OVERLAY = new ResourceLocation(CreateHotStuff.MODID, "block/molten_overlay");

    public static final ResourceLocation MOLTEN_URANIUM_STILL_RL = new ResourceLocation(CreateHotStuff.MODID,"block/uranium/molten_still");
    public static final ResourceLocation MOLTEN_URANIUM_FLOW_RL = new ResourceLocation(CreateHotStuff.MODID,"block/uranium/molten_flow");

    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateHotStuff.MODID);

    // Fluid Types
    private static RegistryObject<FluidType> registerMoltenFluid(String name, int burnTime, int freq, int tintColor, Vector3f fogColor, FluidType.Properties properties) {
        ResourceLocation stillTexture = new ResourceLocation(CreateHotStuff.MODID,"block/" + name + "/molten_still");
        ResourceLocation flowingTexture = new ResourceLocation(CreateHotStuff.MODID,"block/" + name + "/molten_flow");
        return FLUID_TYPES.register("molten_" + name, () -> new MoltenFluidType(properties, stillTexture, flowingTexture, fogColor, 3.0f, burnTime, freq));
    }

    private static RegistryObject<FluidType> registerToxicMoltenFluid(String name, int burnTime, int freq, int poison, int poisonDuration,
                                                                      int tintColor, Vector3f fogColor, FluidType.Properties properties) {
        ResourceLocation stillTexture = new ResourceLocation(CreateHotStuff.MODID,"block/" + name + "/molten_still");
        ResourceLocation flowingTexture = new ResourceLocation(CreateHotStuff.MODID,"block/" + name + "/molten_flow");
        return FLUID_TYPES.register("molten_" + name, () -> new ToxicMoltenFluidType(properties, stillTexture, flowingTexture, fogColor, 3.0f, burnTime, freq, poison, poisonDuration));
    }

    // Fluid Types
    public static final RegistryObject<FluidType> MOLTEN_IRON_TYPE = registerMoltenFluid(
            "iron", 10, 3, 0xFFFFFFFF, new Vector3f(1.0f, 0.0f, 0.0f),
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.LAVA_AMBIENT));

    public static final RegistryObject<FluidType> MOLTEN_GOLD_TYPE = registerMoltenFluid(
            "gold", 10, 3, 0xFFFFFFFF, new Vector3f(0.5f, 0.5f, 0.5f),
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.LAVA_AMBIENT));

    public static final RegistryObject<FluidType> MOLTEN_COPPER_TYPE = registerMoltenFluid(
            "copper", 10, 3, 0xFFFFFFFF, new Vector3f(0.5f, 0.5f, 0.5f),
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.LAVA_AMBIENT));

    public static final RegistryObject<FluidType> MOLTEN_ALUMINUM_TYPE = registerMoltenFluid(
            "aluminum", 10, 3, 0xFFFFFFFF, new Vector3f(0.5f, 0.5f, 0.5f),
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.LAVA_AMBIENT));

    public static final RegistryObject<FluidType> MOLTEN_IRIDIUM_TYPE = registerMoltenFluid(
            "iridium", 10, 3, 0xFFFFFFFF, new Vector3f(0.5f, 0.5f, 0.5f),
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.LAVA_AMBIENT));

    public static final RegistryObject<FluidType> MOLTEN_LEAD_TYPE = registerToxicMoltenFluid(
            "lead", 10, 3, 1, 100, 0xFFFFFFFF, new Vector3f(0.5f, 0.5f, 0.5f),
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.LAVA_AMBIENT));

    public static final RegistryObject<FluidType> MOLTEN_NICKEL_TYPE = registerToxicMoltenFluid(
            "nickel", 10, 3, 1, 100, 0xFFFFFFFF, new Vector3f(0.5f, 0.5f, 0.5f),
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.LAVA_AMBIENT));

    public static final RegistryObject<FluidType> MOLTEN_OSMIUM_TYPE = registerMoltenFluid(
            "osmium", 10, 3, 0xFFFFFFFF, new Vector3f(0.5f, 0.5f, 0.5f),
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.LAVA_AMBIENT));

    public static final RegistryObject<FluidType> MOLTEN_PLATINUM_TYPE = registerMoltenFluid(
            "platinum", 10, 3, 0xFFFFFFFF, new Vector3f(0.5f, 0.5f, 0.5f),
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.LAVA_AMBIENT));

    public static final RegistryObject<FluidType> MOLTEN_SILVER_TYPE = registerMoltenFluid(
            "silver", 10, 3, 0xFFFFFFFF, new Vector3f(0.5f, 0.5f, 0.5f),
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.LAVA_AMBIENT));

    public static final RegistryObject<FluidType> MOLTEN_TIN_TYPE = registerMoltenFluid(
            "tin", 10, 3, 0xFFFFFFFF, new Vector3f(0.5f, 0.5f, 0.5f),
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.LAVA_AMBIENT));

    public static final RegistryObject<FluidType> MOLTEN_URANIUM_TYPE = registerToxicMoltenFluid(
            "uranium", 10, 3, 4, 1200, 0xFFFFFFFF, new Vector3f(0.5f, 0.5f, 0.5f),
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.LAVA_AMBIENT));

    public static final RegistryObject<FluidType> MOLTEN_ZINC_TYPE = registerMoltenFluid(
            "zinc", 10, 3, 0xFFFFFFFF, new Vector3f(0.5f, 0.5f, 0.5f),
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.LAVA_AMBIENT));

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}