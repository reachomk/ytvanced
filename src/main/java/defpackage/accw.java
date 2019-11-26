package defpackage;

/* renamed from: accw */
final class accw implements Runnable {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final accz d;

    public accw(accz accz, boolean z, boolean z2, boolean z3) {
        this.d = accz;
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final void run() {
        accz accz = this.d;
        if (accz != null) {
            if (this.a) {
                accz.c();
            } else if (this.b) {
                accz.a();
            } else if (this.c) {
                accz.b();
            }
        }
    }
}
