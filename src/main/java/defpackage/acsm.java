package defpackage;

import android.graphics.Bitmap;

/* renamed from: acsm */
final class acsm implements Runnable {
    private final /* synthetic */ Bitmap a;
    private final /* synthetic */ acsj b;

    acsm(acsj acsj, Bitmap bitmap) {
        this.b = acsj;
        this.a = bitmap;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
