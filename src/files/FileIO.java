package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileIO {
    public static Path createDirectoryAndFile(String directoryName, String fileName)throws IOException {
        Path directoryPath = Paths.get(directoryName);
        Path dataFilePath = Paths.get(directoryName, fileName);
        // codeup-java-exercises/directoryName/fileName


        //We have to create a directory first before we create the file.

            if (Files.notExists(directoryPath)) {
                Files.createDirectories(directoryPath); //creates directory if it doesn't already exist
            }

            if (!Files.exists(dataFilePath)) {
                Files.createFile(dataFilePath);
            }

        return dataFilePath;
    }

    //Functionality
    public static void printFileContents(Path filePath) throws IOException{
        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath);
        for (int i = 0; i < fileContents.size() ; i++) {
            System.out.printf("%d: %s\n", (i + 1),fileContents.get(i));
        }
    }

    public static void updateLine(Path filePath, String oldValue, String newValue) throws IOException{
        List<String>fileContents = Files.readAllLines(filePath);
        List<String> modifiedList = new ArrayList<>();
        for(String item: fileContents){
            if(item.equals(oldValue)){
                //Add my modified item.
                modifiedList.add(newValue);
            }else{
                //Add the existing item because it isn't what we want to replace.
                modifiedList.add(item);
            }
        }
        Files.write(filePath, modifiedList);
    }

    public static void deleteLine(Path filePath, String itemToDelete) throws IOException{
        List<String> fileContents = Files.readAllLines(filePath);
        List<String> modifiedList = new ArrayList<>();
        for(String item: fileContents){
            if(!item.equals(itemToDelete)){
                modifiedList.add(item);
            }
        }
        Files.write(filePath, modifiedList);
    }
}
