package defpackage;

/* renamed from: nrg */
final class nrg implements Runnable {
    private final /* synthetic */ nrd a;

    nrg(nrd nrd) {
        this.a = nrd;
    }

    public final void run() {
        nri nri = this.a.a;
        nrc nrc = nri.a;
        if (nrc != null) {
            nrc.c();
            nri.a = null;
        }
    }
}
