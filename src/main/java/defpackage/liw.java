package defpackage;

/* renamed from: liw */
public final class liw implements ajan, lim, t, xcp {
    private final bcaa a;
    private final ahys b;
    private final aibb c;
    private final xci d;
    private final ajam e;
    private final zyw f;
    private final bdfu g = new bdfu();
    private volatile boolean h;

    public liw(bcaa bcaa, ahys ahys, aibb aibb, xci xci, ajam ajam, zyw zyw) {
        this.a = bcaa;
        this.b = ahys;
        this.c = aibb;
        this.d = xci;
        this.e = ajam;
        this.f = zyw;
    }

    public final void a(af afVar) {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final long e() {
        return 1;
    }

    public final void B_() {
        ((lij) this.a.get()).a((lim) this);
        if (foh.x(this.f)) {
            this.g.a();
            this.g.a(a(this.e));
            return;
        }
        this.d.a((Object) this);
    }

    public final void C_() {
        ((lij) this.a.get()).b(this);
        if (foh.x(this.f)) {
            this.g.a();
        } else {
            this.d.b(this);
        }
    }

    public final void a(boolean z) {
        ahys ahys = this.b;
        ahys.l = z;
        if (ahys.j) {
            ahys.j();
        }
        if (z && !this.h) {
            this.c.f();
        }
    }

    public final void a(ahkn ahkn) {
        airi airi = ahkn.a;
        if (airi != null) {
            this.h = airi == airi.ENDED;
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.f().a(emg.a(this.f, 8192)).a(new liv(this), liy.a)};
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
