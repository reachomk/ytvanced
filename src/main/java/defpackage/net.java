package defpackage;

import android.view.SurfaceHolder;

/* renamed from: net */
final /* synthetic */ class net implements Runnable {
    private final nen a;
    private final int b;

    net(nen nen, int i) {
        this.a = nen;
        this.b = i;
    }

    public final void run() {
        nen nen = this.a;
        int i = this.b;
        SurfaceHolder surfaceHolder = nen.d;
        if (surfaceHolder != null) {
            surfaceHolder.setFormat(i);
        }
    }
}
