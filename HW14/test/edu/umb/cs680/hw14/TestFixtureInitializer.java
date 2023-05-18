package edu.umb.cs680.hw14;

import java.time.LocalDateTime;

public class TestFixtureInitializer {
    public static FileSystem getFileSystem(){
        Directory prjRoot = new Directory(null, "prjRoot", 999, LocalDateTime.now());
        Directory src = new Directory(prjRoot, "src", 1000, LocalDateTime.now());
        Directory lib = new Directory(prjRoot, "lib", 1001, LocalDateTime.now());
        Directory test = new Directory(prjRoot, "test", 1002, LocalDateTime.now());
        File x = new File(prjRoot, "x", 1003, LocalDateTime.now());
        File a = new File(src, "a", 1004, LocalDateTime.now());
        File b = new File(src, "b", 1005, LocalDateTime.now());
        File c = new File(lib, "c", 1006, LocalDateTime.now());
        Directory src_1 = new Directory(test, "src", 1006, LocalDateTime.now());
        Link y = new Link(prjRoot, "y", 1008, LocalDateTime.now(),src_1 );
        File d = new File(src_1, "d", 1007, LocalDateTime.now());
        FileSystem fileSystem = FileSystem.getFileSystem();
        fileSystem.appendRootDir(prjRoot);
        prjRoot.appendChild(src);
        prjRoot.appendChild(lib);
        prjRoot.appendChild(test);
        prjRoot.appendChild(x);
        prjRoot.appendChild(y);
        src.appendChild(a);
        src.appendChild(b);
        lib.appendChild(c);
        test.appendChild(src_1);
        src_1.appendChild(d);
        return fileSystem;
    }
}
