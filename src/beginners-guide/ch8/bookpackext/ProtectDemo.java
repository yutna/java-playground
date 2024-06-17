package bookpackext;

class ProtectDemo {
    public static void main(String[] args) {
        ExtBook[] books = new ExtBook[5];

        books[0] = new ExtBook("Java: A Beginner's Guide", "Schildt", 2022, "McGraw Hill");
        books[1] = new ExtBook("Java: The complete Reference", "Schildt", 2022, "McGraw Hill");
        books[2] = new ExtBook("1984", "Orwell", 1949, "Harcourt Brace Rising");
        books[3] = new ExtBook("Red Storm Rising", "Clancy", 1986, "Putnam");
        books[4] = new ExtBook("On the Road", "Kerouac", 1955, "Viking");

        for (ExtBook book : books)
            book.show();

        // Find books by author
        System.out.println("Showing all books by Schildt.");

        for (ExtBook book : books) {
            if (book.getAuthor() == "Schildt")
                System.out.println(book.getTitle());

            // Error - not accessible
            // book.title = "test title";
        }
    }
}
