package com.legendary75.fluid_type;

import com.simibubi.create.AllFluids;
import com.tterrag.registrate.builders.FluidBuilder;
import net.createmod.catnip.theme.Color;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.fluids.FluidStack;
import org.joml.Vector3f;

import java.util.function.Supplier;

public class BaseMoltenFluidType extends AllFluids.TintedFluidType {

    private final Vector3f fogColor;
    private final float fogDistance;

    public BaseMoltenFluidType(Properties properties, ResourceLocation stillTexture,
                               ResourceLocation flowingTexture, Vector3f v3FogColor, float fFogDistance) {
        super(properties, stillTexture, flowingTexture);
        fogDistance = fFogDistance;
        fogColor = v3FogColor;
    }

    @Override
    protected int getTintColor(FluidStack stack) {
        return NO_TINT;
    }

    @Override
    public int getTintColor(FluidState state, BlockAndTintGetter world, BlockPos pos) {
        return 0x00ffffff;
    }

    @Override
    protected Vector3f getCustomFogColor() {
        return fogColor;
    }

    @Override
    protected float getFogDistanceModifier() {
        return fogDistance;
    }

}