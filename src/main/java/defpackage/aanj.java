package defpackage;

/* renamed from: aanj */
final /* synthetic */ class aanj implements anim {
    private final aamc a;

    aanj(aamc aamc) {
        this.a = aamc;
    }

    public final anjv a(Object obj) {
        aamc aamc = this.a;
        bqh bqh = (bqh) obj;
        if (bqh != null) {
            Throwable th = bqh.c;
            if (th != null) {
                return anjf.a(th);
            }
            if (bqh.a != null) {
                aamc.n();
                return anjf.a((anze) bqh.a);
            }
        }
        return anjf.a(new IllegalStateException("Response was null. This should not have happened."));
    }
}
