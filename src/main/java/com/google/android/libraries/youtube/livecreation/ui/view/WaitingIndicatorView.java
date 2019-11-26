package com.google.android.libraries.youtube.livecreation.ui.view;

import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.CountDownTimer;
import android.os.PowerManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.acsx;
import defpackage.acsy;
import defpackage.acsz;
import defpackage.acta;
import defpackage.actb;
import defpackage.actc;
import defpackage.xrn;

public class WaitingIndicatorView extends RelativeLayout {
    public CountDownTimer a;
    public Circle b;
    public TextView c;
    public actc d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;
    private AnimatorSet i;

    public WaitingIndicatorView(Context context) {
        this(context, null);
    }

    public WaitingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = false;
        LayoutInflater.from(context).inflate(R.layout.lc_waiting_indicator, this, true);
        this.b = (Circle) findViewById(R.id.circle);
        this.c = (TextView) findViewById(R.id.digit);
    }

    public final void a() {
        b();
        boolean z = false;
        if (VERSION.SDK_INT >= 21 && ((PowerManager) getContext().getSystemService("power")).isPowerSaveMode()) {
            z = true;
        }
        this.h = z;
        if (!z) {
            this.i = new AnimatorSet();
            float f = this.b.a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 360.0f});
            ofFloat.addUpdateListener(new acsx(this));
            ofFloat.addListener(new acsz(this));
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.setDuration(650);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 360.0f});
            ofFloat2.addUpdateListener(new acsy(this, f));
            ofFloat2.addListener(new actb(this));
            ofFloat2.setDuration(350);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.c, "translationY", new float[]{50.0f, 0.0f});
            ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
            long j = 300;
            ofFloat3.setDuration(300);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.c, "alpha", new float[]{0.0f, 1.0f});
            ofFloat4.setDuration(300);
            this.i.play(ofFloat).before(ofFloat2);
            this.i.play(ofFloat).with(ofFloat3).with(ofFloat4);
            this.i.addListener(new acta(this));
            AnimatorSet animatorSet = new AnimatorSet();
            Builder play = animatorSet.play(this.i);
            if (xrn.c(getContext())) {
                j = 5000;
            }
            play.after(j);
            animatorSet.start();
        }
    }

    public final void b() {
        AnimatorSet animatorSet = this.i;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.i.end();
            this.i.cancel();
            this.i = null;
        }
        CountDownTimer countDownTimer = this.a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.a = null;
        }
        this.e = false;
        this.f = false;
        this.g = 0;
        this.b.setVisibility(4);
        this.c.setVisibility(4);
        this.c.setText("");
    }
}
