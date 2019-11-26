package defpackage;

/* renamed from: aian */
final class aian implements Runnable {
    private final /* synthetic */ aiac a;

    public final void run() {
        aiac aiac = this.a;
        if (aiac.o && aiac.p) {
            aiac.p = false;
            aiac.a.a(false, true);
        }
        aiac.d();
    }

    /* synthetic */ aian(aiac aiac) {
        this.a = aiac;
    }
}
