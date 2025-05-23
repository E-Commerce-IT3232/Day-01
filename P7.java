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

    public void describeBook() {
        super.describeBook();
        System.out.println("File Size: " + fileSize + " MB");
    }
}

class AudioBook extends Book {
    private int duration;

    public AudioBook(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void describeBook() {
        super.describeBook();
        System.out.println("Duration: " + duration + " minutes");
    }
}

public class P7 {
    public static void main(String[] args) {
        Book printedBook = new PrintedBook("Harry Potter", "J.K. Rowling", 500);
        Book eBook = new EBook("Digital Transformation", "John Doe", 2.5);
        Book audioBook = new AudioBook("The Silent Patient", "Alex Michaelides", 360);

        Book[] libraryBooks = { printedBook, eBook, audioBook };

        for (Book book : libraryBooks) {
            book.describeBook();
            System.out.println();
        }
    }
}
