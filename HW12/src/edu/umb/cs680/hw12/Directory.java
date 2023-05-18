package edu.umb.cs680.hw12;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Directory extends FSElement{
    private LinkedList<FSElement> children;
    public Directory(Directory parent, String name, int size, LocalDateTime creationTime) {
        super(parent, name, size, creationTime);
    }

    @Override
    public boolean isDirectory() {
        return true;
    }
    public void appendChild(FSElement child){
        if(children == null){
            children = new LinkedList<FSElement>();
        }
        children.add(child);
    }

    public LinkedList<FSElement> getChildren() {
        Collections.sort(children, new AlphabeticalComparator());
        return children;
    }
    public int countChildren(){
        return this.children.size();
    }
    public LinkedList<Directory> getSubDirectories(){
        LinkedList<Directory> SubDirectories = new LinkedList<Directory>();
        for (FSElement child:getChildren()){
            if (child.isDirectory()){
                SubDirectories.add((Directory) child);
            }
        }
        Collections.sort(SubDirectories, new AlphabeticalComparator());
        return SubDirectories;
    }
    public LinkedList<File> getFiles(){
        LinkedList<File> files = new LinkedList<File>();
        for (FSElement child: getChildren()){
            if(child instanceof File){
                files.add((File) child);
            }
        }
        Collections.sort(files, new AlphabeticalComparator());
        return files;
    }
    public int getTotalSize(){
        int total = 0;
        for(FSElement child: getChildren()){
            if(child.isDirectory()){
                total = total+((Directory)child).getTotalSize();
            }
            else {
                total = total + child.getSize();
            }
        }
        return total;
    }
    public LinkedList<Directory> getSubDirectories(Comparator<FSElement> comparator){
        LinkedList<Directory> existingDirs = getSubDirectories();
        Collections.sort(existingDirs, comparator);
        return existingDirs;
    }
    public LinkedList<File> getFiles(Comparator<FSElement> comparator){
        LinkedList<File> existingFiles = getFiles();
        Collections.sort(existingFiles, comparator);
        return existingFiles;
    }
    public LinkedList<FSElement> getChildren(Comparator<FSElement> comparator){
        LinkedList<FSElement> children = getChildren();
        Collections.sort(children, comparator);
        return children;
    }

}
