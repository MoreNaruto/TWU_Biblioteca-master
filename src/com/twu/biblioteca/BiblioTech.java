package com.twu.biblioteca;

/**
 * Created by brandonteng on 6/17/14.
 */
public class BiblioTech {
    private Library lib;
    public BiblioTech (Library lib){
        this.lib = lib;
    }

    public void go(){
       lib.displayWelcomeMessage();
       lib.displayListOfBooks();
       lib.formatBookIntoColumns();
    }
}
