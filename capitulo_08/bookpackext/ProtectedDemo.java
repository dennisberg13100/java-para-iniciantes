// Demonstra protected
package bookpackext;

class ExtBook extends bookpack.Book {
    private String publisher;

    public ExtBook(String title, String author, int pubDate, String publisher) {
        super (title, author, pubDate);
        this.publisher = publisher;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    /*
     * Estas instruções estão corretas pois uma
     * subclasse pode acessar um membro protegido.
     */

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public int getPubDate() { return pubDate; }
    public void setPubDate(int pubDate) { this.pubDate = pubDate; }
}

class ProtectedDemo {
    public static void main(String[] args) {
        ExtBook books[] = new ExtBook[5];

        books[0] = new ExtBook("Java: A Beginner's Guide", "Schildt", 2014, "McGraw-Hill Professional");
        books[1] = new ExtBook("Java: The Complete Reference", "Schildt", 2014, "McGraw-Hill Professional");
        books[2] = new ExtBook("The Art of Java", "Schildt and Holmes", 2003, "McGraw-Hill Professional");
        books[3] = new ExtBook("Red Storm Rising","Clancy", 1986, "Putnam");
        books[4] = new ExtBook("On the Road","Kerouac", 1955, "Viking");

        for (int i = 0; i < books.length; i++ ) books[i].show();

        //Encontra livro por autor
        System.out.println("Showing all books by Shild:");
        for(int i = 0; i < books.length; i++ ) {
            if (books[i].getAuthor() == "Schildt") {
                System.out.println(books[i].getTitle());
            }
        }

    }
}

