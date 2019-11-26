package defpackage;

/* renamed from: bbyk */
public abstract class bbyk implements bboy, bbpb {
    public final bboy a;
    public bbpb b;
    public boolean c;
    public int d;
    private bctr e;

    public bbyk(bboy bboy) {
        this.a = bboy;
    }

    public final void a(bctr bctr) {
        if (bbyq.a(this.e, bctr)) {
            this.e = bctr;
            if (bctr instanceof bbpb) {
                this.b = (bbpb) bctr;
            }
            this.a.a(this);
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
        this.e.d();
        a(th);
    }

    public final void a() {
        if (!this.c) {
            this.c = true;
            this.a.a();
        }
    }

    public final void b(long j) {
        this.e.b(j);
    }

    public final void d() {
        this.e.d();
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
