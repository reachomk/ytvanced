package defpackage;

/* renamed from: aelt */
public final class aelt implements aeni {
    private final aell b;
    private final zzl c;
    private final xsc d;

    public aelt(aell aell, zzl zzl, xsc xsc) {
        this.b = aell;
        this.c = zzl;
        this.d = xsc;
    }

    public final ovx a(ovx ovx) {
        awts awts;
        arvt b = this.c.b();
        if (b != null) {
            auuo auuo = b.k;
            if (auuo == null) {
                auuo = auuo.k;
            }
            awtq awtq = auuo.h;
            if (awtq == null) {
                awtq = awtq.d;
            }
            awts = awtq.c;
            if (awts == null) {
                awts = awts.g;
            }
        } else {
            awts = awts.g;
        }
        return awts.b ? new aelr(ovx, awts, this.b, this.d) : ovx;
    }
}
