package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IPlayerUiService;

/* renamed from: nbi */
public final class nbi extends naa {
    public final aiug a;
    public nbm b;
    private final Handler c;

    public nbi(aiug aiug, Handler handler) {
        this.a = (aiug) amqw.a((Object) aiug, (Object) "target cannot be null");
        this.c = (Handler) amqw.a((Object) handler, (Object) "uiHandler cannot be null");
    }

    public final void a() {
        nbm nbm = this.b;
        if (nbm != null) {
            nbm.a = null;
            this.b = null;
        }
    }

    public final void a(IPlayerUiService iPlayerUiService) {
        this.c.post(new nbl(this, iPlayerUiService));
    }

    public final void a(boolean z) {
        this.c.post(new nbk(this, z));
    }
}
