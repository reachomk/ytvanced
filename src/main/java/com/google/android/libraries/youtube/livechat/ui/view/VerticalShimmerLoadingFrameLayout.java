package com.google.android.libraries.youtube.livechat.ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.abxn;
import defpackage.abxp;
import defpackage.xpr;
import defpackage.xwe;
import java.util.concurrent.TimeUnit;

public class VerticalShimmerLoadingFrameLayout extends LoadingFrameLayout {
    private static final long f = TimeUnit.SECONDS.toMillis(1);
    public View d;
    public View e;
    private final ValueAnimator g;
    private final Context h;
    private final View i;

    public VerticalShimmerLoadingFrameLayout(Context context) {
        this(context, null);
    }

    public VerticalShimmerLoadingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalShimmerLoadingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = context;
        this.i = new View(context);
        this.i.setBackgroundColor(xwe.a(context, R.attr.liveChatShimmerLoadingFrameOverlayColor, 0));
        addView(this.i, -1, -1);
        this.d = new View(this.h);
        this.d.setBackgroundColor(xwe.a(this.h, R.attr.liveChatShimmerLoadingFrameBackgroundColor, 0));
        addView(this.d, -1, -1);
        int a = xwe.a(this.h, R.attr.liveChatShimmerLoadingFrameShimmerStartColor, 0);
        int a2 = xwe.a(this.h, R.attr.liveChatShimmerLoadingFrameShimmerMiddleColor, 0);
        int a3 = xwe.a(this.h, R.attr.liveChatShimmerLoadingFrameShimmerEndColor, 0);
        GradientDrawable gradientDrawable = new GradientDrawable(Orientation.BOTTOM_TOP, new int[]{a, a2, a3});
        this.e = new View(this.h);
        this.e.setBackground(gradientDrawable);
        addView(this.e, -1, -1);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setRepeatCount((int) (TimeUnit.SECONDS.toMillis(30) / f));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(f);
        ofFloat.addListener(new abxp(this));
        ofFloat.addUpdateListener(new abxn(this));
        this.g = ofFloat;
        a();
    }

    private final void d() {
        a(true);
        if (getChildAt(getChildCount() - 1) != this.e) {
            bringChildToFront(this.i);
            bringChildToFront(this.d);
            bringChildToFront(this.e);
        }
        if (!this.g.isStarted()) {
            this.g.start();
        }
    }

    private final void e() {
        this.g.end();
    }

    public final void a(boolean z) {
        xpr.a(this.i, z);
        xpr.a(this.d, z);
        xpr.a(this.e, z);
    }

    public final void a() {
        if (this.d != null && abe.H(this)) {
            d();
        }
    }

    public final void b() {
        if (this.d != null) {
            e();
            super.b();
        }
    }

    public final void a(CharSequence charSequence, boolean z) {
        if (this.d != null) {
            e();
            super.a(charSequence, z);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null && this.c == 1) {
            d();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.d != null) {
            e();
        }
    }
}
