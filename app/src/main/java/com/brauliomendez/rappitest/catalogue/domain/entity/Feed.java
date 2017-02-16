package com.brauliomendez.rappitest.catalogue.domain.entity;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by BraulioMendez on 2/11/17.
 */

public class Feed extends RealmObject {

    private Author author;

    private RealmList<Entry> entry = new RealmList<>();

    private Updated updated;

    private Rights_ rights;

    private Title_ title;

    private Icon icon;

    private RealmList<Link_> link = new RealmList<>();

    private Id_ id;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Updated getUpdated() {
        return updated;
    }

    public void setUpdated(Updated updated) {
        this.updated = updated;
    }

    public Rights_ getRights() {
        return rights;
    }

    public void setRights(Rights_ rights) {
        this.rights = rights;
    }

    public Title_ getTitle() {
        return title;
    }

    public void setTitle(Title_ title) {
        this.title = title;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public Id_ getId() {
        return id;
    }

    public void setId(Id_ id) {
        this.id = id;
    }

    public RealmList<Entry> getEntry() {
        return entry;
    }

    public void setEntry(RealmList<Entry> entry) {
        this.entry = entry;
    }

    public RealmList<Link_> getLink() {
        return link;
    }

    public void setLink(RealmList<Link_> link) {
        this.link = link;
    }
}
