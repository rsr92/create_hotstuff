package com.legendary75.fluid_type;

import com.simibubi.create.Create;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector3f;

public class MoltenFluidType extends BaseMoltenFluidType {

    public MoltenFluidType(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture, Vector3f v3FogColor, float fFogDistance, int burningTime, int damageFrequency) {
        super(properties, stillTexture, flowingTexture, v3FogColor, fFogDistance);
        burnTime = burningTime;
        damageFreq = damageFrequency;
    }

    final private int burnTime;
    final private int damageFreq;

    @Override
    public boolean move(FluidState state, LivingEntity entity, Vec3 movementVector, double gravity)
    {
        entity.setDeltaMovement(entity.getDeltaMovement().scale(0.6));

        if (burnTime > 0) {
            entity.setSecondsOnFire(burnTime);
        }

        if (damageFreq > 0) {
            Level lvl = entity.level();
            if(damageFreq > 0 && lvl.random.nextInt(100) < damageFreq)
                entity.lavaHurt();
        }

        return false;
    }

    public boolean canExtinguish(Entity entity)
    {
        return false;
    }
}