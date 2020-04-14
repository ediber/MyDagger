package com.e.mydagger;

/**
 * Created by Edi.Bershatsky on 13/03/2017.
 */

public class Dog {
//    @Inject
    String name;

//    @Inject
    Bone bone;

    public Dog(String name, Bone bone) {
        this.name = name;
        this.bone = bone;
    }

    public String getName() {
        return name;
    }

    public Bone getBone() {
        return bone;
    }
}
