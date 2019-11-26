package defpackage;

/* renamed from: aem */
final class aem implements Runnable {
    private final /* synthetic */ aek a;

    aem(aek aek) {
        this.a = aek;
    }

    public final void run() {
        aek aek = this.a;
        if ((aek.o & 1) != 0) {
            aek.f(0);
        }
        aek = this.a;
        if ((aek.o & 4096) != 0) {
            aek.f(108);
        }
        aek = this.a;
        aek.n = false;
        aek.o = 0;
    }
}
