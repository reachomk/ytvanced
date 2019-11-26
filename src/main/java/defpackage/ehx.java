package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: ehx */
public abstract class ehx {
    public final xsc a;
    public long b;
    public Object c;
    public bqn d;
    public afsw e;
    private final int f = 60000;
    private final bcaa g;
    private aali h;
    private String i;

    protected ehx(bcaa bcaa, xsc xsc) {
        amqw.a(true);
        this.g = (bcaa) amqw.a((Object) bcaa);
        this.a = (xsc) amqw.a((Object) xsc);
    }

    /* Access modifiers changed, original: protected */
    public void a() {
    }

    public abstract void a(aanf aanf, aali aali, afsw afsw);

    /* Access modifiers changed, original: protected */
    public void b() {
    }

    public final void a(aali aali) {
        amqw.a((Object) aali);
        if (!(this.c == null || e())) {
            this.c = null;
            this.b = 0;
        }
        if (!b(aali)) {
            if (this.h != null) {
                d();
            }
            this.h = aali;
            this.i = aali.a();
            a((aanf) this.g.get(), this.h, new eia(this, aali));
        }
    }

    public final void a(aali aali, afsw afsw) {
        amqw.a((Object) afsw);
        if (!b(aali)) {
            a((aanf) this.g.get(), aali, afsw);
        } else if (this.c == null) {
            afsw afsw2 = this.e;
            if (!(afsw2 == null || afsw2 == afsw)) {
                afsw2.a(new bqn(new CancellationException()));
                this.e = null;
            }
            if (this.d != null) {
                this.e = afsw;
                d();
                return;
            }
            this.e = afsw;
        } else if (e()) {
            afsw.a(this.c);
            d();
        } else {
            a((aanf) this.g.get(), aali, afsw);
            d();
        }
    }

    @Deprecated
    public final boolean c() {
        return this.h != null;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b(aali aali) {
        amqw.a((Object) aali);
        return ((String) amqw.a(aali.a())).equals(this.i);
    }

    private final boolean e() {
        return this.b + ((long) this.f) >= this.a.b();
    }

    public final void d() {
        this.h = null;
        this.i = null;
        this.c = null;
        this.b = 0;
        afsw afsw = this.e;
        if (afsw != null) {
            bqn bqn = this.d;
            if (bqn == null) {
                bqn = new bqn(new CancellationException());
            }
            afsw.a(bqn);
        }
        this.d = null;
        this.e = null;
    }
}
