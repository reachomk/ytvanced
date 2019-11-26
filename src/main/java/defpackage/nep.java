package defpackage;

import android.view.SurfaceHolder;

/* renamed from: nep */
final /* synthetic */ class nep implements Runnable {
    private final nen a;
    private final boolean b;

    nep(nen nen, boolean z) {
        this.a = nen;
        this.b = z;
    }

    public final void run() {
        nen nen = this.a;
        boolean z = this.b;
        SurfaceHolder surfaceHolder = nen.d;
        if (surfaceHolder != null) {
            surfaceHolder.setKeepScreenOn(z);
        }
    }
}
