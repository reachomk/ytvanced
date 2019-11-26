package defpackage;

/* renamed from: amgp */
final /* synthetic */ class amgp implements anij {
    private final amgn a;
    private final String b;
    private final alyz c;

    amgp(amgn amgn, String str, alyz alyz) {
        this.a = amgn;
        this.b = str;
        this.c = alyz;
    }

    public final anjv a() {
        amgn amgn = this.a;
        amea a = amgn.a(this.b, this.c, false);
        abjv a2 = amgn.a.a(a.c);
        a2.g();
        a2.a = a.G;
        if (amgn.a.a(a2).c) {
            return anjf.a(amgn.a(amjq.a(), false));
        }
        throw new aanq("Video deletion failed");
    }
}
