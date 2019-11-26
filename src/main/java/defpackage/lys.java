package defpackage;

/* renamed from: lys */
final class lys implements Runnable {
    private final /* synthetic */ lyl a;

    lys(lyl lyl) {
        this.a = lyl;
    }

    public final void run() {
        abol a = ((ixe) this.a.an.get()).a();
        if (a.a.d()) {
            long a2 = a.f.a();
            if (a2 >= a.h + a.a.e) {
                a.a();
                a.h = a2;
            }
        }
    }
}
