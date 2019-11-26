package defpackage;

import android.graphics.Bitmap;

/* renamed from: nbb */
final class nbb implements Runnable {
    private final /* synthetic */ Bitmap a;
    private final /* synthetic */ nau b;

    nbb(nau nau, Bitmap bitmap) {
        this.b = nau;
        this.a = bitmap;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
