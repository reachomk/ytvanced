package defpackage;

/* renamed from: agnl */
public final class agnl {
    public final amqp a;
    public azpz b;
    public boolean c;
    public boolean d;
    public amul e;
    public amqp f;

    public agnl(azqr azqr) {
        amqp b;
        amqp b2;
        boolean z = true;
        if ((azqr.a & 1) == 0) {
            z = false;
        }
        amqw.b(z);
        azpz azpz = azqr.b;
        if (azpz == null) {
            azpz = azpz.g;
        }
        this.b = azpz;
        this.c = azqr.d;
        this.d = azqr.e;
        this.e = amul.a(azqr.f);
        if ((azqr.a & 16) != 0) {
            b = amqp.b(azqr.g);
        } else {
            b = ampo.a;
        }
        this.f = b;
        if ((azqr.a & 2) != 0) {
            Object obj = azqr.c;
            if (obj == null) {
                obj = azlk.f;
            }
            b2 = amqp.b(obj);
        } else {
            b2 = ampo.a;
        }
        this.a = b2;
    }

    public final azqr a() {
        azqq azqq = (azqq) azqr.h.createBuilder();
        azqq.a(this.b);
        azqq.a(this.c);
        azqq.b(this.d);
        amul amul = this.e;
        azqq.copyOnWrite();
        azqr azqr = (azqr) azqq.instance;
        if (!azqr.f.a()) {
            azqr.f = anxl.mutableCopy(azqr.f);
        }
        anvf.addAll(amul, azqr.f);
        if (this.a.a()) {
            azqq.a((azlk) this.a.b());
        }
        if (this.f.a()) {
            azqq.a((anvu) this.f.b());
        }
        return (azqr) ((anxl) azqq.build());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agnl)) {
            return false;
        }
        return a().equals(((agnl) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
