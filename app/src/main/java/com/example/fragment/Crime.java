package com.example.fragment;
import android.os.Build;

import java.time.LocalDateTime;
import java.util.UUID;

public class Crime {
    private LocalDateTime mLocalDateTime;
    private UUID mId;
    private String mTitle;
    private  boolean mSolved;

    public Crime(){
        mId=UUID.randomUUID();
        mLocalDateTime=LocalDateTime.now();
    }

    public LocalDateTime getLocalDateTime() {
        return mLocalDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        mLocalDateTime = localDateTime;
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
