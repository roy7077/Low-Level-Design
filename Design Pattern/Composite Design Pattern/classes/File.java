package classes;

import Interface.FileSystem;

public class File implements FileSystem{
    private String fileName;
    public File(String fileName){
        this.fileName=fileName;
    }

    public void print(){
        System.out.println("FileName is "+this.fileName);
    }
}
