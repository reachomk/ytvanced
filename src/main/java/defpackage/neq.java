package defpackage;

import android.view.SurfaceView;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurfaceHolderService;

/* renamed from: neq */
final /* synthetic */ class neq implements Runnable {
    private final nen a;
    private final ISurfaceHolderService b;

    neq(nen nen, ISurfaceHolderService iSurfaceHolderService) {
        this.a = nen;
        this.b = iSurfaceHolderService;
    }

    public final void run() {
        nen nen = this.a;
        nen.c = new ney(this.b, nen.a);
        SurfaceView surfaceView = new SurfaceView(nen.b);
        nen.d = surfaceView.getHolder();
        nen.d.addCallback(nen.c);
        nen.a.a(surfaceView);
    }
}
