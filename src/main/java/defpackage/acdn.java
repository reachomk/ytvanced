package defpackage;

/* renamed from: acdn */
final /* synthetic */ class acdn implements Runnable {
    private final acdk a;
    private final boolean b;
    private final boolean c;

    acdn(acdk acdk, boolean z, boolean z2) {
        this.a = acdk;
        this.b = z;
        this.c = z2;
    }

    public final void run() {
        acdk acdk = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        acdg acdg;
        acdg acdg2;
        if (z) {
            acdg = acdk.a;
            acdg.c.a(acdg.k);
            acdg2 = acdk.a;
            acdg2.b.a(acdg2.j);
            return;
        }
        if (z2) {
            acdg = acdk.a;
            acdg.b.a(acdg.j);
        }
        acdg2 = acdk.a;
        acdg2.c.a(acdg2.k);
    }
}
