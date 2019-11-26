package defpackage;

/* renamed from: aept */
final /* synthetic */ class aept implements Runnable {
    private final aepu a;
    private final aajs b;
    private final affa c;
    private final String d;
    private final aajj e;
    private final afjt f;
    private final aevc g;
    private final float h;
    private final float i;
    private final boolean j;
    private final int k;

    aept(aepu aepu, aajs aajs, affa affa, String str, aajj aajj, afjt afjt, aevc aevc, float f, float f2, boolean z, int i) {
        this.a = aepu;
        this.b = aajs;
        this.c = affa;
        this.d = str;
        this.e = aajj;
        this.f = afjt;
        this.g = aevc;
        this.h = f;
        this.i = f2;
        this.j = z;
        this.k = i;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }
}
