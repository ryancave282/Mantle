package net.ryancave282.mantle.client.book.data.content;

import net.minecraft.resources.ResourceLocation;
import net.ryancave282.mantle.Mantle;
import net.ryancave282.mantle.client.book.data.BookData;
import net.ryancave282.mantle.client.screen.book.element.BookElement;

import java.util.ArrayList;

public class ContentBlank extends PageContent {
  public static final ResourceLocation ID = Mantle.getResource("blank");

  @Override
  public void build(BookData book, ArrayList<BookElement> list, boolean rightSide) {
  }
}
