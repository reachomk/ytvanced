package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector.OnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.youtube.R;
import defpackage.aan;
import defpackage.amro;
import defpackage.eza;
import defpackage.jlk;
import defpackage.jlm;
import defpackage.jln;
import defpackage.jlo;
import defpackage.jmd;
import defpackage.ra;
import defpackage.xmr;
import defpackage.xoe;
import defpackage.xrn;
import defpackage.xss;
import java.util.ArrayList;
import java.util.List;

public class PivotTabsBar extends xmr {
    public final List a = new ArrayList();
    public Resources b;
    public LayoutInflater c;
    public xoe d;
    public Drawable e;
    public Drawable f;
    public ColorStateList g;
    public ColorStateList h;
    public ColorStateList i;
    public ColorStateList j;
    public ColorStateList k;
    public String l;
    public String m;
    public jln n;
    public boolean o;
    public boolean p;
    public amro q;
    public amro r;
    private aan w;
    private OnGestureListener x;

    public PivotTabsBar(Context context) {
        super(context);
        a(context, null);
    }

    public PivotTabsBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public PivotTabsBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        Context context2 = context;
        this.c = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, jmd.a);
        int color = obtainStyledAttributes.getColor(jmd.h, 0);
        int color2 = obtainStyledAttributes.getColor(jmd.j, 0);
        int color3 = obtainStyledAttributes.getColor(jmd.l, 0);
        int color4 = obtainStyledAttributes.getColor(jmd.i, -9474193);
        int color5 = obtainStyledAttributes.getColor(jmd.k, -1);
        this.e = getBackground();
        this.f = obtainStyledAttributes.getDrawable(jmd.b);
        this.q = a(context2, obtainStyledAttributes, jmd.g);
        this.r = a(context2, obtainStyledAttributes, jmd.f);
        int color6 = obtainStyledAttributes.getColor(jmd.c, 0);
        int color7 = obtainStyledAttributes.getColor(jmd.d, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(jmd.e, 0);
        obtainStyledAttributes.recycle();
        if (dimensionPixelSize > 0) {
            if (Color.alpha(color6) > 0) {
                this.e = a(this.e, color6, dimensionPixelSize);
            }
            if (Color.alpha(color7) > 0) {
                this.f = a(this.f, color7, dimensionPixelSize);
            }
        }
        setBackground(this.e);
        this.d = new xoe(context2);
        this.g = a(color, color2);
        this.h = a(color4, color5);
        this.k = a(color, color3);
        this.i = this.d.a(color2, color2, color2, color2, color2, color2).withAlpha(66);
        int i = color5;
        this.j = this.d.a(color5, color5, i, i, i, i).withAlpha(66);
        this.b = context.getResources();
        this.l = this.b.getString(R.string.tab_with_new_content);
        this.m = this.b.getString(R.string.tab_with_nine_plus_new_items);
        setFillViewport(xss.b(context) ^ 1);
        this.x = new jlm(this);
        this.w = new aan(context2, this.x);
    }

    private static Drawable a(Drawable drawable, int i, int i2) {
        eza eza = new eza(drawable, i, i2);
        eza.a(48);
        return eza;
    }

    private final ColorStateList a(int i, int i2) {
        return this.d.a(i, i2, i, i2, i2, i);
    }

    private static amro a(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        ra.a(context, resourceId);
        return new jlk(context, resourceId);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (xrn.c(getContext()) || !this.o) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.w.a(motionEvent);
        return true;
    }

    public final void a(MotionEvent motionEvent) {
        if (this.n != null) {
            motionEvent.setAction(3);
            this.n.a(motionEvent, getHeight());
        }
    }

    public final void b(MotionEvent motionEvent) {
        jln jln = this.n;
        if (jln != null) {
            jln.a(motionEvent, getHeight());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -1, 17);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onConfigurationChanged(Configuration configuration) {
        setFillViewport(xss.b(getContext()) ^ 1);
    }

    public final void a() {
        this.a.clear();
        super.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, boolean z) {
        View c = c(i);
        if (c != null) {
            c.setSelected(z);
            c.setActivated(z);
            a(i, false, 0);
        }
    }

    public final void a(int i, boolean z, int i2) {
        View view = null;
        jlo jlo = (i < 0 || i >= this.a.size()) ? null : (jlo) this.a.get(i);
        if (jlo != null) {
            view = jlo.a;
        }
        if (view == c(i)) {
            jlo.a(z, i2);
            return;
        }
        throw new IllegalStateException("Internal pivot bar tab state does not match view hierarchy");
    }
}
