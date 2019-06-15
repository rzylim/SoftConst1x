package model.library;

import model.book.Book;

public class Librarian {

    private String name;
    private int age;
    private Library managingLibrary;
    private Book favBook;

    public Librarian(String name, int age, Library lib, Book bk) {
        this.name = name;
        this.age = age;
        managingLibrary = lib;
        favBook = bk;
    }

    // getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Library getManagingLibrary() {
        return managingLibrary;
    }
    public Book getFavBook() {
        return favBook;
    }

    // REQUIRES: lib != null
    // MODIFIES: this
    // EFFECTS: changes this librarian's managing library to the one given.
    //          Look carefully at the implementation of library - does it
    //          also have an associated librarian field? Does it make a
    //          difference in the implementation of this method?
    public boolean changeLibrary(Library lib) {
        if(lib.hireLibrarian(this)){
            managingLibrary = lib;
            return true;
        }
        return false;
    }
}
