package defpackage;

/* renamed from: afeb */
final /* synthetic */ class afeb implements Runnable {
    private final afdy a;
    private final aeuy b;
    private final afif c;
    private final Runnable d;

    afeb(afdy afdy, aeuy aeuy, afif afif, Runnable runnable) {
        this.a = afdy;
        this.b = aeuy;
        this.c = afif;
        this.d = runnable;
    }

    public final void run() {
        afdy afdy = this.a;
        aeuy aeuy = this.b;
        afif afif = this.c;
        Runnable runnable = this.d;
        if (afdy.g == null || aeuy != afdy.e) {
            aeuy.a(afif);
        } else {
            runnable.run();
        }
    }
}
