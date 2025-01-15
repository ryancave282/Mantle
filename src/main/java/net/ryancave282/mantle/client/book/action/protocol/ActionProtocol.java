package net.ryancave282.mantle.client.book.action.protocol;

import net.ryancave282.mantle.client.screen.book.BookScreen;

public abstract class ActionProtocol {
  public abstract void processCommand(BookScreen book, String param);
}
