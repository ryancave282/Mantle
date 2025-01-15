package net.ryancave282.mantle.client.book.data.content;

import lombok.Getter;
import net.minecraft.resources.ResourceLocation;
import net.ryancave282.mantle.Mantle;
import net.ryancave282.mantle.client.book.data.BookData;
import net.ryancave282.mantle.client.book.data.element.IngredientData;
import net.ryancave282.mantle.client.book.data.element.TextData;
import net.ryancave282.mantle.client.screen.book.BookScreen;
import net.ryancave282.mantle.client.screen.book.element.BookElement;
import net.ryancave282.mantle.client.screen.book.element.ItemElement;
import net.ryancave282.mantle.client.screen.book.element.TextElement;

import java.util.ArrayList;

/** Page that showcases an item with text below */
public class ContentShowcase extends PageContent {
  public static final transient ResourceLocation ID = Mantle.getResource("showcase");

  /** Title of the page */
  @Getter
  public String title = null;
  /** Text to display below the item */
  public TextData[] text;
  /** Item to display */
  public IngredientData item;

  @Override
  public void build(BookData book, ArrayList<BookElement> list, boolean rightSide) {
    int y = getTitleHeight();

    if (this.title == null || this.title.isEmpty()) {
      y = 0;
    } else {
      this.addTitle(list, this.title);
    }

    if (this.item != null && !this.item.getItems().isEmpty()) {
      ItemElement element = new ItemElement(BookScreen.PAGE_WIDTH / 2 - 15, y, 2.5f, this.item.getItems(), this.item.action);
      list.add(element);
      y += element.height;
    }

    if (this.text != null && this.text.length > 0) {
      list.add(new TextElement(0, y, BookScreen.PAGE_WIDTH, BookScreen.PAGE_HEIGHT - y, this.text));
    }
  }
}
