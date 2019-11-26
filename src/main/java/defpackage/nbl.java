package defpackage;

import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IPlayerUiService;

/* renamed from: nbl */
final /* synthetic */ class nbl implements Runnable {
    private final nbi a;
    private final IPlayerUiService b;

    nbl(nbi nbi, IPlayerUiService iPlayerUiService) {
        this.a = nbi;
        this.b = iPlayerUiService;
    }

    public final void run() {
        nbi nbi = this.a;
        nbi.b = new nbm(this.b);
        nbi.a.a(nbi.b);
    }
}
