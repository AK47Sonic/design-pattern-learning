package com.sonic.iterator.array;

/**
 * Create by Sonic on 2018/9/26
 * Iterator模式将遍历和实现相分离，
 * 无论BookShelf如何变化，比如替换成List，
 * 都不会影响到BookShelfIterator和IteratorMain
 */
public class IteratorArrayMain {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("A"));
        bookShelf.appendBook(new Book("B"));
        bookShelf.appendBook(new Book("C"));
        bookShelf.appendBook(new Book("D"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
