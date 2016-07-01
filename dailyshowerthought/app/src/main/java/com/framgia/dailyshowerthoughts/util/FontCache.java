package com.framgia.dailyshowerthoughts.util;


import android.content.Context;
import android.graphics.Typeface;

import com.framgia.dailyshowerthoughts.constant.FontConst;

import java.util.HashMap;

public class FontCache {
    private static HashMap<String, Typeface> fontCache = new HashMap<>();

    public static Typeface getTypeface(Context context, @FontConst String fontName) {
        Typeface typeface = fontCache.get(fontName);
        if (typeface == null) {
            typeface = Typeface.createFromAsset(context.getAssets(), fontName);
            fontCache.put(fontName, typeface);
        }
        return typeface;
    }
}
