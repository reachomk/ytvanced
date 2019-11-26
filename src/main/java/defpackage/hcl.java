package defpackage;

import android.os.Handler;

/* renamed from: hcl */
public final class hcl implements adoi {
    private final ewm a;
    private final adiw b;
    private final ewi c;
    private final Handler d;
    private final adop e;
    private final adow f;

    public hcl(adow adow, ewm ewm, adiw adiw, ewi ewi, Handler handler, adop adop) {
        this.f = adow;
        this.a = (ewm) amqw.a((Object) ewm);
        this.b = adiw;
        this.c = (ewi) amqw.a((Object) ewi);
        this.d = (Handler) amqw.a((Object) handler);
        this.e = (adop) amqw.a((Object) adop);
    }

    public final adow a() {
        return this.f;
    }

    public final adiw b() {
        return this.b;
    }

    public final boolean c() {
        return this.a.b();
    }

    public final void a(Runnable runnable) {
        xak.a();
        this.e.a(this.f.h);
        if (this.f.g) {
            runnable.run();
            return;
        }
        this.c.a(this.a);
        this.d.postDelayed(runnable, 10000);
    }

    public final void d() {
        if (!this.f.g) {
            this.a.d();
        }
    }
}
