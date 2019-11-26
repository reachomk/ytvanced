package defpackage;

import android.text.TextUtils;

/* renamed from: lhx */
public final class lhx implements ahkx, ahli, lra, lrm, xcp {
    private static final lid a = new lid(2, 1.777f);
    private static final lid b = new lid(2, 2.4f);
    private final lij c;
    private final ahku d;
    private final ahkw e;
    private final lix f;
    private final lix g;
    private final ajam h;
    private final xci i;
    private final zyw j;
    private final bdfu k = new bdfu();
    private final lrh l;
    private int m = 0;
    private String n;

    public lhx(ahku ahku, ahkw ahkw, xci xci, ajam ajam, zyw zyw, lij lij, lrh lrh) {
        lid lid = a;
        lid lid2 = b;
        this.c = lij;
        this.d = ahku;
        this.e = ahkw;
        this.f = lid;
        this.g = lid2;
        this.h = ajam;
        this.i = xci;
        this.j = zyw;
        this.l = lrh;
    }

    public final void b(boolean z) {
    }

    public final void a(int i, int i2) {
        if (i2 == 3) {
            if (foh.x(this.j)) {
                this.k.a(this.h.Q().a.f().a(emg.a(this.j, 268435456, 1)).a(new lhw(this), lhz.a));
            } else {
                this.i.a((Object) this);
            }
            this.d.a(this);
            this.e.a((ahli) this);
            b();
            return;
        }
        if (foh.x(this.j)) {
            this.k.a();
        } else {
            this.i.b(this);
        }
        this.d.b(this);
        this.e.b.a.remove(this);
    }

    public final void a(lqz lqz, lqz lqz2) {
        this.c.a(2);
        this.m = lqz2 == null ? 0 : 1;
        this.n = null;
        b();
    }

    public final void a(boolean z) {
        if (z) {
            if (this.m != 2) {
                this.c.a(this.f);
            }
            this.m = 2;
        }
    }

    public final void as_() {
        c();
    }

    public final void a(ahkn ahkn) {
        airi airi = ahkn.a;
        if (airi.d()) {
            if (this.m != 1) {
                this.c.a(2);
                this.c.a(0, false);
            }
            this.m = 1;
            this.n = ahkn.e;
            return;
        }
        if (airi == airi.ENDED && this.m != 2 && TextUtils.equals(this.n, ahkn.e)) {
            c();
        }
    }

    private final void b() {
        lqz lqz = this.l.a;
        if (lqz != null && lqz.a.g()) {
            c();
        }
    }

    private final void c() {
        if (this.m != 3) {
            this.c.a(this.g);
            this.m = 3;
        }
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
