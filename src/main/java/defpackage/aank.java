package defpackage;

/* renamed from: aank */
final /* synthetic */ class aank implements anim {
    private final aamk a;

    aank(aamk aamk) {
        this.a = aamk;
    }

    public final anjv a(Object obj) {
        aamk aamk = this.a;
        bqh bqh = (bqh) obj;
        if (bqh != null) {
            Throwable th = bqh.c;
            if (th != null) {
                return anjf.a(th);
            }
            if (bqh.a != null) {
                aamk.n();
                return anjf.a((aoca) bqh.a);
            }
        }
        return anjf.a(new IllegalStateException("Response was null. This should not have happened."));
    }
}
