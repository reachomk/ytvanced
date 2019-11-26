package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ixg */
public final class ixg implements t, xcp {
    private String a;
    private String b;
    private long c = -1;
    private final xsc d;
    private final xci e;
    private final ajam f;
    private final zyw g;
    private final bdfu h;

    public ixg(xsc xsc, xci xci, ajam ajam, zyw zyw) {
        this.d = xsc;
        this.e = xci;
        this.f = ajam;
        this.g = zyw;
        this.h = new bdfu();
    }

    public final void a(af afVar) {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void B_() {
        if (foh.x(this.g)) {
            this.h.a();
            this.h.a(this.f.Q().a.f().a(emg.a(this.g, 2097152)).a(new ixj(this), ixi.a));
            return;
        }
        this.e.a((Object) this);
    }

    public final void C_() {
        if (foh.x(this.g)) {
            this.h.a();
        } else {
            this.e.b(this);
        }
    }

    public final void a(ahkn ahkn) {
        airi airi = ahkn.a;
        aakj aakj = ahkn.b;
        if (airi.a(airi.PLAYBACK_LOADED) && aakj != null) {
            a(aakj.b());
            return;
        }
        if (airi.a(airi.NEW, airi.ENDED)) {
            i();
        }
    }

    private final synchronized void i() {
        if (this.b != null) {
            this.b = null;
            this.c = this.d.a();
        }
    }

    private final synchronized void a(String str) {
        if (!amqq.a(this.b, str)) {
            this.b = str;
            this.a = this.b;
            this.c = -1;
        }
    }

    public final synchronized String f() {
        return this.b;
    }

    public final synchronized String g() {
        return this.a;
    }

    public final synchronized long h() {
        if (this.c == -1) {
            return 0;
        }
        return TimeUnit.MILLISECONDS.toSeconds(this.d.a() - this.c);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class};
        } else if (i == 0) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
