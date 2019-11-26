package com.google.android.apps.youtube.app.red.presenter;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.SmoothHeightResizeLayout;
import com.google.android.youtube.R;
import defpackage.abe;
import defpackage.ans;
import defpackage.aqyj;
import defpackage.bga;
import defpackage.bgx;
import defpackage.bhf;
import defpackage.bhj;
import defpackage.eyx;
import defpackage.ion;
import defpackage.ioo;
import defpackage.iop;
import defpackage.ior;
import defpackage.ios;
import defpackage.iot;
import defpackage.ioz;
import defpackage.xpr;
import defpackage.xuv;

public class NavigationDropdownView extends SmoothHeightResizeLayout {
    public TextView a;
    public TextView b;
    public ImageView c;
    public iot d;
    public aqyj e;
    public ValueAnimator f;
    public ios g;
    public ior h;
    public boolean i;
    public boolean j;
    private ViewGroup k;
    private ViewGroup l;
    private RecyclerView m;
    private bhj n;
    private boolean o;

    public NavigationDropdownView(Context context) {
        super(context);
        a(xuv.a(context, null, 0), null);
    }

    public NavigationDropdownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(xuv.a(context, attributeSet, 0), attributeSet);
    }

    public NavigationDropdownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(xuv.a(context, attributeSet, 0), attributeSet);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        if (this.k == null) {
            inflate(context, R.layout.navigation_dropdown_layout, this);
            this.k = (ViewGroup) findViewById(R.id.dropdown_wrapper);
            this.l = (ViewGroup) this.k.findViewById(R.id.dropdown_header);
            this.a = (TextView) this.l.findViewById(R.id.collapsed_title);
            this.b = (TextView) this.l.findViewById(R.id.expanded_title);
            this.c = (ImageView) this.l.findViewById(R.id.expand_button);
            this.m = (RecyclerView) this.k.findViewById(R.id.dropdown_items);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ioz.a);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(ioz.b);
            ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(ioz.c);
            obtainStyledAttributes.recycle();
            if (colorStateList == null) {
                colorStateList = this.a.getTextColors();
            }
            if (colorStateList2 == null) {
                colorStateList2 = this.b.getTextColors();
            }
            this.h = new ior(new ion(this), colorStateList, colorStateList2);
            this.m.setNestedScrollingEnabled(false);
            this.m.a(new ans());
            this.m.a(this.h);
            this.l.setOnClickListener(new iop(this));
            this.o = true;
            this.i = true;
            this.j = false;
        }
    }

    public final void a(boolean z) {
        this.i = z;
        c();
    }

    public final void c() {
        boolean z = false;
        if (this.i && this.j) {
            z = true;
        }
        xpr.a(this.m, z);
        xpr.a(this.c, z);
        this.l.setClickable(z);
    }

    public final void b(boolean z) {
        if (!this.o) {
            c(z);
        }
    }

    public final void c(boolean z) {
        if (this.i && this.j) {
            int i = 1;
            this.o ^= 1;
            if (z) {
                ViewGroup viewGroup;
                ValueAnimator valueAnimator = this.f;
                if (valueAnimator != null && valueAnimator.isStarted()) {
                    this.f.cancel();
                }
                a();
                if (this.n == null) {
                    this.n = new bhj();
                    long j = this.n.c;
                    bgx eyx = new eyx();
                    eyx.c(this.c);
                    bgx bga = new bga();
                    bga.c(this.a);
                    bga.c(this.b);
                    this.n.a(eyx).a(bga).a(new ioo(this, j));
                }
                ViewParent parent = getParent();
                if (parent == null) {
                    viewGroup = this;
                } else {
                    ViewParent parent2 = parent.getParent();
                    if (parent2 instanceof ViewGroup) {
                        parent = parent2;
                    }
                    viewGroup = (ViewGroup) parent;
                }
                bhf.a(viewGroup, this.n);
            }
            this.c.setRotation(!this.o ? 180.0f : 360.0f);
            this.c.setPressed(true);
            xpr.a(this.a, this.o);
            xpr.a(this.b, this.o ^ 1);
            if (this.h.a() > 1) {
                LayoutParams layoutParams = this.m.getLayoutParams();
                if (!this.o) {
                    i = -2;
                }
                layoutParams.height = i;
                this.m.setLayoutParams(layoutParams);
            }
            RecyclerView recyclerView = this.m;
            abe.a(recyclerView, recyclerView.getPaddingStart(), this.m.getPaddingTop(), this.m.getPaddingEnd(), !this.o ? getResources().getDimensionPixelSize(R.dimen.navigation_dropdown_expanded_recyclerview_bottom_padding) : 0);
        }
    }
}
