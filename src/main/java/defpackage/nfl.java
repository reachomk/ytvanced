package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;

/* renamed from: nfl */
public final class nfl extends nar {
    public final aigp a;
    private final Handler b;

    public nfl(aigp aigp, Handler handler) {
        this.a = (aigp) amqw.a((Object) aigp, (Object) "target cannot be null");
        this.b = (Handler) amqw.a((Object) handler, (Object) "uiHandler cannot be null");
    }

    public final void a() {
        this.b.post(new nfo(this));
    }

    public final void b() {
        this.b.post(new nfn(this));
    }

    public final void c() {
        this.b.post(new nfq(this));
    }

    public final void a(Bitmap bitmap) {
        this.b.post(new nfp(this, bitmap));
    }
}
