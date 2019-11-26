package defpackage;

/* renamed from: acsk */
final class acsk implements Runnable {
    private final /* synthetic */ acrz a;

    acsk(acrz acrz) {
        this.a = acrz;
    }

    public final void run() {
        acrz acrz = this.a;
        abzs abzs = acrz.e;
        abyq d = acrz.d.d();
        synchronized (abzs.b) {
            abzs.b(d);
        }
    }
}
