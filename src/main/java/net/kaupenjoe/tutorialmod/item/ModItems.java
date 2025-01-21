package net.kaupenjoe.tutorialmod.item;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> PIWO = ITEMS.register("piwo", ()-> new Item(new Item.Properties().food(ModFoodProperites.PIWO)));

    public static final RegistryObject<Item>  PIWO2 = ITEMS.register("piwo2",()-> new Item(new Item.Properties().food(ModFoodProperites.PIWO2)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
