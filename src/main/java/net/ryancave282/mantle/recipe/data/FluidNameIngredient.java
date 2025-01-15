package net.ryancave282.mantle.recipe.data;

import lombok.RequiredArgsConstructor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.ryancave282.mantle.data.loadable.Loadable;
import net.ryancave282.mantle.data.loadable.Loadables;
import net.ryancave282.mantle.data.loadable.primitive.IntLoadable;
import net.ryancave282.mantle.data.loadable.record.RecordLoadable;
import net.ryancave282.mantle.recipe.ingredient.FluidIngredient;

import java.util.List;

/** Datagen fluid ingredient to create an ingredient matching a fluid from another mod, should not be used outside datagen */
@RequiredArgsConstructor(staticName = "of")
public class FluidNameIngredient extends FluidIngredient {
  private static final RecordLoadable<FluidNameIngredient> LOADABLE = RecordLoadable.create(
    Loadables.RESOURCE_LOCATION.requiredField("fluid", i -> i.fluidName),
    IntLoadable.FROM_ONE.requiredField("amount", i -> i.amount),
    FluidNameIngredient::new);

  private final ResourceLocation fluidName;
  private final int amount;

  @Override
  public Loadable<FluidNameIngredient> loadable() {
    return LOADABLE;
  }

  @Override
  public boolean test(Fluid fluid) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int getAmount(Fluid fluid) {
    return amount;
  }

  @Override
  protected List<FluidStack> getAllFluids() {
    throw new UnsupportedOperationException();
  }
}
