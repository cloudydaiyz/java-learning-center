package com.cloudydaiyz.learningcenter.playground;

import java.net.URL;
import java.io.File;
import java.util.Scanner;

// Class meant to read files from the resources folder
public class ResourceReader {

    public void readFromResources(String fileName) {
        Class<? extends ResourceReader> thisClass = getClass();
        ClassLoader thisClassLoader = thisClass.getClassLoader();
        System.out.println(thisClass);
        System.out.println(thisClassLoader);

        // What's the difference between these two?
        URL resource1 = thisClass.getResource(fileName); // #1
        URL resource2 = thisClassLoader.getResource(fileName); // #2

        /*
         * #1 retrieves the file from the local folder (in this case, it would
         * get ${fileName} from the com.cloudydaiyz.learningcenter.playground
         * package) whenever there's no '/' in front of the file name, indicating
         * to use a relative class path. Whenever an absolute class path is
         * specified, it will search for the file starting from the root of the
         * class path (the src folder) rather than where the package is located at.
         *
         * #2 assumes that the path is the absolute path. It will always search
         * starting at the root of the class path (the src folder).
         *
         * In this case, since I'm using Gradle as my build system, if test.txt
         * is included in this playground folder/package, it won't be read because
         * of how my project is built. It's better to keep files like this in the
         * src/resources folder so that they are preserved in the resulting build
         * file that Gradle creates, and can be read from.
         */

        System.out.println(resource1);
        System.out.println(resource2);

        if(resource1 != null) {
            readFromPath(resource1.getPath());
        }

        if(resource2 != null) {
            readFromPath(resource2.getPath());
        }
    }

    private void readFromPath(String path) {
        File f = new File(path);

        // Read from the file using a Scanner
        try {
            Scanner reader = new Scanner(f);
            while(reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        } catch(Exception e) {
            System.out.println("Ran into an error:");
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        System.out.println("INSIDE ResourceReader CLASS");
        ResourceReader rr = new ResourceReader();
        rr.readFromResources("test.txt");
    }
}
