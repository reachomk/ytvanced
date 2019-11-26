package defpackage;

import android.view.SurfaceHolder;

/* renamed from: new */
final /* synthetic */ class new implements Runnable {
    private final nen a;

    new(nen nen) {
        this.a = nen;
    }

    public final void run() {
        SurfaceHolder surfaceHolder = this.a.d;
        if (surfaceHolder != null) {
            surfaceHolder.setSizeFromLayout();
        }
    }
}
