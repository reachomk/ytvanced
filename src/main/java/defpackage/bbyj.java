package defpackage;

/* renamed from: bbyj */
public abstract class bbyj implements bbmb, bbpb {
    public final bcto a;
    public bctr b;
    public bbpb c;
    public boolean d;
    public int e;

    public bbyj(bcto bcto) {
        this.a = bcto;
    }

    public final void a(bctr bctr) {
        if (bbyq.a(this.b, bctr)) {
            this.b = bctr;
            if (bctr instanceof bbpb) {
                this.c = (bbpb) bctr;
            }
            this.a.a((bctr) this);
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

    public final void b(long j) {
        this.b.b(j);
    }

    public final void d() {
        this.b.d();
    }

    public final boolean b() {
        return this.c.b();
    }

    public final void e() {
        this.c.e();
    }

    public final boolean a(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
