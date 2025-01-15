package net.ryancave282.mantle.network;

import net.minecraftforge.network.NetworkDirection;
import net.ryancave282.mantle.Mantle;
import net.ryancave282.mantle.fluid.transfer.FluidContainerTransferPacket;
import net.ryancave282.mantle.network.packet.DropLecternBookPacket;
import net.ryancave282.mantle.network.packet.OpenLecternBookPacket;
import net.ryancave282.mantle.network.packet.OpenNamedBookPacket;
import net.ryancave282.mantle.network.packet.SwingArmPacket;
import net.ryancave282.mantle.network.packet.UpdateHeldPagePacket;
import net.ryancave282.mantle.network.packet.UpdateLecternPagePacket;

public class MantleNetwork {
  /** Network instance */
  public static final NetworkWrapper INSTANCE = new NetworkWrapper(Mantle.getResource("network"));

  /**
   * Registers packets into this network
   */
  public static void registerPackets() {
    INSTANCE.registerPacket(OpenLecternBookPacket.class, OpenLecternBookPacket::new, NetworkDirection.PLAY_TO_CLIENT);
    INSTANCE.registerPacket(UpdateHeldPagePacket.class, UpdateHeldPagePacket::new, NetworkDirection.PLAY_TO_SERVER);
    INSTANCE.registerPacket(UpdateLecternPagePacket.class, UpdateLecternPagePacket::new, NetworkDirection.PLAY_TO_SERVER);
    INSTANCE.registerPacket(DropLecternBookPacket.class, DropLecternBookPacket::new, NetworkDirection.PLAY_TO_SERVER);
    INSTANCE.registerPacket(SwingArmPacket.class, SwingArmPacket::new, NetworkDirection.PLAY_TO_CLIENT);
    INSTANCE.registerPacket(OpenNamedBookPacket.class, OpenNamedBookPacket::new, NetworkDirection.PLAY_TO_CLIENT);
    INSTANCE.registerPacket(FluidContainerTransferPacket.class, FluidContainerTransferPacket::new, NetworkDirection.PLAY_TO_CLIENT);
  }
}
