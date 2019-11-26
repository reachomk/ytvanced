package defpackage;

import android.os.Handler;

/* renamed from: nbd */
public final class nbd extends mzz {
    public final aiif a;
    private final Handler b;

    public nbd(aiif aiif, Handler handler) {
        this.a = (aiif) amqw.a((Object) aiif, (Object) "target cannot be null");
        this.b = (Handler) amqw.a((Object) handler, (Object) "uiHandler cannot be null");
    }

    public final void a() {
        this.b.post(new nbc(this));
    }

    public final void a(boolean z) {
        this.b.post(new nbf(this, z));
    }

    public final void a(CharSequence charSequence) {
        this.b.post(new nbe(this, charSequence));
    }

    public final void a(long j) {
        this.b.post(new nbh(this, j));
    }

    public final void b(boolean z) {
        this.b.post(new nbg(this, z));
    }

    public final void c(boolean z) {
        this.b.post(new nbj(this, z));
    }
}
