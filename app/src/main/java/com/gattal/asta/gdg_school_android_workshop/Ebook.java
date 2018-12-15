package com.gattal.asta.gdg_school_android_workshop;

public class Ebook {
    private String mTitle;
    private String mAbstract;
    private Author mAuthor;
    private String mCover;
    private String mPdf;

    public void setmPdf(String mPdf) {
        this.mPdf = mPdf;
    }

    public Ebook(String mTitle, String mAbstract, Author mAuthor, String mCover, String mPdf) {
        this.mTitle = mTitle;
        this.mAbstract = mAbstract;
        this.mAuthor = mAuthor;
        this.mCover = mCover;
        this.mPdf = mPdf;
    }

    public String getmPdf() {
        return mPdf;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmAbstract() {
        return mAbstract;
    }

    public void setmAbstract(String mAbstract) {
        this.mAbstract = mAbstract;
    }

    public Author getmAuthor() {
        return mAuthor;
    }

    public void setmAuthor(Author mAuthor) {
        this.mAuthor = mAuthor;
    }

    public String getmCover() {
        return mCover;
    }

    public void setmCover(String mCover) {
        this.mCover = mCover;
    }
}
