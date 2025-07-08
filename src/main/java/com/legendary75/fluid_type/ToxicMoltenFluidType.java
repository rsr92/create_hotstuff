package com.legendary75.fluid_type;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector3f;

import java.util.function.Supplier;

public class ToxicMoltenFluidType extends MoltenFluidType {

    public ToxicMoltenFluidType(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture, Vector3f v3FogColor, float fFogDistance,
                                int burningTime,
                                int damageFrequency,
                                int poison,
                                int poisonTime) {
        super(properties, stillTexture, flowingTexture, v3FogColor, fFogDistance, burningTime, damageFrequency);
        poisonLevel = poison;
        poisonDuration = poisonTime;
    }

    private Vector3f fogColor;
    private Supplier<Float> fogDistance;

    final private int poisonDuration;
    final private int poisonLevel;

    @Override
    public boolean move(FluidState state, LivingEntity entity, Vec3 movementVector, double gravity)
    {
        if (poisonDuration > 0) {
            if (!entity.hasEffect(MobEffects.POISON)) {
                entity.addEffect(new MobEffectInstance(MobEffects.POISON, poisonDuration, poisonLevel));
            }
        }

        return super.move(state, entity, movementVector, gravity);
    }

    public boolean canExtinguish(Entity entity)
    {
        return false;
    }
}