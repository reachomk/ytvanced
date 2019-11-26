package defpackage;

/* renamed from: akxa */
final /* synthetic */ class akxa implements Runnable {
    private final akwy a;
    private final int b;

    akxa(akwy akwy, int i) {
        this.a = akwy;
        this.b = i;
    }

    public final void run() {
        akwy akwy = this.a;
        akwy.o.c(this.b);
    }
}
