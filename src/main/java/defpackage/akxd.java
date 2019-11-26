package defpackage;

/* renamed from: akxd */
final /* synthetic */ class akxd implements Runnable {
    private final akwy a;
    private final int b;

    akxd(akwy akwy, int i) {
        this.a = akwy;
        this.b = i;
    }

    public final void run() {
        akwy akwy = this.a;
        akwy.o.e(this.b);
    }
}
