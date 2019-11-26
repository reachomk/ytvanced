package defpackage;

/* renamed from: icw */
public final class icw implements aifc, ibc {
    private static final idm d;
    public final bctz a = this.e.a(new bcyp(d, icv.a)).c();
    public aibb b;
    public aiff c;
    private final bdfn e = bdfg.h().j();

    icw() {
    }

    public final void i(boolean z) {
    }

    public final void a(aiff aiff) {
        this.c = aiff;
    }

    public final void g_(boolean z) {
        a(icy.a, Boolean.valueOf(true), z);
    }

    public final void g(boolean z) {
        a(idb.a, Boolean.valueOf(false), z);
    }

    public final void a(ejd ejd) {
        a(ide.a, Boolean.valueOf(ejd.a()));
        a(idd.a, Boolean.valueOf(ejd.g()));
    }

    public final void a(aicd aicd) {
        a(idg.a, aicd);
    }

    public final void a(aich aich) {
        a(idf.a, Boolean.valueOf(aich.a == aicj.NEW));
    }

    public final void b(boolean z) {
        a(idi.a, Boolean.valueOf(z));
    }

    public final void b_(boolean z) {
        a(idh.a, Boolean.valueOf(z));
    }

    public final void h(boolean z) {
        a(idk.a, Boolean.valueOf(z));
    }

    public final void j(boolean z) {
        a(icx.a, Boolean.valueOf(z));
    }

    public final void k(boolean z) {
        a(ida.a, Boolean.valueOf(z));
    }

    public final void a(idp idp, Object obj) {
        a(idp, obj, false);
    }

    private final void a(idp idp, Object obj, boolean z) {
        this.e.e_(new iar(new idc(idp, obj), z));
    }

    static {
        iat iat = new iat();
        iat.a(false);
        iat.b(true);
        iat.c(false);
        iat.d(false);
        iat.e(false);
        iat.f(false);
        iat.g(false);
        iat.h(false);
        iat.j(false);
        iat.a(aicd.a);
        iat.i(false);
        d = idm.a(iat.a(), false);
    }
}
