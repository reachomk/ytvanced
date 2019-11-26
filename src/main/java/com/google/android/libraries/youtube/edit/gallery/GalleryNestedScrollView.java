package com.google.android.libraries.youtube.edit.gallery;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.View;
import defpackage.abe;
import defpackage.zpp;

public class GalleryNestedScrollView extends NestedScrollView {
    public zpp b;
    public int c;

    public GalleryNestedScrollView(Context context) {
        this(context, null);
    }

    public GalleryNestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GalleryNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 0;
    }

    public final void b(int i) {
        if (i <= 0) {
            b();
        } else {
            a(false);
        }
        abe.e(this);
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        if (i2 > 0) {
            i = this.c;
            if (scrollY < i) {
                scrollY = Math.min(i - scrollY, i2);
                scrollBy(0, scrollY);
                iArr[1] = scrollY;
            }
        }
    }

    public final void stopNestedScroll() {
        super.stopNestedScroll();
        zpp zpp = this.b;
        if (zpp != null) {
            zpp.W();
        }
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (f2 > 0.0f) {
            a(true);
        } else {
            zpp zpp = this.b;
            if (zpp != null) {
                zpp.W();
            }
        }
        return false;
    }

    public final void b() {
        scrollTo(0, 0);
    }

    public final void a(boolean z) {
        if (z) {
            a(this.c);
        } else {
            scrollTo(0, this.c);
        }
    }
}
