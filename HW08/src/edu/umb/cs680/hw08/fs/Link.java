package edu.umb.cs680.hw08.fs;

import java.time.LocalDateTime;

public class Link extends FSElement{
    private FSElement target;
    public Link(Directory parent, String name, int size, LocalDateTime creationTime, FSElement target) {
        super(parent, name, size, creationTime);
        this.target = target;
    }

    @Override
    public boolean isDirectory() {
        return false;
    }

    @Override
    public void accept(FSVisitor visitor) {
        visitor.visit(this);
    }

    public FSElement getTarget() {
        return target;
    }
}
