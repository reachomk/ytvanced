package defpackage;

/* renamed from: afdc */
final /* synthetic */ class afdc implements Runnable {
    private final afda a;
    private final aepc b;

    afdc(afda afda, aepc aepc) {
        this.a = afda;
        this.b = aepc;
    }

    public final void run() {
        afda afda = this.a;
        afda.d = this.b;
        afcz afcz = afda.b;
        if (afcz != null) {
            afcz.a(afda.d, 1);
        }
    }
}
