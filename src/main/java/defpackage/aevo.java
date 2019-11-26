package defpackage;

/* renamed from: aevo */
final /* synthetic */ class aevo implements Runnable {
    private final aevp a;
    private final nni b;
    private final nni c;

    aevo(aevp aevp, nni nni, nni nni2) {
        this.a = aevp;
        this.b = nni;
        this.c = nni2;
    }

    public final void run() {
        aevp aevp = this.a;
        aevp.c.a(aevp.d, this.b, this.c);
    }
}
