package MediathequeCenter.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchModule {
    private MainController mainController;
    private String getInput() {
        //Enter data using BufferReader
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        String name = null;
        try {
            name = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Printing the read line
        return name;
    }
    public void search(){
        mainController.

    }
}
