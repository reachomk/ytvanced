package defpackage;

/* renamed from: ahnu */
final /* synthetic */ class ahnu implements Runnable {
    private final ahnq a;
    private final ahsq b;

    ahnu(ahnq ahnq, ahsq ahsq) {
        this.a = ahnq;
        this.b = ahsq;
    }

    public final void run() {
        ahnq ahnq = this.a;
        ahsq ahsq = this.b;
        ahry ahry = ahnq.k;
        if (ahry != null) {
            try {
                amqw.a((Object) ahsq);
                ahry.b.a(ahsq);
                ahwk ahwk = ahry.a;
                ahsq ahsq2 = ahwk.a;
                ahwk.a = ahsq;
                if (ahsq2.a() != ahsq.a()) {
                    ahwk.b();
                    ahwk.a();
                }
            } catch (ahsj e) {
                ahnq.b(e);
            }
        }
    }
}
