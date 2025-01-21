package net.kaupenjoe.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperites {
    public static final FoodProperties PIWO2 = new FoodProperties.Builder().nutrition(3).saturationModifier(0)
            .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 200,40),1).fast().build();
    public static final FoodProperties PIWO = new FoodProperties.Builder().nutrition(3).saturationModifier(0)
            .effect(new MobEffectInstance(MobEffects.POISON, 200,40),1).fast().build();
}
