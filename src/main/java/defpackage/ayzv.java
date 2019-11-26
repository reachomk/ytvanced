package defpackage;

/* renamed from: ayzv */
public final class ayzv extends anxo implements anzf {
    private ayzv() {
        super(ayzw.e);
    }

    public final ayzv a(ayzk ayzk) {
        copyOnWrite();
        ayzw ayzw = (ayzw) this.instance;
        if (ayzk != null) {
            if (!ayzw.b.a()) {
                ayzw.b = anxl.mutableCopy(ayzw.b);
            }
            ayzw.b.add(ayzk);
            return this;
        }
        throw new NullPointerException();
    }

    public final ayzv a(ayzq ayzq) {
        copyOnWrite();
        ayzw ayzw = (ayzw) this.instance;
        if (ayzq != null) {
            if (!ayzw.c.a()) {
                ayzw.c = anxl.mutableCopy(ayzw.c);
            }
            ayzw.c.add(ayzq);
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ ayzv(byte b) {
        super(ayzw.e);
    }
}
