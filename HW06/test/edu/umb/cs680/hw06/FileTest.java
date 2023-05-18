package edu.umb.cs680.hw06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileTest {
    private FileSystem fileSystem;
    @BeforeEach
    public void setUp(){
        fileSystem = TestFixtureInitializer.getFileSystem();
    }
    private String[] filetoStrArr(File f){
        String[] fileinfo = {f.getName(), f.getParent().getName(), String.valueOf(f.getSize())};
        return fileinfo;
    }
    @Test
    public void FileCTest(){
        Directory lib = (Directory) fileSystem.getRootsDirs().get(0).getChildren().get(1);
        File c = lib.getFiles().get(0);
        assertArrayEquals(new String[]{"c", "lib", "1006"}, filetoStrArr(c));
    }
    @Test
    public void isDirectoryTest(){
        Directory lib = (Directory) fileSystem.getRootsDirs().get(0).getChildren().get(1);
        File c = lib.getFiles().get(0);
        assertFalse(c.isDirectory()
        );
    }

}