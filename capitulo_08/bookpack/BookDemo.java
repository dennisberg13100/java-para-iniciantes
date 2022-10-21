// Demonstração breve dos pacotes.
package bookpack;

class BookDemo {
    public static void main(String[] args) {
        Book books[] = new Book[5];

        books[0] = new Book("Java: A Beginner's Guide", "Shild", 2014);
        books[1] = new Book("Java: The Complete Reference", "Shild", 2014);
        books[2] = new Book("The Art of Java", "Shild and Holmes", 2003);
        books[3] = new Book("Red Storm Rising", "Clancy", 1986);
        books[4] = new Book("On the Road", "Kerouac", 1955);

        for(Book book : books) book.show();
    }
}