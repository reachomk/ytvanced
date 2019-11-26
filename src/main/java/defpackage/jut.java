package defpackage;

import android.os.Handler;

/* renamed from: jut */
public final class jut extends ffv implements fgd, fgs {
    public final zyw c;
    public final fhk d;
    public final jtw e;
    public ffx f;
    private final fga g;
    private final fgc h;
    private final Handler i;

    public jut(zyw zyw, fga fga, fgc fgc, fhk fhk, jtw jtw, Handler handler) {
        this.c = zyw;
        this.g = fga;
        this.h = fgc;
        this.d = fhk;
        this.e = jtw;
        this.i = handler;
    }

    public final void a(boolean z) {
        this.h.f();
        if (z && this.f != null) {
            this.i.post(new jus(this));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(fob fob, int i) {
        if (i == 2 && !this.g.c()) {
            this.h.f();
        }
        return true;
    }
}
