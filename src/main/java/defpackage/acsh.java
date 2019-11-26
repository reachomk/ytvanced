package defpackage;

import android.view.SurfaceHolder;

/* renamed from: acsh */
final class acsh implements Runnable {
    private final /* synthetic */ SurfaceHolder a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int c;
    private final /* synthetic */ acrz d;

    acsh(acrz acrz, SurfaceHolder surfaceHolder, int i, int i2) {
        this.d = acrz;
        this.a = surfaceHolder;
        this.b = i;
        this.c = i2;
    }

    public final void run() {
        abzs abzs = this.d.e;
        SurfaceHolder surfaceHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        synchronized (abzs.b) {
            abzs.d = i;
            abzs.e = i2;
            abzs.c = surfaceHolder;
        }
        abzs.a.a();
    }
}
