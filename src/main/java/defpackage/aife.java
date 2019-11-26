package defpackage;

/* renamed from: aife */
public class aife implements aiff, ajan, xcp {
    private final aizy a;
    private final aifc b;
    private boolean c;
    private boolean d;
    private ajlc e;
    private ajkz f;

    public aife(aizy aizy, aifc aifc) {
        this.a = (aizy) amqw.a((Object) aizy);
        this.b = (aifc) amqw.a((Object) aifc);
        aifc.a(this);
    }

    public Class[] a(Class cls, Object obj, int i) {
        return aifa.a(this, obj, i);
    }

    public final long e() {
        return 262144;
    }

    public final void a(ajlc ajlc) {
        this.e = ajlc;
        d();
    }

    public final void a(ajkz ajkz) {
        this.f = ajkz;
        f();
    }

    public void a() {
        ajlc ajlc = this.e;
        if (ajlc != null) {
            ajlc.b();
        } else if (this.a.a(aizl.b)) {
            this.a.b(aizl.b);
        } else {
            this.a.a(0);
        }
    }

    public void b() {
        ajkz ajkz = this.f;
        if (ajkz != null) {
            ajkz.d();
        } else {
            this.a.b(aizl.a);
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.p().a(ajcg.b(ajam.O(), 262144)).a(ajcg.a(ajam.O(), 262144, 1)).a(new aifh(this), aifg.a)};
    }

    public final void c() {
        if (this.e == null) {
            d();
        }
        if (this.f == null) {
            f();
        }
    }

    private final void d() {
        boolean a;
        ajlc ajlc = this.e;
        if (ajlc != null) {
            a = ajlc.a();
        } else {
            a = this.a.a(aizl.b);
        }
        if (this.c != a) {
            this.c = a;
            this.b.b_(a);
        }
    }

    private final void f() {
        boolean c;
        ajkz ajkz = this.f;
        if (ajkz != null) {
            c = ajkz.c();
        } else {
            c = this.a.a(aizl.a);
        }
        if (this.d != c) {
            this.d = c;
            this.b.b(c);
        }
    }
}
