package net.ryancave282.mantle.plugin.jei;

import mezz.jei.api.ingredients.IIngredientType;
import net.ryancave282.mantle.recipe.ingredient.EntityIngredient.EntityInput;

public class MantleJEIConstants {
  /** Ingredient for an entity */
  public static final IIngredientType<EntityInput> ENTITY_TYPE = () -> EntityInput.class;
}
