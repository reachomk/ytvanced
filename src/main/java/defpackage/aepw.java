package defpackage;

/* renamed from: aepw */
final /* synthetic */ class aepw implements Runnable {
    private final aepu a;
    private final aajs b;
    private final affa c;
    private final String d;
    private final aajj e;
    private final aevc f;
    private final amro g;
    private final amro h;
    private final long i;

    aepw(aepu aepu, aajs aajs, affa affa, String str, aajj aajj, aevc aevc, amro amro, amro amro2, long j) {
        this.a = aepu;
        this.b = aajs;
        this.c = affa;
        this.d = str;
        this.e = aajj;
        this.f = aevc;
        this.g = amro;
        this.h = amro2;
        this.i = j;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}
