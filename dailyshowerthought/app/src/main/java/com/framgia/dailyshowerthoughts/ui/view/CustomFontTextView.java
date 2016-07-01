package com.framgia.dailyshowerthoughts.ui.view;


import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.framgia.dailyshowerthoughts.constant.FontConst;
import com.framgia.dailyshowerthoughts.util.FontCache;

public class CustomFontTextView extends TextView {
    public CustomFontTextView(Context context) {
        super(context);
        applyFont(context);
    }

    public CustomFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyFont(context);

    }

    public CustomFontTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyFont(context);
    }

    private void applyFont(Context context) {
        Typeface customFont = FontCache.getTypeface(context, FontConst.HOT_AUGUST_NIGHT);
        setTypeface(customFont);
    }
}
