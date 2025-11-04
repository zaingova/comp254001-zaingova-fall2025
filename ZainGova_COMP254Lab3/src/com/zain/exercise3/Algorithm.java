package com.zain.exercise3;

import java.io.File;

/* Implement a recursive method with calling signature find(path, filename) that reports all entries
of the file system rooted at the given path having the given file name. Test the method with a real
path, filename from your file system. Hint: Review use of the java.io.File class and the week 5
examples. */

public class Algorithm {
    public static void Find(String path, String file) {
        File dir = new File(path);

        // If path isn't a directory, stop
        if (!dir.isDirectory()) {
            System.out.println("Not a directory: " + path);
            return;
        }

        File[] files = dir.listFiles();


        if (files != null) {
            for (File f : files) {
                //System.out.println(f.getName());
                if (f.isDirectory()) {
                    // Recurse into subdirectory
                    Find(f.getAbsolutePath(), file);
                } else {
                    // Compare to target file name
                    if (f.getName().equalsIgnoreCase(file)) {
                        System.out.println("Found: " + f.getAbsolutePath());
                    }
                }
            }
        }
    }
}
