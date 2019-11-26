package defpackage;

/* renamed from: acsb */
final /* synthetic */ class acsb implements Runnable {
    private final acrz a;

    acsb(acrz acrz) {
        this.a = acrz;
    }

    public final void run() {
        acrz acrz = this.a;
        synchronized (acrz.q) {
            if (acrz.p) {
                return;
            }
            acrz.m.a(acrz.n.c);
        }
    }
}
