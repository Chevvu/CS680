package edu.umb.cs680.hw12;

import java.util.Comparator;

public class creationTimeBasedComparator implements Comparator<FSElement> {
    @Override
    public int compare(FSElement o1, FSElement o2) {
        return o2.getCreationTime().compareTo(o1.getCreationTime());
    }
}
