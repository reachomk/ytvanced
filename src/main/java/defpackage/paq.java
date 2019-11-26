package defpackage;

import android.view.Surface;

/* renamed from: paq */
final /* synthetic */ class paq implements Runnable {
    private final pak a;
    private final Surface b;

    paq(pak pak, Surface surface) {
        this.a = pak;
        this.b = surface;
    }

    public final void run() {
        pak pak = this.a;
        pak.a.a(this.b);
    }
}
