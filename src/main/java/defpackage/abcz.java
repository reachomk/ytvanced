package defpackage;

/* renamed from: abcz */
public final class abcz extends aanf {
    private final aang a;
    private boolean b = false;

    public abcz(aamf aamf, aamd aamd, afpu afpu, xhf xhf, zyw zyw) {
        super(aamd, afpu, xhf);
        boolean z = false;
        this.a = a(asnf.e, aamf, abcy.a, abdb.a);
        apxn a = zyw.a();
        if (a != null) {
            auya auya = a.i;
            if (auya == null) {
                auya = auya.J;
            }
            argt argt = auya.k;
            if (argt == null) {
                argt = argt.g;
            }
            z = argt.d;
        }
        this.b = z;
    }

    public final void a(abda abda, afsw afsw) {
        this.a.a((aaml) abda, afsw);
    }

    public final abda a(afpt afpt, String str, boolean z) {
        return new abda(this.c, afpt, str, this.b, z);
    }
}
