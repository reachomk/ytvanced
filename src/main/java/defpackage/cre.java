package defpackage;

import android.os.Looper;

/* renamed from: cre */
final class cre implements Runnable {
    private final /* synthetic */ coz[] a;
    private final /* synthetic */ int b;
    private final /* synthetic */ coz c;
    private final /* synthetic */ cma d;

    cre(coz[] cozArr, int i, coz coz, cma cma) {
        this.a = cozArr;
        this.b = i;
        this.c = coz;
        this.d = cma;
    }

    public final void run() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.a[this.b] = crf.a(this.c.b, this.d);
    }
}
