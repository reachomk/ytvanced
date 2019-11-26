package defpackage;

/* renamed from: autg */
public final class autg extends anxo implements anzf {
    private autg() {
        super(aute.d);
    }

    public final autg a(auqx auqx) {
        copyOnWrite();
        aute aute = (aute) this.instance;
        if (auqx != null) {
            if (!aute.a.a()) {
                aute.a = anxl.mutableCopy(aute.a);
            }
            aute.a.d(auqx.d);
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ autg(byte b) {
        super(aute.d);
    }
}
