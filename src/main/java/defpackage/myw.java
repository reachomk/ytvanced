package defpackage;

import android.graphics.Bitmap;

/* renamed from: myw */
final /* synthetic */ class myw implements Runnable {
    private final myv a;
    private final ngm b;
    private final Bitmap c;

    myw(myv myv, ngm ngm, Bitmap bitmap) {
        this.a = myv;
        this.b = ngm;
        this.c = bitmap;
    }

    public final void run() {
        this.a.b(this.b, this.c);
    }
}
