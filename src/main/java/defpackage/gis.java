package defpackage;

import java.util.List;

/* renamed from: gis */
final /* synthetic */ class gis implements Runnable {
    private final giq a;
    private final List b;
    private final gil c;
    private final ayki d;
    private final gig e;

    gis(giq giq, List list, gil gil, ayki ayki, gig gig) {
        this.a = giq;
        this.b = list;
        this.c = gil;
        this.d = ayki;
        this.e = gig;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d, this.e);
    }
}
