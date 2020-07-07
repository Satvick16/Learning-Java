package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFiles {

    public static void main(String[] args) throws IOException {

        // http://textfiles.com/100/captmidn.txt

        File file = new File("captmidn.txt");
        Scanner scan = new Scanner(file);

        String fileContent = "";

        while (scan.hasNextLine()) {
            fileContent = fileContent.concat(scan.nextLine() + "\n");
        }

        FileWriter writer = new FileWriter("newfile.txt");
        writer.write(fileContent);
        writer.close();

    }
}
