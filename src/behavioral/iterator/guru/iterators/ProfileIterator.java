package behavioral.iterator.guru.iterators;

import behavioral.iterator.guru.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}