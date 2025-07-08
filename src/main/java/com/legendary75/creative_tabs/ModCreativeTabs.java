package com.legendary75.creative_tabs;

import com.legendary75.create_hot_stuff.CreateHotStuff;
import com.legendary75.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateHotStuff.MODID);

    public static final Supplier<CreativeModeTab> BISMUTH_ITEMS_TAB = CREATIVE_MODE_TAB.register("hotstuff_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MOLTEN_IRON_BUCKET.get()))
                    .title(Component.translatable("creativetab.create_hotstuff.hotstuff_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MOLTEN_IRON_BUCKET.get());
                        output.accept(ModItems.MOLTEN_GOLD_BUCKET.get());
                        output.accept(ModItems.MOLTEN_COPPER_BUCKET.get());
                        output.accept(ModItems.MOLTEN_ZINC_BUCKET.get());
                        output.accept(ModItems.MOLTEN_ALUMINUM_BUCKET.get());
                        output.accept(ModItems.MOLTEN_LEAD_BUCKET.get());
                        output.accept(ModItems.MOLTEN_NICKEL_BUCKET.get());
                        output.accept(ModItems.MOLTEN_OSMIUM_BUCKET.get());
                        output.accept(ModItems.MOLTEN_PLATINUM_BUCKET.get());
                        output.accept(ModItems.MOLTEN_SILVER_BUCKET.get());
                        output.accept(ModItems.MOLTEN_TIN_BUCKET.get());
                        output.accept(ModItems.MOLTEN_URANIUM_BUCKET.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}