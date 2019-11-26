package defpackage;

import android.view.View;

/* renamed from: baha */
public final class baha implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ bagn b;

    public baha(bagn bagn, boolean z) {
        this.b = bagn;
        this.a = z;
    }

    public final void run() {
        this.b.d.setVisibility(bagn.a(this.a));
        View view = this.b.c;
        if (view != null) {
            view.setVisibility(bagn.a(this.a));
        }
    }
}
