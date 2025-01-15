package net.ryancave282.mantle.registration;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.ObjectHolder;
import net.ryancave282.mantle.Mantle;
import net.ryancave282.mantle.block.entity.MantleHangingSignBlockEntity;
import net.ryancave282.mantle.block.entity.MantleSignBlockEntity;

import static net.ryancave282.mantle.registration.RegistrationHelper.injected;

/**
 * Various objects registered under Mantle
 */
public class MantleRegistrations {
  private MantleRegistrations() {}

  @ObjectHolder(registryName = "minecraft:block_entity_type", value = Mantle.modId+":sign")
  public static final BlockEntityType<MantleSignBlockEntity> SIGN = injected();

  @ObjectHolder(registryName = "minecraft:block_entity_type", value = Mantle.modId+":hanging_sign")
  public static final BlockEntityType<MantleHangingSignBlockEntity> HANGING_SIGN = injected();
}
