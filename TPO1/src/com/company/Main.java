package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String dirName = System.getProperty("user.home") + "/TPO1dir";
        String resultFileName = "TPO1res.txt";
        Futil.processDir(dirName, resultFileName);
    }
}
