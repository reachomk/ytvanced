package defpackage;

import android.graphics.Bitmap;

/* renamed from: aida */
final /* synthetic */ class aida implements Runnable {
    private final aicw a;
    private final Bitmap b;

    aida(aicw aicw, Bitmap bitmap) {
        this.a = aicw;
        this.b = bitmap;
    }

    public final void run() {
        aicw aicw = this.a;
        aicw.a.a(this.b);
    }
}
