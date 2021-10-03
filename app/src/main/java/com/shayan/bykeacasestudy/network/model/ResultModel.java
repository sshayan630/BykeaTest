package com.shayan.bykeacasestudy.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ResultModel {

    @SerializedName("artistName")
    @Expose
    private String artistName;
    @SerializedName("collectionName")
    @Expose
    private String albumName;
    @SerializedName("trackName")
    @Expose
    private String trackName;
    @SerializedName("previewUrl")
    @Expose
    private String previewUrl;
    @SerializedName("artworkUrl100")
    @Expose
    private String artworkUrl100;


    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }
}