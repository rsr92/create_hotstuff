package com.legendary75.create_hot_stuff;

import com.legendary75.block.ModBlocks;
import com.legendary75.creative_tabs.ModCreativeTabs;
import com.legendary75.fluid_type.ModFluidTypes;
import com.legendary75.fluid.ModFluids;
import com.legendary75.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CreateHotStuff.MODID)
public class CreateHotStuff
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "create_hotstuff";

    public CreateHotStuff()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModFluids.register(modEventBus);
        ModFluidTypes.register(modEventBus);

        ModCreativeTabs.register(modEventBus);

        /*
        ModCreativeModeTabs.register(modEventBus);

        ModEnchantments.register(modEventBus);
        ModSounds.register(modEventBus);

        ModLootModifiers.register(modEventBus);
        ModPaintings.register(modEventBus);

        ModEffects.register(modEventBus);
        ModPotions.register(modEventBus);

        ModParticles.register(modEventBus);
        modVillagers.register(modEventBus);


        ModEntities.register(modEventBus);
        //*/
        /*
        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        ModRecipes.register(modEventBus);

        ModTrunkPlacerTypes.register(modEventBus);
        ModFoliagePlacerTypes.register(modEventBus);

        ModTerraBlenderAPI.registerRegions();
        //*/

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, HotStuffConfig.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        // event.enqueueWork(() -> {
        //	PacketHandler.register();
        // });

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        //ModCreativeModeTabs.build(event);
    }

}
