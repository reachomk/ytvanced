package defpackage;

/* renamed from: bbpf */
public abstract class bbpf implements bbmo, bboz {
    public final bbmo a;
    public bboz b;
    public boolean c;
    public int d;
    private bbnc e;

    public bbpf(bbmo bbmo) {
        this.a = bbmo;
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.e, bbnc)) {
            this.e = bbnc;
            if (bbnc instanceof bboz) {
                this.b = (bboz) bbnc;
            }
            this.a.a((bbnc) this);
        }
    }

    public final void a(Throwable th) {
        if (this.c) {
            bbzf.a(th);
            return;
        }
        this.c = true;
        this.a.a(th);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(Throwable th) {
        bbnm.a(th);
        this.e.bK_();
        a(th);
    }

    public final void a() {
        if (!this.c) {
            this.c = true;
            this.a.a();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final int b(int i) {
        bboz bboz = this.b;
        if (bboz == null || (i & 4) != 0) {
            return 0;
        }
        i = bboz.a(i);
        if (i != 0) {
            this.d = i;
        }
        return i;
    }

    public final void bK_() {
        this.e.bK_();
    }

    public final boolean c() {
        return this.e.c();
    }

    public final boolean b() {
        return this.b.b();
    }

    public final void e() {
        this.b.e();
    }

    public final boolean a(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
