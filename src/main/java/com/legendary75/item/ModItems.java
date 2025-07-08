package com.legendary75.item;

import com.legendary75.create_hot_stuff.CreateHotStuff;
import com.legendary75.fluid.ModFluids;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateHotStuff.MODID);

    public static final RegistryObject<Item> MOLTEN_IRON_BUCKET = ITEMS.register("molten_iron_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_IRON,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_GOLD_BUCKET = ITEMS.register("molten_gold_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_GOLD,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_COPPER_BUCKET = ITEMS.register("molten_copper_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_COPPER,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_ALUMINUM_BUCKET = ITEMS.register("molten_aluminum_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_ALUMINUM,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_IRIDIUM_BUCKET = ITEMS.register("molten_iridium_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_IRIDIUM,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_LEAD_BUCKET = ITEMS.register("molten_lead_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_LEAD,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_NICKEL_BUCKET = ITEMS.register("molten_nickel_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_NICKEL,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_OSMIUM_BUCKET = ITEMS.register("molten_osmium_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_OSMIUM,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_PLATINUM_BUCKET = ITEMS.register("molten_platinum_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_PLATINUM,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_SILVER_BUCKET = ITEMS.register("molten_silver_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_SILVER,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_TIN_BUCKET = ITEMS.register("molten_tin_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_TIN,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_URANIUM_BUCKET = ITEMS.register("molten_uranium_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_URANIUM,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MOLTEN_ZINC_BUCKET = ITEMS.register("molten_zinc_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_ZINC,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static Item getById(String id) {
        return ForgeRegistries.ITEMS.getValue(new ResourceLocation(id));
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}

