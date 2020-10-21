package files;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilesLecture {
    public static void main(String[] args)  {
        String directoryName = "data"; // defining string
        String fileName = "grocery_List.txt";// defining string

        //We have to create a directory first before we create the file.

        try {
           Path dataFilePath = FileIO.createDirectoryAndFile(directoryName, fileName);

            //Write our grocery list to the file.
            List<String> groceryList = Arrays.asList("milk", "eggs","bacon"); //creating list
            Files.write(dataFilePath,groceryList);//pushing list to file

           FileIO.printFileContents(dataFilePath);//writing list in command line

            //Append to the file.
            Files.write(dataFilePath, Arrays.asList("cereal", "bread"), StandardOpenOption.APPEND);
            FileIO.printFileContents(dataFilePath);

            //Replace a line in the file.

            FileIO.updateLine(dataFilePath, "milk", "whole milk");
            FileIO.printFileContents(dataFilePath);

            //Remove a line from a file.
            FileIO.deleteLine(dataFilePath, "bread");
            FileIO.printFileContents(dataFilePath);

            //Empty the list
            Files.write(dataFilePath, new ArrayList<>());
            System.out.println("After empty");
            FileIO.printFileContents(dataFilePath);
        } catch (IOException ex) {
            System.out.println("Cannot create the file.");
            ex.printStackTrace();
        }
    }
}
