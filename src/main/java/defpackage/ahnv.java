package defpackage;

/* renamed from: ahnv */
final /* synthetic */ class ahnv implements Runnable {
    private final ahnq a;

    ahnv(ahnq ahnq) {
        this.a = ahnq;
    }

    public final void run() {
        ahnq ahnq = this.a;
        if (ahnq.k != null) {
            if (ahnq.t) {
                ahnq.b();
            }
            ahrt ahrt = ahnq.m;
            if (ahrt != null) {
                ahrt.a(ahnq.t);
            }
            ahry ahry = ahnq.k;
            boolean z = ahnq.t;
            ahqp ahqp = ahry.b;
            if (ahqp.i != z) {
                ahqp.i = z;
                if (ahqp.d == aaju.RECTANGULAR_3D || ahqp.d == aaju.RECTANGULAR_2D) {
                    ahqp.c();
                }
                ahqp.d();
            }
            ahry.m = true;
        }
        ahni ahni = ahnq.i;
        if (ahni != null) {
            ahni.a(ahnq.t);
        }
    }
}
