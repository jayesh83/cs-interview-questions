package codeeval.easy.compressedsequence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/**
 * Write a program that compresses a sequence of numbers
 */
public final class Main {
    public static void main(String[] args) throws Exception {
        File inputFile = new File(args[0]);
        InputStream fileStream = new FileInputStream(inputFile);
        Reader inputReader = new InputStreamReader(fileStream, Charset.defaultCharset());
        BufferedReader buffer = new BufferedReader(inputReader);

        String line;
        while ((line = buffer.readLine()) != null) {
            String[] intStrings = line.trim().split(" ", -1);
            int count = 0;
            int length = intStrings.length;
            for (int i = 0; i < length; i++) {
                if ((i + 1) != length && intStrings[i].equals(intStrings[i + 1])) {
                    ++count;
                } else {
                    ++count;
                    System.out.print(count + " " + intStrings[i] + " ");
                    count = 0;
                }
            }

            System.out.println();
        }
    }
}
