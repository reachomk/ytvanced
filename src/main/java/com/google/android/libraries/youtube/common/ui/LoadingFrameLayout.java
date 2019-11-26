package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import defpackage.amqw;
import defpackage.wwy;
import defpackage.xak;
import defpackage.xow;
import defpackage.xox;
import defpackage.xoy;

public class LoadingFrameLayout extends FrameLayout {
    public final Context a;
    public xox b;
    public int c;
    private xox d;
    private xow e;

    public LoadingFrameLayout(Context context) {
        this(context, R.layout.loading_frame_status_error_view, R.layout.loading_frame_status_progress_view, R.layout.loading_frame_status_empty_view);
    }

    public LoadingFrameLayout(Context context, int i, int i2, int i3) {
        this(context, i, i2);
        d(i3);
    }

    public LoadingFrameLayout(Context context, int i, int i2) {
        super(context);
        this.c = 0;
        this.a = (Context) amqw.a((Object) context);
        c(i2);
        a(i);
    }

    public LoadingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 0;
        this.a = (Context) amqw.a((Object) context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wwy.k, i, 0);
        c(obtainStyledAttributes.getResourceId(wwy.n, R.layout.loading_frame_status_progress_view));
        d(obtainStyledAttributes.getResourceId(wwy.l, R.layout.loading_frame_status_empty_view));
        a(obtainStyledAttributes.getResourceId(wwy.m, R.layout.loading_frame_status_error_view));
        obtainStyledAttributes.recycle();
        a();
    }

    private final void c(int i) {
        this.b = new xox(this, 1, i, 0);
    }

    private final void d(int i) {
        this.d = new xox(this, 4, i, R.id.empty_message_text);
    }

    public final void a(int i) {
        this.e = new xow(this, i);
    }

    public final void a(xoy xoy) {
        this.e.a = xoy;
    }

    public void a() {
        xak.a();
        e(1);
    }

    public void a(CharSequence charSequence, boolean z) {
        this.e.a(charSequence);
        this.e.a(z);
        e(3);
    }

    public final void a(CharSequence charSequence, int i) {
        this.e.a(charSequence);
        this.e.a(true);
        this.e.a(i);
        e(3);
    }

    public final void b(int i) {
        a(this.a.getResources().getText(i));
    }

    public final void a(CharSequence charSequence) {
        amqw.a(this.d);
        this.d.a(charSequence);
        e(4);
    }

    public void b() {
        e(2);
    }

    public final void c() {
        e(0);
    }

    private final void e(int i) {
        if (this.c != i) {
            int i2 = i == 2 ? 0 : 8;
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                getChildAt(i3).setVisibility(i2);
            }
            this.b.b(i);
            this.e.b(i);
            xox xox = this.d;
            if (xox != null) {
                xox.b(i);
            }
            this.c = i;
        }
    }
}
