package defpackage;

/* renamed from: afdd */
final /* synthetic */ class afdd implements Runnable {
    private final afda a;
    private final aepc b;

    afdd(afda afda, aepc aepc) {
        this.a = afda;
        this.b = aepc;
    }

    public final void run() {
        afda afda = this.a;
        afda.c = this.b;
        afda.a();
    }
}
