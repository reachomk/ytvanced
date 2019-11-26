package defpackage;

/* renamed from: aery */
final /* synthetic */ class aery implements Runnable {
    private final aeru a;

    aery(aeru aeru) {
        this.a = aeru;
    }

    public final void run() {
        aeru aeru = this.a;
        if (aeru.a.h != 1) {
            Runnable runnable = aeru.e;
            if (runnable != null) {
                aeru.b.removeCallbacks(runnable);
                aeru.e = null;
            }
            for (aesa aesa : aeru.c) {
                aesa.a.e();
            }
            aeru.a.e();
            aeru.d = null;
            aeru.c.clear();
        }
    }
}
