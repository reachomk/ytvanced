package defpackage;

import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ILiveOverlayService;

/* renamed from: naz */
final /* synthetic */ class naz implements Runnable {
    private final nau a;
    private final ILiveOverlayService b;

    naz(nau nau, ILiveOverlayService iLiveOverlayService) {
        this.a = nau;
        this.b = iLiveOverlayService;
    }

    public final void run() {
        nau nau = this.a;
        nau.b = new nba(this.b);
        nau.a.a(nau.b);
    }
}
