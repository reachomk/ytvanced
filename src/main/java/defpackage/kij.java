package defpackage;

import android.graphics.Bitmap;

/* renamed from: kij */
final /* synthetic */ class kij implements Runnable {
    private final kig a;
    private final Bitmap b;

    kij(kig kig, Bitmap bitmap) {
        this.a = kig;
        this.b = bitmap;
    }

    public final void run() {
        kig kig = this.a;
        kig.a.b.setImageBitmap(this.b);
        kig.a.b.invalidate();
    }
}
