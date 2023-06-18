package org.example;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    static void writeToFile(String outputFile, String text) throws IOException {
        FileWriter myWriter = new FileWriter(outputFile);
        myWriter.write(text);
        myWriter.close();
    }

    static String readFile(String inputFile) throws FileNotFoundException {
        String fileData = "";
        File sourceFile = new File(inputFile);
        Scanner scannerText = new Scanner(sourceFile);
        while (scannerText.hasNextLine()) {
            String s = scannerText.nextLine();
            fileData += s;
            fileData += '\n';
        }
        scannerText.close();
        return fileData;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException{
        String sourceFile = "Samples/Input6.txt";
        String targetFile = "Samples/Output6.txt";
        String prog = readFile(sourceFile);
        STLexer lexer = new STLexer(CharStreams.fromString(prog));
        STParser parser = new STParser(new CommonTokenStream(lexer));
        STParser.StartContext tree = parser.start();
        MySTVisitor visitor = new MySTVisitor();
        String result = visitor.visit(tree);
        writeToFile(targetFile, result);
    }
}