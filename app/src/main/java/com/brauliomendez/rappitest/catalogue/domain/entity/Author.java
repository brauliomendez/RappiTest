package com.brauliomendez.rappitest.catalogue.domain.entity;

import io.realm.RealmObject;

/**
 * Created by BraulioMendez on 2/11/17.
 */


public class Author extends RealmObject {

    private Name name;

    private Uri uri;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }
}
