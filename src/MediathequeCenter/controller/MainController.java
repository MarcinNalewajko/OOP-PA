package MediathequeCenter.controller;

import MediathequeCenter.model.MediaItems;
import MediathequeCenter.view.ComunicationPrinter;
import MediathequeCenter.view.MenuPrinter;

public class MainController {
    private User currentUser;
    private String currentPosition;
    private Book[] listOfBooks;
    private Movie[] listOfMovies;
    private Album[] listOfAlbums;
    private MediaItems[] toRentList;
    private ComunicationPrinter;
    private MenuPrinter;

    public User getCurrentUser() {
        return currentUser;
    }

    public String getCurrentPosition() {
        return currentPosition;
    }

    public Book[] getListOfBooks() {
        return listOfBooks;
    }

    public Movie[] getListOfMovies() {
        return listOfMovies;
    }

    public Album[] getListOfAlbums() {
        return listOfAlbums;
    }

    public MediaItems[] getToRentList() {
        return toRentList;
    }

    private String[] currentMenu(){return };

    public void start(){};



}
