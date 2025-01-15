package net.ryancave282.mantle.client.book.data.element;

import net.ryancave282.mantle.client.book.repository.BookRepository;

public interface IDataElement {

  void load(BookRepository source);
}
