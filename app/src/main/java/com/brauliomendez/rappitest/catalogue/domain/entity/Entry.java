package com.brauliomendez.rappitest.catalogue.domain.entity;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BraulioMendez on 2/11/17.
 */

public class Entry {

    @SerializedName("im:name")
    public NameEntry imName;

    @SerializedName("im:image")
    public List<ImageEntry> imImage = new ArrayList<>();

    public Summary summary;

    @SerializedName("im:price")
    public PriceEntry imPrice;

    @SerializedName("im:contentType")
    public ContentTypeEntry imContentType;

    public Rights rights;

    public Title title;

    public LinkEntry link;

    public IdEntry id;

    @SerializedName("im:artist")
    public ArtistEntry imArtist;

    public CategoryEntry category;

    @SerializedName("im:releaseDate")
    public ReleaseDateEntry imReleaseDate;


    public NameEntry getImName() {
        return imName;
    }

    public List<ImageEntry> getImImage() {
        return imImage;
    }

    public Summary getSummary() {
        return summary;
    }

    public PriceEntry getImPrice() {
        return imPrice;
    }

    public ContentTypeEntry getImContentType() {
        return imContentType;
    }

    public Rights getRights() {
        return rights;
    }

    public Title getTitle() {
        return title;
    }

    public LinkEntry getLink() {
        return link;
    }

    public IdEntry getId() {
        return id;
    }

    public ArtistEntry getImArtist() {
        return imArtist;
    }

    public CategoryEntry getCategory() {
        return category;
    }

    public ReleaseDateEntry getImReleaseDate() {
        return imReleaseDate;
    }
}