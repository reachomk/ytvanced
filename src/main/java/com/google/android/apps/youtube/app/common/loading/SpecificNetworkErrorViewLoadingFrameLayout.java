package com.google.android.apps.youtube.app.common.loading;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import defpackage.amqw;
import defpackage.eij;
import defpackage.eik;
import defpackage.eil;
import defpackage.ein;
import defpackage.eio;
import defpackage.eiq;
import defpackage.eir;
import defpackage.xak;
import defpackage.xfc;
import defpackage.xhv;
import defpackage.xse;
import defpackage.xsg;

public class SpecificNetworkErrorViewLoadingFrameLayout extends FrameLayout {
    public final Context a;
    public eiq b;
    public ein c;
    public FrameLayout d;
    public eij e;
    public int f;
    public eil g;
    public xhv h;
    private eiq i;

    public SpecificNetworkErrorViewLoadingFrameLayout(Context context) {
        this(context, R.layout.loading_frame_status_error_view, R.layout.loading_frame_status_progress_view, R.layout.loading_frame_status_empty_view);
    }

    public SpecificNetworkErrorViewLoadingFrameLayout(Context context, int i, int i2, int i3) {
        this(context, i, i2);
        c(i3);
    }

    public SpecificNetworkErrorViewLoadingFrameLayout(Context context, int i, int i2) {
        super(context);
        this.f = 0;
        this.a = (Context) amqw.a((Object) context);
        a(context);
        b(i2);
        d(i);
        a();
    }

    public SpecificNetworkErrorViewLoadingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpecificNetworkErrorViewLoadingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = 0;
        this.a = (Context) amqw.a((Object) context);
        a(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eik.a, i, 0);
        b(obtainStyledAttributes.getResourceId(eik.d, R.layout.loading_frame_status_progress_view));
        c(obtainStyledAttributes.getResourceId(eik.b, R.layout.loading_frame_status_empty_view));
        d(obtainStyledAttributes.getResourceId(eik.c, R.layout.loading_frame_status_error_view));
        a();
        obtainStyledAttributes.recycle();
        b();
    }

    private final void a(Context context) {
        Object b = xsg.b(context);
        if (b instanceof xfc) {
            ((eio) xse.a(b)).a(this);
        }
    }

    private final void b(int i) {
        this.i = new eiq(this, 1, i, 0);
    }

    private final void c(int i) {
        this.b = new eiq(this, 4, i, R.id.empty_message_text);
    }

    private final void d(int i) {
        this.c = new ein(this, i);
    }

    public final void a() {
        this.d = (FrameLayout) LayoutInflater.from(getContext()).inflate(R.layout.loading_frame_offline_status_view, this, false);
        addView(this.d);
        this.e = this.g.a(this.d);
    }

    public final void a(eir eir) {
        this.c.a = eir;
        eij eij = this.e;
        if (eij != null) {
            eij.a(eir);
        }
    }

    public final void b() {
        xak.a();
        if (this.h.c()) {
            a(1);
        } else {
            a(6);
        }
    }

    public final void c() {
        a(2);
    }

    public final void d() {
        a(5);
    }

    public final void a(int i) {
        if (this.f != i) {
            int i2 = i == 2 ? 0 : 8;
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                getChildAt(i3).setVisibility(i2);
            }
            this.i.b(i);
            this.c.b(i);
            if (i == 5) {
                this.e.a();
                this.d.setVisibility(0);
            } else if (i != 6) {
                this.d.setVisibility(8);
            } else {
                this.e.b();
                this.d.setVisibility(0);
            }
            eiq eiq = this.b;
            if (eiq != null) {
                eiq.b(i);
            }
            this.f = i;
        }
    }
}
