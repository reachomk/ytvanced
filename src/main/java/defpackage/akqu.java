package defpackage;

/* renamed from: akqu */
final class akqu {
    private final aqj a;
    private final aqj b;
    private final akrf c;
    private final akqs d;
    private boolean e = false;
    private boolean f = false;
    private final /* synthetic */ akqf g;

    public final void a(aqj aqj) {
        aqj aqj2 = this.a;
        if (aqj != aqj2) {
            aqj2 = this.b;
            if (aqj == aqj2 && !this.f) {
                this.f = true;
                this.d.c.remove(aqj2);
                this.g.f(this.b);
                a();
            }
        } else if (!this.e) {
            this.e = true;
            this.d.c.remove(aqj2);
            this.g.f(this.a);
            a();
        }
    }

    private final void a() {
        if (this.e && this.f) {
            this.d.a.remove(this.c);
            this.d.b.remove(this.c);
            this.g.c();
        }
    }

    /* synthetic */ akqu(akqf akqf, aqj aqj, aqj aqj2, akrf akrf, akqs akqs) {
        this.g = akqf;
        this.a = aqj;
        this.b = aqj2;
        this.c = akrf;
        this.d = akqs;
    }
}
