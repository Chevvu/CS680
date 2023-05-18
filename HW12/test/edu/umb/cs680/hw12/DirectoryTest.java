package edu.umb.cs680.hw12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectoryTest {

    private FileSystem fileSystem;
    @BeforeEach
    public void setUp(){
        fileSystem = TestFixtureInitializer.getFileSystem();
    }
    private String[] dirToStrArr(Directory d){
        String[] dirinfo = {d.getName(), (d.getParent() == null)?"null":d.getParent().getName(), String.valueOf(d.getSize())};
        return dirinfo;
    }
    @Test
    public void test_srcTest(){
        Directory test = (Directory) fileSystem.getRootsDirs().get(0).getChildren().get(2);
        Directory src_1 = (Directory) test.getChildren().get(0);
        assertArrayEquals(new String[]{"src", "test", "1006"}, dirToStrArr(src_1));
    }
    @Test
    public void test_Test(){
        Directory test = (Directory) fileSystem.getRootsDirs().get(0).getChildren().get(2);
        assertArrayEquals(new String[]{"test", "prjRoot", "1002"}, dirToStrArr(test));
    }
    @Test
    public void isDirectory(){
        Directory test = (Directory) fileSystem.getRootsDirs().get(0).getChildren().get(2);
        assertTrue(test.isDirectory());
    }
    @Test
    public void getFilesTest(){
        Directory test = (Directory) fileSystem.getRootsDirs().get(0).getChildren().get(2);
        Directory src_1 = (Directory) test.getChildren().get(0);
        File d = (File) src_1.getChildren().get(0);
        assertSame(d, src_1.getFiles().get(0));
    }

}