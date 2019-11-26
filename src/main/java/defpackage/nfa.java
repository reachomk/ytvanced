package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurfaceTextureService;

/* renamed from: nfa */
public final class nfa extends nal {
    public final nfb a;
    public final Context b;
    public nfc c;
    private final Handler d;

    public nfa(nfb nfb, Context context, Handler handler) {
        this.a = (nfb) amqw.a((Object) nfb, (Object) "listener cannot be null");
        this.b = (Context) amqw.a((Object) context, (Object) "context cannot be null");
        this.d = (Handler) amqw.a((Object) handler, (Object) "uiHandler cannot be null");
    }

    public final void a(ISurfaceTextureService iSurfaceTextureService) {
        this.d.post(new nez(this, iSurfaceTextureService));
    }
}
