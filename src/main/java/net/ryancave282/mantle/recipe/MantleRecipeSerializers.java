package net.ryancave282.mantle.recipe;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.registries.ObjectHolder;
import net.ryancave282.mantle.Mantle;

import static net.ryancave282.mantle.registration.RegistrationHelper.injected;

/**
 * All recipe serializers registered under Mantles name.
 * TODO: merge with other mantle registry classes?
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MantleRecipeSerializers {
  @ObjectHolder(registryName = "minecraft:recipe_serializer", value = Mantle.modId+":crafting_shaped_fallback")
  public static final RecipeSerializer<?> CRAFTING_SHAPED_FALLBACK = injected();
  @ObjectHolder(registryName = "minecraft:recipe_serializer", value = Mantle.modId+":crafting_shaped_retextured")
  public static final RecipeSerializer<?> CRAFTING_SHAPED_RETEXTURED = injected();
}
