package com.google.android.libraries.youtube.player.subtitles.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import defpackage.ajjc;
import defpackage.ajjm;
import defpackage.aocf;
import java.util.ArrayList;
import java.util.List;

public class SubtitleWindowView extends ViewGroup {
    public List a;
    public ajjm b;
    public boolean c;
    private Resources d;
    private List e;
    private List f;
    private List g;
    private List h;
    private int i;
    private float j;
    private Typeface k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private ajjc p;

    public SubtitleWindowView(Context context) {
        super(context);
        a();
    }

    public SubtitleWindowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public SubtitleWindowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private final void a() {
        this.o = false;
        this.d = getContext().getResources();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.a = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.b = new ajjm(getContext());
        int dimension = (int) this.d.getDimension(R.dimen.subtitle_window_padding);
        this.b.setPadding(dimension, dimension, dimension, dimension);
    }

    public final void a(int i) {
        this.i = i;
        for (ajjm a : this.a) {
            a.a(i);
        }
        requestLayout();
    }

    public final void a(float f) {
        this.j = f;
        this.b.a(f);
        for (ajjm a : this.a) {
            a.a(f);
        }
        requestLayout();
    }

    public final void a(Typeface typeface) {
        this.k = typeface;
        this.b.a(typeface);
        for (ajjm a : this.a) {
            a.a(typeface);
        }
        requestLayout();
    }

    public final void b(int i) {
        this.l = i;
        for (ajjm b : this.a) {
            b.b(i);
        }
        requestLayout();
    }

    public final void c(int i) {
        this.m = i;
        this.b.c(i);
        for (ajjm c : this.a) {
            c.c(i);
        }
        requestLayout();
    }

    public final void d(int i) {
        this.n = i;
        for (ajjm backgroundColor : this.a) {
            backgroundColor.setBackgroundColor(i);
        }
        requestLayout();
    }

    public final void setBackgroundColor(int i) {
        if (i != 0) {
            GradientDrawable gradientDrawable = (GradientDrawable) this.d.getDrawable(R.drawable.subtitle_window).mutate();
            gradientDrawable.setColor(i);
            setBackground(gradientDrawable);
            return;
        }
        super.setBackgroundColor(0);
    }

    public final void a(ajjc ajjc) {
        this.p = ajjc;
        this.f.clear();
        this.e.clear();
        this.g.clear();
        this.h.clear();
        CharSequence charSequence = ajjc.e;
        if (this.c) {
            this.o = false;
            this.f.add(ajjc.c);
            this.e.add(ajjc.d);
        } else {
            this.o = false;
            a(this.f, ajjc.c);
            a(this.e, ajjc.d);
        }
        requestLayout();
    }

    private static void a(List list, CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        int i = 0;
        while (i < spannableStringBuilder.length()) {
            int indexOf = charSequence2.substring(i).indexOf("\n");
            indexOf = indexOf == -1 ? spannableStringBuilder.length() : indexOf + i;
            list.add(spannableStringBuilder.subSequence(i, indexOf));
            i = indexOf + 1;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int dimension;
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i3 = 0;
        if (this.c) {
            paddingLeft = MeasureSpec.makeMeasureSpec(size - paddingLeft, aocf.UNSET_ENUM_VALUE);
            paddingTop = MeasureSpec.makeMeasureSpec(size2 - paddingTop, aocf.UNSET_ENUM_VALUE);
        } else {
            paddingLeft = MeasureSpec.makeMeasureSpec(size - paddingLeft, aocf.UNSET_ENUM_VALUE);
            paddingTop = MeasureSpec.makeMeasureSpec(size2 - paddingTop, 0);
        }
        for (int i4 = 0; i4 < this.e.size(); i4++) {
            ajjm ajjm;
            if (i4 < this.a.size()) {
                ajjm = (ajjm) this.a.get(i4);
            } else {
                ajjm = new ajjm(getContext());
                ajjm.a(this.i);
                ajjm.a(this.j);
                ajjm.a(this.k);
                ajjm.b(this.l);
                ajjm.c(this.m);
                ajjm.setBackgroundColor(this.n);
                ajjm.a();
                dimension = (int) this.d.getDimension(R.dimen.subtitle_window_padding);
                ajjm.setPadding(dimension, dimension, dimension, dimension);
                addView(ajjm);
                this.a.add(ajjm);
            }
            dimension = this.p.b.b;
            if (i4 < this.f.size()) {
                ajjm.setVisibility(0);
                ajjm.a((CharSequence) this.f.get(i4));
                ajjm.measure(paddingLeft, paddingTop);
            } else {
                ajjm.setVisibility(8);
            }
        }
        this.g.clear();
        this.h.clear();
        int i5 = 0;
        for (CharSequence a : this.e) {
            this.b.a(a);
            this.b.measure(paddingLeft, paddingTop);
            dimension = this.b.getMeasuredWidth();
            int measuredHeight = this.b.getMeasuredHeight();
            this.g.add(Integer.valueOf(dimension));
            this.h.add(Integer.valueOf(measuredHeight));
            i5 += measuredHeight;
            i3 = Math.max(dimension, i3);
        }
        paddingLeft = (getPaddingLeft() + getPaddingRight()) + i3;
        paddingTop = (getPaddingTop() + getPaddingBottom()) + i5;
        i = MeasureSpec.getMode(i);
        if (i == aocf.UNSET_ENUM_VALUE) {
            size = Math.min(size, paddingLeft);
        } else if (i != 1073741824) {
            size = paddingLeft;
        }
        if (MeasureSpec.getMode(i2) == aocf.UNSET_ENUM_VALUE) {
            size2 = Math.min(size2, paddingTop);
        } else if (i != 1073741824) {
            size2 = paddingTop;
        }
        setMeasuredDimension(size, size2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!this.h.isEmpty() && !this.g.isEmpty()) {
            i3 -= i;
            int paddingLeft = getPaddingLeft();
            i = i3 - getPaddingRight();
            i2 = getPaddingTop();
            i4 = this.p.b.b;
            for (int i5 = 0; i5 < this.e.size(); i5++) {
                ajjm ajjm = (ajjm) this.a.get(i5);
                int intValue = ((Integer) this.g.get(i5)).intValue();
                int intValue2 = ((Integer) this.h.get(i5)).intValue();
                if ((i4 & 4) != 0) {
                    intValue = i - intValue;
                } else if ((i4 & 2) != 0) {
                    double d = (double) (i3 - intValue);
                    Double.isNaN(d);
                    intValue = (int) (d / 2.0d);
                } else {
                    intValue = paddingLeft;
                }
                if (this.p.b.f) {
                    intValue = paddingLeft;
                }
                ajjm.layout(intValue, i2, ajjm.getMeasuredWidth() + intValue, ajjm.getMeasuredHeight() + i2);
                i2 += intValue2;
            }
        }
    }
}
