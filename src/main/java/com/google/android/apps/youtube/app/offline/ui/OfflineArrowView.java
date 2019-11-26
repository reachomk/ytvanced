package com.google.android.apps.youtube.app.offline.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import com.google.android.apps.youtube.app.common.widget.TintableImageView;
import com.google.android.youtube.R;
import defpackage.hqt;
import defpackage.ra;
import defpackage.st;
import defpackage.tst;
import defpackage.xuv;

public class OfflineArrowView extends FrameLayout {
    public ProgressBar a;
    public ProgressBar b;
    public int c;
    public int d;
    public ColorStateList e;
    private TintableImageView f;
    private AnimationDrawable g;
    private int h;
    private int i;
    private int j;
    private int k;
    private ColorStateList l;

    public OfflineArrowView(Context context) {
        super(context);
        a(xuv.a(context, null, 0), null);
    }

    public OfflineArrowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(xuv.a(context, attributeSet, 0), attributeSet);
    }

    public OfflineArrowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(xuv.a(context, attributeSet, 0), attributeSet);
    }

    public OfflineArrowView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(xuv.a(context, attributeSet, 0), attributeSet);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        int defaultColor;
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hqt.a);
        this.h = obtainStyledAttributes.getResourceId(hqt.d, R.drawable.ic_offline_default);
        this.i = obtainStyledAttributes.getResourceId(hqt.h, R.drawable.ic_offline_start);
        this.j = obtainStyledAttributes.getResourceId(hqt.b, R.drawable.ic_offline_progress);
        this.k = obtainStyledAttributes.getResourceId(hqt.c, R.drawable.ic_offline_finished);
        this.c = obtainStyledAttributes.getResourceId(hqt.f, R.drawable.ic_offline_unavailable);
        this.e = obtainStyledAttributes.getColorStateList(hqt.g);
        this.l = obtainStyledAttributes.getColorStateList(hqt.e);
        obtainStyledAttributes.recycle();
        Drawable a = ra.a(context, (int) R.drawable.offline_progress_bar);
        ColorStateList colorStateList = this.e;
        if (colorStateList != null) {
            defaultColor = colorStateList.getDefaultColor();
            a = st.d(a);
            st.a(a, this.e);
        } else {
            defaultColor = resources.getColor(R.color.offline_progress_bar_color);
        }
        this.f = new TintableImageView(context);
        this.f.setScaleType(ScaleType.CENTER);
        b();
        this.a = new ProgressBar(context, null, 16842872);
        this.a.setProgressDrawable(a);
        this.a.setRotation(-90.0f);
        this.b = new ProgressBar(context);
        this.b.setIndeterminateDrawable(new tst(resources.getDimensionPixelSize(R.dimen.offline_progress_bar_thickness), resources.getDimensionPixelSize(R.dimen.offline_progress_bar_inset_radius), new int[]{defaultColor}));
        this.b.setVisibility(8);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.offline_progress_bar_size);
        LayoutParams layoutParams = new LayoutParams(dimensionPixelSize, dimensionPixelSize, 17);
        addView(this.b, layoutParams);
        addView(this.a, layoutParams);
        addView(this.f, new LayoutParams(-2, -2, 17));
    }

    public final void a() {
        if (this.g == null) {
            this.g = (AnimationDrawable) ra.a(getContext(), this.j);
        }
        a(this.j, false);
        this.f.setImageDrawable(this.g);
        this.d = this.j;
        if (!this.g.isRunning()) {
            this.g.start();
        }
    }

    public final void b() {
        a(this.h);
    }

    public final void c() {
        b(this.i);
    }

    public final void d() {
        b(this.k);
    }

    public final void a(int i) {
        b(i, true);
    }

    public final void b(int i) {
        b(i, false);
    }

    private final void b(int i, boolean z) {
        this.d = i;
        AnimationDrawable animationDrawable = this.g;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
        a(i, z);
        this.f.setImageResource(i);
    }

    public final void a(int i, boolean z) {
        ColorStateList colorStateList = this.e;
        if (colorStateList != null) {
            this.f.a(colorStateList);
            return;
        }
        if (z) {
            ColorStateList colorStateList2 = this.l;
            if (colorStateList2 != null) {
                this.f.a(colorStateList2);
                return;
            }
        }
        if (i == this.h) {
            this.f.a(TintableImageView.a);
        } else {
            this.f.a(null);
        }
    }

    public final void e() {
        this.a.setVisibility(8);
        this.b.setVisibility(8);
    }

    public final void c(int i) {
        this.a.setVisibility(0);
        this.b.setVisibility(8);
        this.a.setMax(100);
        this.a.setProgress(i);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }
}
