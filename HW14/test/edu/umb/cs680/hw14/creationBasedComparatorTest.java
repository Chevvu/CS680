package edu.umb.cs680.hw14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class creationBasedComparatorTest {
    private FileSystem fileSystem;
    @BeforeEach
    public void setUp(){
        fileSystem = TestFixtureInitializer.getFileSystem();
    }
    @Test
    public void creationBasedComparatorTest(){
        Directory src = (Directory) fileSystem.getRootsDirs().get(0).getChildren().get(1);
        File a = src.getFiles().get(0);
        File b = src.getFiles().get(1);
        assertSame(a, src.getFiles((FSElement fs1, FSElement fs2)->fs2.getCreationTime().compareTo(fs1.getCreationTime())).get(0));
        assertSame(b, src.getFiles((FSElement fs1, FSElement fs2)->fs2.getCreationTime().compareTo(fs1.getCreationTime())).get(1));
    }

}