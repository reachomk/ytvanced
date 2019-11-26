package defpackage;

/* renamed from: lgn */
final class lgn implements ajkz, ajlc {
    private final aozq a;
    private final /* synthetic */ lgi b;

    public lgn(lgi lgi, aozq aozq) {
        this.b = lgi;
        this.a = aozq;
    }

    private final boolean e() {
        aozq aozq = this.a;
        if ((aozq.a & 1) != 0) {
            return true;
        }
        if (aozq.c) {
            return this.b.b.a();
        }
        return aozq.d ? this.b.b.c() : false;
    }

    private final void f() {
        if (this.a.c && this.b.b.a()) {
            this.b.b.b();
        } else if (this.a.d && this.b.b.c()) {
            this.b.b.d();
        } else {
            aozq aozq = this.a;
            if ((aozq.a & 1) != 0) {
                aaas aaas = this.b.a;
                apxu apxu = aozq.b;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            }
        }
    }

    public final boolean a() {
        return e();
    }

    public final void b() {
        f();
    }

    public final boolean c() {
        return e();
    }

    public final void d() {
        f();
    }
}
