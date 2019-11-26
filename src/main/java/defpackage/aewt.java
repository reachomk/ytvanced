package defpackage;

import android.view.Surface;

/* renamed from: aewt */
final class aewt implements Runnable {
    private final /* synthetic */ Surface a;
    private final /* synthetic */ aewo b;

    aewt(aewo aewo, Surface surface) {
        this.b = aewo;
        this.a = surface;
    }

    public final void run() {
        this.b.b.a(this.a);
    }
}
