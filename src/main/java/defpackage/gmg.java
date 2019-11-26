package defpackage;

/* renamed from: gmg */
final /* synthetic */ class gmg implements Runnable {
    private final gmd a;
    private final int b;

    gmg(gmd gmd, int i) {
        this.a = gmd;
        this.b = i;
    }

    public final void run() {
        gmd gmd = this.a;
        int i = this.b;
        if (i == gmd.i && i != gmd.h) {
            gmd.b();
        }
    }
}
