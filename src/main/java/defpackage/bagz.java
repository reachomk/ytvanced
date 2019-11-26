package defpackage;

import android.view.View;

/* renamed from: bagz */
public final class bagz implements Runnable {
    private final /* synthetic */ Runnable a;
    private final /* synthetic */ bagn b;

    public bagz(bagn bagn, Runnable runnable) {
        this.b = bagn;
        this.a = runnable;
    }

    public final void run() {
        boolean z = this.a != null;
        this.b.f.setVisibility(bagn.a(z));
        View view = this.b.e;
        if (view != null) {
            view.setVisibility(bagn.a(z));
        }
        bagh bagh = this.b.h;
        if (bagh != null) {
            bagh.a(this.a);
        }
    }
}
