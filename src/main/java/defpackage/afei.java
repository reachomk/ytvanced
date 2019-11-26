package defpackage;

/* renamed from: afei */
final /* synthetic */ class afei implements Runnable {
    private final afdy a;
    private final aajj b;
    private final afif c;
    private final aajs d;

    afei(afdy afdy, aajj aajj, afif afif, aajs aajs) {
        this.a = afdy;
        this.b = aajj;
        this.c = afif;
        this.d = aajs;
    }

    public final void run() {
        afdy afdy = this.a;
        aajj aajj = this.b;
        afif afif = this.c;
        aajs aajs = this.d;
        afdy.a(aajj, afif, "livehead");
        afdy.h().a(aajs, new affa(0), afdy.h, aajj, afdy.j, afdy.f, afdy.k, afdy.l, true, afdy.v);
    }
}
