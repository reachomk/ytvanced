package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import defpackage.biw;
import defpackage.xpl;
import defpackage.xqi;
import java.util.ArrayList;
import java.util.List;

public class RtlAwareViewPager extends xqi {
    public List k;
    public biw l;

    public RtlAwareViewPager(Context context) {
        super(context);
        d();
    }

    public RtlAwareViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    private final void d() {
        this.e = new xpl(this);
    }

    public final int c(int i) {
        if (getResources().getConfiguration().getLayoutDirection() != 1) {
            return i;
        }
        return (this.b.c() - i) - 1;
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        if (indexOfChild(view) == -1) {
            super.addView(view, c(i), layoutParams);
        }
    }

    public final void addView(View view, int i) {
        if (indexOfChild(view) == -1) {
            super.addView(view, c(i));
        }
    }

    public final int a() {
        return c(this.c);
    }

    public final void a(int i, boolean z) {
        super.a(c(i), z);
    }

    public final void b(int i) {
        super.b(c(i));
    }

    public final void a(biw biw) {
        this.l = biw;
    }

    public final void b(biw biw) {
        if (this.k == null) {
            this.k = new ArrayList();
        }
        this.k.add(biw);
    }

    public final void c(biw biw) {
        List list = this.k;
        if (list != null) {
            list.remove(biw);
        }
    }
}
