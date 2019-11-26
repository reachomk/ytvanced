package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.abe;
import defpackage.wwy;
import defpackage.xmw;
import defpackage.xmx;
import defpackage.xmz;

public class AccessibilityLayerLayout extends FrameLayout {
    public boolean a = false;
    public int b;
    public final int c;
    public View d;
    public View e;
    private boolean f = false;

    public AccessibilityLayerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        xmw xmw = new xmw(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wwy.a);
        this.b = obtainStyledAttributes.getResourceId(wwy.b, 0);
        this.c = obtainStyledAttributes.getResourceId(wwy.c, 0);
        obtainStyledAttributes.recycle();
        this.d = findViewById(this.b);
        this.e = findViewById(this.c);
        abe.a((View) this, new xmx(this));
        abe.b((View) this, 1);
        setOnHierarchyChangeListener(new xmz(this));
    }

    public final void a() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (a(childAt)) {
                abe.b(childAt, 0);
            } else {
                abe.b(childAt, 4);
            }
        }
    }

    public final void a(boolean z) {
        getContext();
        this.f = z;
    }

    public final boolean a(View view) {
        if (view == null) {
            return false;
        }
        View view2;
        View childAt;
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                view2 = null;
                break;
            }
            childAt = getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                if (!this.a || childAt != this.e) {
                    view2 = childAt;
                }
            }
        }
        view2 = childAt;
        Object obj = (this.f && view == this.d) ? 1 : null;
        Object obj2 = (this.a && view == this.e) ? 1 : null;
        if (view != view2 && obj == null && obj2 == null) {
            return false;
        }
        return true;
    }
}
