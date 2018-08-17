/*
create directory
check if a directory exists
check if a file exists
read a file you create ahead of time
write to the file
append to the file
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


class FileExamples {

    public static void main(String[] args) {


        Path testFilePath = Paths.get("./src", "test.txt");

        try {
            Files.createFile(testFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }


//        boolean fileLecturePath;
//        System.out.println();
        


    }

}