package com.catfacts.Models

import java.util.*

class Images {

    private var mItems: String? = null
    private var mData: String? = null
    private var mNasaId: String? = null
    private var mDescription: String? = null
    private var mTitle: String? = null
    private var mKeywords: String? = null
    private var mDateCreate: Date? = null
    private var mDescription508: String? = null
    private var mLocation: String? = null
    private var mMediaType: String? = null
    private var mImage: String? = null
    private var mSubtitles: String? = null
    private var mVideo: String? = null

    constructor(
        mItems: String?,
        mData: String?,
        mNasaId: String?,
        mDescription: String?,
        mTitle: String?,
        mKeywords: String?,
        mDateCreate: Date?,
        mDescription508: String?,
        mLocation: String?,
        mMediaType: String?,
        mImage: String?,
        mSubtitles: String?,
        mVideo: String?

    ) {
        this.mItems = mItems
        this.mData = mData
        this.mNasaId = mNasaId
        this.mDescription = mDescription
        this.mTitle = mTitle
        this.mKeywords = mKeywords
        this.mDateCreate = mDateCreate
        this.mDescription508 = mDescription508
        this.mLocation = mLocation
        this.mMediaType = mMediaType
        this.mImage = mImage
        this.mSubtitles = mSubtitles
        this.mVideo = mVideo
    }


}