package codeeval.easy.readmore;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public final class Main {
    public static void main(String[] args) throws Exception {
        File inputFile = new File(args[0]);
        InputStream fileStream = new FileInputStream(inputFile);
        Reader inputReader = new InputStreamReader(fileStream, Charset.defaultCharset());
        BufferedReader buffer = new BufferedReader(inputReader);

        String line;
        while ((line = buffer.readLine()) != null) {
            String string = line.trim();

            if (string.length() > 55) {
                string = string.substring(0, 40);

                int lastIndex = string.lastIndexOf(" ") + 1;
                string = string.substring(0, lastIndex == 0
                    ? 40
                    : lastIndex).trim() + "... <Read More>";
            }

            System.out.println(string);
        }
    }
}
