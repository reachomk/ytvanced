package defpackage;

/* renamed from: aqjn */
public final class aqjn extends anxo implements anzf {
    private aqjn() {
        super(aqjo.f);
    }

    public final aqjn a(aqjs aqjs) {
        copyOnWrite();
        aqjo aqjo = (aqjo) this.instance;
        if (aqjs != null) {
            if (!aqjo.c.a()) {
                aqjo.c = anxl.mutableCopy(aqjo.c);
            }
            aqjo.c.add(aqjs);
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ aqjn(byte b) {
        super(aqjo.f);
    }
}
