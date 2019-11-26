package defpackage;

/* renamed from: bbwb */
final class bbwb implements bbmo, bbnc {
    private final bbmo a;
    private final bbny b;
    private bbnc c;
    private boolean d;

    bbwb(bbmo bbmo, bbny bbny) {
        this.a = bbmo;
        this.b = bbny;
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.c, bbnc)) {
            this.c = bbnc;
            this.a.a((bbnc) this);
        }
    }

    public final void bK_() {
        this.c.bK_();
    }

    public final boolean c() {
        return this.c.c();
    }

    public final void b_(Object obj) {
        if (!this.d) {
            try {
                if (this.b.a(obj)) {
                    this.a.b_(obj);
                    return;
                }
                this.d = true;
                this.c.bK_();
                this.a.a();
            } catch (Throwable th) {
                bbnm.a(th);
                this.c.bK_();
                a(th);
            }
        }
    }

    public final void a(Throwable th) {
        if (this.d) {
            bbzf.a(th);
            return;
        }
        this.d = true;
        this.a.a(th);
    }

    public final void a() {
        if (!this.d) {
            this.d = true;
            this.a.a();
        }
    }
}
