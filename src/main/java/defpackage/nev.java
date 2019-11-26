package defpackage;

import android.view.SurfaceHolder;

/* renamed from: nev */
final /* synthetic */ class nev implements Runnable {
    private final nen a;
    private final int b;

    nev(nen nen, int i) {
        this.a = nen;
        this.b = i;
    }

    public final void run() {
        nen nen = this.a;
        int i = this.b;
        SurfaceHolder surfaceHolder = nen.d;
        if (surfaceHolder != null) {
            surfaceHolder.setType(i);
        }
    }
}
