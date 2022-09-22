package Generics;

 class LibaryDriver {
    public static void main(String[] args) {
        Library<Book> bookLib= new Library<>();
        bookLib.add(new Book());
        Library<Video> videoLib= new Library<>();
        videoLib.add(new Video());
    }
}