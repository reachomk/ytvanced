package defpackage;

import android.graphics.Bitmap;

/* renamed from: aktn */
final class aktn implements Runnable {
    private final /* synthetic */ Bitmap a;
    private final /* synthetic */ aktk b;

    aktn(aktk aktk, Bitmap bitmap) {
        this.b = aktk;
        this.a = bitmap;
    }

    public final void run() {
        aktk aktk = this.b;
        aktk.a.a(aktk.b, this.a);
    }
}
