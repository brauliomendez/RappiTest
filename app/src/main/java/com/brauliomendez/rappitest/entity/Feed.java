package com.brauliomendez.rappitest.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BraulioMendez on 2/11/17.
 */

public class Feed {

    public Author author;

    public List<Entry> entry = new ArrayList<>();

    public Updated updated;

    public Rights rights;

    public Title title;

    public Icon icon;

    public List<LinkEntry> link = new ArrayList<>();

    public Author getAuthor() {
        return author;
    }

    public List<Entry> getEntry() {
        return entry;
    }

    public Updated getUpdated() {
        return updated;
    }

    public Rights getRights() {
        return rights;
    }

    public Title getTitle() {
        return title;
    }

    public Icon getIcon() {
        return icon;
    }

    public List<LinkEntry> getLink() {
        return link;
    }


}
