package defpackage;

/* renamed from: jug */
public final class jug extends ffv implements ajan, jvi, t, xcp {
    private final aizy c;
    private final elh d;
    private final lwc e;
    private final zyw f;
    private final xci g;
    private final ajam h;
    private final bdfu i = new bdfu();
    private final ekn j;

    public jug(aizy aizy, elh elh, lwc lwc, xci xci, ajam ajam, zyw zyw, ekn ekn) {
        this.c = aizy;
        this.d = elh;
        this.e = lwc;
        this.g = xci;
        this.h = ajam;
        this.f = zyw;
        this.j = ekn;
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
        if (foh.x(this.f)) {
            this.i.a(a(this.h));
        } else {
            this.g.a((Object) this);
        }
    }

    public final void C_() {
        if (foh.x(this.f)) {
            this.i.a();
        } else {
            this.g.b(this);
        }
    }

    public final String g() {
        return this.c.k();
    }

    public final boolean h() {
        return this.c.c();
    }

    public final ajmq i() {
        return this.c.q();
    }

    public final void a(eiy eiy) {
        this.g.c(new efs());
        ((elf) this.d.get()).a(eiy, this.e.c(), false);
    }

    public final void j() {
        this.c.a();
    }

    public final void k() {
        this.c.b();
    }

    public final void a(aiqq aiqq) {
        ((elf) this.d.get()).a(aiqq);
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0018 A:{RETURN, PHI: r3 } */
    public final boolean a(defpackage.fob r3, int r4) {
        /*
        r2 = this;
        r3 = 0;
        r0 = 1;
        if (r4 != 0) goto L_0x000c;
    L_0x0004:
        r4 = r2.l();
        if (r4 == 0) goto L_0x000b;
    L_0x000a:
        goto L_0x0018;
    L_0x000b:
        return r0;
    L_0x000c:
        r1 = 3;
        if (r4 != r1) goto L_0x0017;
    L_0x000f:
        r4 = r2.l();
        if (r4 != 0) goto L_0x0016;
    L_0x0015:
        goto L_0x0018;
    L_0x0016:
        return r0;
    L_0x0017:
        r3 = 1;
    L_0x0018:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jug.a(fob, int):boolean");
    }

    public final void a(ahkn ahkn) {
        if (this.a != null) {
            if (!(this.b == 3 && ahkn.a.a(airi.PLAYBACK_LOADED))) {
                if (this.b == 0) {
                    if (!ahkn.a.a(airi.NEW, airi.ENDED, airi.INTERSTITIAL_REQUESTED)) {
                        return;
                    }
                }
                return;
            }
            f();
        }
    }

    public final void a(ahkf ahkf) {
        if (this.a != null && ahkf.e == 3) {
            f();
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.f().a(emg.a(this.f, 1073741824, 1)).a(new juj(this), jui.a), ajam.t().f().a(emg.a(this.f, 1073741824, 1)).a(new jul(this), juk.a)};
    }

    private final boolean l() {
        return this.j.c == eko.WATCH_WHILE && this.c.r();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkf.class, ahkn.class};
        } else if (i == 0) {
            a((ahkf) obj);
            return null;
        } else if (i == 1) {
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
