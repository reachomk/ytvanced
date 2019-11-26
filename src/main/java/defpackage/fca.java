package defpackage;

/* renamed from: fca */
final /* synthetic */ class fca implements Runnable {
    private final fcb a;

    fca(fcb fcb) {
        this.a = fcb;
    }

    public final void run() {
        fcb fcb = this.a;
        fdl fdl = fcb.b;
        if (fdl != null) {
            fcb.a(fdl);
        }
    }
}
