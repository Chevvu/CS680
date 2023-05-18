package edu.umb.cs680.hw07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkTest {
    private FileSystem fileSystem;
    @BeforeEach
    public void setUp(){
        fileSystem = TestFixtureInitializer.getFileSystem();
    }
    @Test
    public void LinkYTest(){
        Directory test = (Directory) fileSystem.getRootsDirs().get(0).getChildren().get(2);
        Link y = (Link)  fileSystem.getRootsDirs().get(0).getChildren().get(4);
        assertSame(test.getSubDirectories().get(0), y.getTarget());
    }
    private String[] LinktoStrArr(Link y){
        String[] linkinfo = {y.getName(), y.getParent().getName(), y.getTarget().getName()};
        return linkinfo;
    }
    @Test
    public void LinkEqualityTest(){
        Directory test = (Directory) fileSystem.getRootsDirs().get(0).getChildren().get(2);
        Link y = (Link)  fileSystem.getRootsDirs().get(0).getChildren().get(4);
        assertArrayEquals(new String[]{"y", "prjRoot", "src"}, LinktoStrArr(y));
    }

}