package defpackage;

/* renamed from: avzy */
public final class avzy extends anxo implements anzf {
    private avzy() {
        super(avzz.b);
    }

    public final avzy a(awab awab) {
        copyOnWrite();
        avzz avzz = (avzz) this.instance;
        if (awab != null) {
            if (!avzz.a.a()) {
                avzz.a = anxl.mutableCopy(avzz.a);
            }
            avzz.a.add(awab);
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ avzy(byte b) {
        super(avzz.b);
    }
}
