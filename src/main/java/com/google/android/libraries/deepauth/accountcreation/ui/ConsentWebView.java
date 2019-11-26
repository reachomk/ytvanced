package com.google.android.libraries.deepauth.accountcreation.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import defpackage.shm;

public class ConsentWebView extends WebView {
    public shm a;
    private float b;
    private int c;

    public ConsentWebView(Context context) {
        super(context);
        b();
    }

    public ConsentWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public ConsentWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    public final boolean a() {
        return ((float) getContentHeight()) * this.b <= ((float) (this.c + 50));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.c = i4 - i2;
        super.onLayout(z, i, i2, i3, i4);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        shm shm = this.a;
        if (shm != null) {
            getScrollY();
            shm.a(computeVerticalScrollRange() - (getHeight() + i2) <= 50);
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    private final void b() {
        this.b = getResources().getDisplayMetrics().density;
    }
}
