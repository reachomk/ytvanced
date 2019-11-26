package defpackage;

import android.view.Surface;

/* renamed from: nmw */
final class nmw implements Runnable {
    private final /* synthetic */ Surface a;
    private final /* synthetic */ nmu b;

    nmw(nmu nmu, Surface surface) {
        this.b = nmu;
        this.a = surface;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
