package defpackage;

/* renamed from: dqk */
final class dqk implements Runnable {
    private final /* synthetic */ xci a;
    private final /* synthetic */ dos b;

    dqk(dos dos, xci xci) {
        this.b = dos;
        this.a = xci;
    }

    public final void run() {
        this.a.a(this.b.v.get());
    }
}
