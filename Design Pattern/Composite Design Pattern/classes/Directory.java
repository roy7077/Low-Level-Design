package classes;

import java.util.ArrayList;
import Interface.FileSystem;

public class Directory implements FileSystem{

    private ArrayList<FileSystem> lists=new ArrayList<>();
    public Directory(ArrayList<FileSystem> lists){
        this.lists=lists;
    }

    public void print(){
        for(FileSystem file:this.lists){
            file.print();
        }
    }
}
