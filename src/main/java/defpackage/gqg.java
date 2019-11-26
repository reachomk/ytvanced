package defpackage;

/* renamed from: gqg */
final class gqg implements afsw, aipy {
    private final int a;
    private final int b;
    private final int c;
    private final String d;
    private final long e;
    private final xsc f;
    private final gqm g;
    private final gqf h;
    private final aipx i;
    private final apxu j;
    private boolean k;
    private aipw l;
    private gqg m;

    gqg(apxu apxu, int i, int i2, int i3, String str, long j, xsc xsc, gqm gqm, gqf gqf, aipx aipx) {
        boolean z = true;
        amqw.a(true);
        if (i2 < i3) {
            z = false;
        }
        amqw.a(z);
        this.j = apxu;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = j;
        this.f = xsc;
        this.g = gqm;
        this.h = gqf;
        this.i = aipx;
    }

    public final void a(aahr aahr, long j) {
    }

    public final void a(bqn bqn) {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void a() {
        this.k = true;
        aipw aipw = this.l;
        if (aipw != null) {
            aipw.a();
            this.l = null;
        }
        gqg gqg = this.m;
        if (gqg != null) {
            gqg.a();
            this.m = null;
        }
    }

    public final void d() {
        this.l = null;
    }

    public final void e() {
        this.l = null;
    }

    public final boolean f() {
        return this.k ^ 1;
    }

    public final void a(int i) {
        this.l = null;
    }
}
