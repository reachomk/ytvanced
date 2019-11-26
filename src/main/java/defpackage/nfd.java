package defpackage;

import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurveyOverlayService;

/* renamed from: nfd */
final class nfd implements Runnable {
    private final /* synthetic */ ISurveyOverlayService a;
    private final /* synthetic */ nfe b;

    nfd(nfe nfe, ISurveyOverlayService iSurveyOverlayService) {
        this.b = nfe;
        this.a = iSurveyOverlayService;
    }

    public final void run() {
        this.b.b = new nfm(this.a);
        nfe nfe = this.b;
        nfe.a.a(nfe.b);
    }
}
