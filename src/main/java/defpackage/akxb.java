package defpackage;

/* renamed from: akxb */
final /* synthetic */ class akxb implements Runnable {
    private final akwy a;
    private final int b;

    akxb(akwy akwy, int i) {
        this.a = akwy;
        this.b = i;
    }

    public final void run() {
        akwy akwy = this.a;
        int i = this.b;
        apn apn = akwy.o.n;
        if (apn != null) {
            ((ans) apn).a_(i, 0);
        }
    }
}
