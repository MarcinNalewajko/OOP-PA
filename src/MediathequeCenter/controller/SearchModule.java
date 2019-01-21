package MediathequeCenter.controller;

import MediathequeCenter.model.Album;
import MediathequeCenter.model.Book;
import MediathequeCenter.model.MediaItems;
import MediathequeCenter.model.Movie;
import MediathequeCenter.view.ListPrinter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class SearchModule {
    private MainController mainController;
    private String getSearchInput() {
        //Enter data using BufferReader
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        String search = null;
        try {
            search = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Printing the read line
        return search;
    }
    private MainController mainController;

    private Integer getPositionInput() {
        //Enter data using BufferReader
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        String read = null;
        Integer position;
        try {
            read = reader.readLine();


        } catch (IOException e) {
            e.printStackTrace();
        }
        position=Integer.parseInt(read);
        return position;
    }
        // Printing the read line

    public void searchByTitle(){
        MediaItems choosenElement;
        List<MediaItems>searchResult = null;
        mainController.comunicationPrinter.showMessage("Search:");
        String search;
        search = getSearchInput();
        for (Book book: mainController.getListOfBooks()){
            if (book.title==search){
                searchResult.add(book);

            }
        }
        for (Movie movie: mainController.getListOfMovies()){
            if (movie.title==search){
                searchResult.add(movie);

            }
        }
        for (Album album: mainController.getListOfAlbums()){
            if (album.title==search){
                searchResult.add(album);

            }
        }
        ListPrinter list=new ListPrinter();
        list.printList(searchResult);
        mainController.comunicationPrinter.showMessage("What position do you want to rent:");
        choosenElement=searchResult.get(getPositionInput());
        RentModule rent =new RentModule();
        rent.tryToRent();







    }
}
