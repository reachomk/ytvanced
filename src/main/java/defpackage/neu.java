package defpackage;

import android.view.SurfaceHolder;

/* renamed from: neu */
final /* synthetic */ class neu implements Runnable {
    private final nen a;
    private final int b;
    private final int c;

    neu(nen nen, int i, int i2) {
        this.a = nen;
        this.b = i;
        this.c = i2;
    }

    public final void run() {
        nen nen = this.a;
        int i = this.b;
        int i2 = this.c;
        SurfaceHolder surfaceHolder = nen.d;
        if (surfaceHolder != null) {
            surfaceHolder.setFixedSize(i, i2);
        }
    }
}
