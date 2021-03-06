package codeeval.easy.themajorelement;

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
            int[] ints = new int[100];
            String[] intStrings = line.trim().split(",", -1);
            int occurrence = -1;
            int number = -1;

            for (String string : intStrings) {
                ints[Integer.parseInt(string)]++;
            }

            for (int i = 0; i < ints.length; i++) {
                if (ints[i] > (intStrings.length / 2) && ints[i] > occurrence) {
                    occurrence = ints[i];
                    number = i;
                }
            }

            System.out.println(occurrence > 0 ? number : "None");
        }
    }
}
