package defpackage;

/* renamed from: ifz */
final class ifz implements aiha {
    public boolean a = false;
    private final /* synthetic */ ifl b;

    public final void a(int i, long j) {
        aigy.a(this.b.n.c, j);
        ifl ifl = this.b;
        aimt aimt = ifl.n.d;
        emo emo;
        ifl ifl2;
        if (i == 1) {
            ifl.l.a(true);
            this.b.b.c(true);
            this.b.e();
            this.b.t();
            if (aimt.a()) {
                emo = this.b.n;
                this.a = true;
                aimt.a(i, j);
                this.b.g.e();
                return;
            }
            this.b.g.e();
        } else if (i != 2) {
            ifl.b.c(false);
            this.b.l.a(false);
            this.b.n.g();
            this.b.t();
            this.b.o();
            if (aimt.a() && this.a) {
                this.a = false;
                aimt.a(i, j);
                this.b.n.a();
                ifl2 = this.b;
                emo = ifl2.n;
                ifl2.g.b(j);
                return;
            }
            this.b.n.a();
            this.b.g.b(j);
        } else {
            ifl.e();
            this.b.t();
            this.b.n.g();
            if (aimt.a() && this.a) {
                aimt.a(i, j);
                emo emo2 = this.b.n;
                aimt.a(true);
                ifl2 = this.b;
                emo = ifl2.n;
                ifl2.g.a(j);
                return;
            }
            this.b.g.a(j);
        }
    }

    /* synthetic */ ifz(ifl ifl) {
        this.b = ifl;
    }
}
