package defpackage;

import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IAdOverlayService;

/* renamed from: mwr */
final /* synthetic */ class mwr implements Runnable {
    private final mwo a;
    private final IAdOverlayService b;

    mwr(mwo mwo, IAdOverlayService iAdOverlayService) {
        this.a = mwo;
        this.b = iAdOverlayService;
    }

    public final void run() {
        mwo mwo = this.a;
        mwo.b = new mxa(this.b);
        mwo.a.a = mwo.b;
    }
}
