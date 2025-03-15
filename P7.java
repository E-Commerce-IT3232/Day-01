/*
7) implement classes for a Library
There are diffrent type of books are available in the
library like Printed books, E books, and Audio books

You must use inhertance, polymorphism, encapuslation...

 */

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void seTtitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Polymorphism
    public void describeBook() {
        System.out.println("Book : " + title + " by " + author);
    }
}

class PrintedBook extends Book {
    private int pages;

    public PrintedBook(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    // @Override
    public void describeBook() {
        super.describeBook(); // Call the parent class method
        System.out.println("Pages: " + pages);
    }

}

class EBook extends Book {
    private double fileSize;

    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }
}
