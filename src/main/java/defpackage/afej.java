package defpackage;

/* renamed from: afej */
final /* synthetic */ class afej implements Runnable {
    private final afdy a;
    private final aajj b;
    private final afif c;
    private final aajs d;

    afej(afdy afdy, aajj aajj, afif afif, aajs aajs) {
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
        afdy.a(aajj, afif, "disableLibvpx");
        affx h = afdy.h();
        affa affa = new affa(afif.b);
        String str = afdy.h;
        afkh afkh = afdy.j;
        aeuy aeuy = afdy.f;
        float f = afdy.k;
        h.a(aajs, affa, str, aajj, afkh, aeuy, f, afdy.l, true, afdy.v);
    }
}
