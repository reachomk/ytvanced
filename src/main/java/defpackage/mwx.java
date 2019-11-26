package defpackage;

import android.graphics.Bitmap;

/* renamed from: mwx */
final /* synthetic */ class mwx implements Runnable {
    private final mwo a;
    private final Bitmap b;

    mwx(mwo mwo, Bitmap bitmap) {
        this.a = mwo;
        this.b = bitmap;
    }

    public final void run() {
        mwo mwo = this.a;
        mwo.a.a(this.b);
    }
}
