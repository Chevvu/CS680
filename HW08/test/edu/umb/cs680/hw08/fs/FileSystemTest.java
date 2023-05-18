package edu.umb.cs680.hw08.fs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileSystemTest {
    private FileSystem fileSystem;
    @BeforeEach
    public void setUp(){
        fileSystem = TestFixtureInitializer.getFileSystem();
    }
    @Test
    public void getrootDirTest(){

        assertEquals("prjRoot", fileSystem.getRootsDirs().get(0).getName());
    }

}