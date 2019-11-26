package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurveyOverlayService;
import java.util.List;

/* renamed from: nfe */
public final class nfe extends nam {
    public final vws a;
    public nfm b;
    private final Handler c;

    public nfe(vws vws, Handler handler) {
        this.a = (vws) amqw.a((Object) vws, (Object) "target cannot be null");
        this.c = (Handler) amqw.a((Object) handler, (Object) "uiHandler cannot be null");
    }

    public final void d() {
        nfm nfm = this.b;
        if (nfm != null) {
            nfm.a = null;
            this.b = null;
        }
    }

    public final void a(ISurveyOverlayService iSurveyOverlayService) {
        this.c.post(new nfd(this, iSurveyOverlayService));
    }

    public final void a() {
        this.c.post(new nfg(this));
    }

    public final void a(boolean z) {
        this.c.post(new nff(this, z));
    }

    public final void a(String str, List list, boolean z) {
        this.c.post(new nfi(this, str, list, z));
    }

    public final void b() {
        this.c.post(new nfh(this));
    }

    public final void a(int i) {
        this.c.post(new nfk(this, i));
    }

    public final void c() {
        this.c.post(new nfj(this));
    }
}
