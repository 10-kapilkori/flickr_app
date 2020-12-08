package com.example.flickrapp;

import java.io.Serializable;

class Photo implements Serializable {

    private static final long serialVersionUID = 1L;

    String mTitle;
    String mAuthor;
    String mAuthorId;
    String mTags;
    String mLink;
    String mImage;

    public Photo(String title, String author, String authorId, String tags, String image, String link) {
        mTitle = title;
        mAuthor = author;
        mAuthorId = authorId;
        mTags = tags;
        mLink = link;
        mImage = image;
    }

    String getTitle() {
        return mTitle;
    }

    String getAuthor() {
        return mAuthor;
    }

    String getAuthorId() {
        return mAuthorId;
    }

    String getTags() {
        return mTags;
    }

    String getLink() {
        return mLink;
    }

    String getImage() {
        return mImage;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "mTitle='" + mTitle + '\'' +
                ", mAuthor='" + mAuthor + '\'' +
                ", mAuthorId='" + mAuthorId + '\'' +
                ", mTags='" + mTags + '\'' +
                ", mLink='" + mLink + '\'' +
                ", mImage='" + mImage + '\'' +
                '}';
    }
}
