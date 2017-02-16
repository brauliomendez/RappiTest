package com.brauliomendez.rappitest.catalogue.domain.entity;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by BraulioMendez on 2/11/17.
 */

public class Entry extends RealmObject {

    @SerializedName("im:name")
    private EntryName imName;

    @SerializedName("im:image")
    private RealmList<EntryImage> imImage = new RealmList<>();

    private Summary summary;

    @SerializedName("im:price")
    private EntryPrice imPrice;

    @SerializedName("im:contentType")
    private EntryContentType imContentType;

    private Rights rights;

    private Title title;

    private Link link;

    private Id id;

    @SerializedName("im:artist")
    private EntryArtist imArtist;

    private Category category;

    @SerializedName("im:releaseDate")
    private EntryReleaseDate imReleaseDate;

    public EntryName getImName() {
        return imName;
    }

    public void setImName(EntryName imName) {
        this.imName = imName;
    }

    public RealmList<EntryImage> getImImage() {
        return imImage;
    }

    public void setImImage(RealmList<EntryImage> imImage) {
        this.imImage = imImage;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public EntryPrice getImPrice() {
        return imPrice;
    }

    public void setImPrice(EntryPrice imPrice) {
        this.imPrice = imPrice;
    }

    public EntryContentType getImContentType() {
        return imContentType;
    }

    public void setImContentType(EntryContentType imContentType) {
        this.imContentType = imContentType;
    }

    public Rights getRights() {
        return rights;
    }

    public void setRights(Rights rights) {
        this.rights = rights;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public EntryArtist getImArtist() {
        return imArtist;
    }

    public void setImArtist(EntryArtist imArtist) {
        this.imArtist = imArtist;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public EntryReleaseDate getImReleaseDate() {
        return imReleaseDate;
    }

    public void setImReleaseDate(EntryReleaseDate imReleaseDate) {
        this.imReleaseDate = imReleaseDate;
    }

}