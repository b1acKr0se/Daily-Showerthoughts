package com.framgia.dailyshowerthoughts.ui.view;


import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import com.framgia.dailyshowerthoughts.R;

public class ExpandButton extends ImageView {
    private State state = State.COLLAPSED;
    private ImageView imageView;

    public ExpandButton(Context context) {
        super(context);
        init(context);
    }

    public ExpandButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ExpandButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        inflate(context, R.layout.button_expand, null);
        imageView = (ImageView) findViewById(R.id.btn_expand);
    }

    public void playAnimation() {
        imageView.clearAnimation();
        Animation a;
        if (state == State.COLLAPSED) {
            a = new RotateAnimation(0.0f, 360.0f,
                    Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
                    0.5f);
            a.setRepeatCount(-1);
            a.setDuration(300);
            state = State.EXPANDED;
        } else {
            a = new RotateAnimation(360.0f, 0.0f,
                    Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
                    0.5f);
            a.setRepeatCount(-1);
            a.setDuration(300);
            state = State.COLLAPSED;
        }
        imageView.startAnimation(a);
    }

    private enum State {
        EXPANDED, COLLAPSED
    }
}
