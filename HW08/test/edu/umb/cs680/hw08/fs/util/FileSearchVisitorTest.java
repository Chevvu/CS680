package edu.umb.cs680.hw08.fs.util;

import edu.umb.cs680.hw08.fs.Directory;
import edu.umb.cs680.hw08.fs.File;
import edu.umb.cs680.hw08.fs.FileSystem;
import edu.umb.cs680.hw08.fs.TestFixtureInitializer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileSearchVisitorTest {
    private FileSystem fileSystem;
    @BeforeEach
    public void setUp(){
        fileSystem = TestFixtureInitializer.getFileSystem();
    }
    @Test
    public void FileSearchingVisitorTest(){
        Directory src = (Directory) fileSystem.getRootsDirs().get(0).getChildren().get(0);
        FileSearchVisitor fsv = new FileSearchVisitor("b");
        src.accept(fsv );
        assertSame(src.getFiles().get(1), fsv.getFoundFiles().get(0));
    }

}