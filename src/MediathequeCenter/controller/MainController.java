package MediathequeCenter.controller;

import MediathequeCenter.model.*;
import MediathequeCenter.view.ComunicationPrinter;
import MediathequeCenter.view.MenuPrinter;

import java.util.List;

public class MainController {
    private User currentUser;
    private String currentPosition;
    private List<Book> listOfBooks;
    private List<Movie> listOfMovies;
    private List<Album> listOfAlbums;
    private List<MediaItems> toRentList;
    public ComunicationPrinter comunicationPrinter;
    public MenuPrinter menuPrinter;

    public User getCurrentUser() {
        return currentUser;
    }

    public String getCurrentPosition() {
        return currentPosition;
    }

    public List<Book> getListOfBooks() {
        return listOfBooks;
    }

    public List<Movie> getListOfMovies() {
        return listOfMovies;
    }

    public List<Album> getListOfAlbums() {
        return listOfAlbums;
    }

    public List<MediaItems> getToRentList() {
        return toRentList;
    }

    private String[] currentMenu(){return };

    public void start(){};



}
