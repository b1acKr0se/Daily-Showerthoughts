package com.framgia.dailyshowerthoughts.constant;


import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.framgia.dailyshowerthoughts.constant.FontConst.HOT_AUGUST_NIGHT;
import static com.framgia.dailyshowerthoughts.constant.FontConst.MOSTLY_MONO;

@Retention(RetentionPolicy.SOURCE)
@StringDef({
        HOT_AUGUST_NIGHT,
        MOSTLY_MONO
})
public @interface FontConst {
    String HOT_AUGUST_NIGHT = "HotAugustNight.ttf";
    String MOSTLY_MONO = "MostlyMono.ttf";
}