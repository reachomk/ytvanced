package defpackage;

import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IControlsOverlayService;

/* renamed from: mxm */
final /* synthetic */ class mxm implements Runnable {
    private final mxn a;
    private final IControlsOverlayService b;

    mxm(mxn mxn, IControlsOverlayService iControlsOverlayService) {
        this.a = mxn;
        this.b = iControlsOverlayService;
    }

    public final void run() {
        mxn mxn = this.a;
        mxn.f = new myp(this.b);
        mxn.a.a(mxn.f);
        mxn.b.a(mxn.f);
        mxn.c.a(mxn.f);
        mxn.d.a(mxn.f);
        mxn.e.a(mxn.f);
    }
}
