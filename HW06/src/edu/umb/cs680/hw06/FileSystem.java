package edu.umb.cs680.hw06;

import java.util.LinkedList;

public class FileSystem {
    private LinkedList<Directory> rootsDirs;
    private static FileSystem fileSystem = null;
    private FileSystem(){}
    public static FileSystem getFileSystem(){
        if(fileSystem == null){
            fileSystem = new FileSystem();
        }
        return fileSystem;
    }

    public LinkedList<Directory> getRootsDirs() {
        return this.rootsDirs;
    }
    public void appendRootDir(Directory root){
        if(this.rootsDirs == null){
            this.rootsDirs = new LinkedList<Directory>();
        }
        this.rootsDirs.add(root);
    }
}
