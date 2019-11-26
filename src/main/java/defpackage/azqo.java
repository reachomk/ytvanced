package defpackage;

/* renamed from: azqo */
public final class azqo extends anxo implements anzf {
    private azqo() {
        super(azqp.h);
    }

    public final azqo a(azqf azqf) {
        copyOnWrite();
        azqp azqp = (azqp) this.instance;
        if (azqf != null) {
            azqp.b = azqf;
            azqp.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final azqo a(azqj azqj) {
        copyOnWrite();
        azqp azqp = (azqp) this.instance;
        if (azqj != null) {
            azqp.c = azqj;
            azqp.a |= 2;
            return this;
        }
        throw new NullPointerException();
    }

    public final azqo a(azqb azqb) {
        copyOnWrite();
        azqp azqp = (azqp) this.instance;
        if (azqb != null) {
            azqp.d = azqb;
            azqp.a |= 4;
            return this;
        }
        throw new NullPointerException();
    }

    public final azqo a(azqq azqq) {
        copyOnWrite();
        azqp azqp = (azqp) this.instance;
        azqp.a();
        azqp.e.add((azqr) ((anxl) azqq.build()));
        return this;
    }

    public final azqo a(boolean z) {
        copyOnWrite();
        azqp azqp = (azqp) this.instance;
        azqp.a |= 8;
        azqp.f = z;
        return this;
    }

    public final azqo a(long j) {
        copyOnWrite();
        azqp azqp = (azqp) this.instance;
        azqp.a |= 16;
        azqp.g = j;
        return this;
    }

    /* synthetic */ azqo(byte b) {
        super(azqp.h);
    }
}
