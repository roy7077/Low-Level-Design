
import java.util.ArrayList;
import java.util.List;

import Interface.FileSystem;
import classes.*;


public class main {
    public static void main(String[] args) {
        
        // create some files
        FileSystem f1 = new File("helloWorld.cpp");
        FileSystem f2 = new File("HelloWorld.java");

        // create some directory
        FileSystem d1 = new Directory(new ArrayList<>(List.of(f1)));
        FileSystem d2 = new Directory(new ArrayList<>(List.of(f2)));
        FileSystem rootD = new Directory(new ArrayList<>(List.of(d1,d2)));

        rootD.print();
    }
}
