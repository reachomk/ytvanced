package defpackage;

/* renamed from: dga */
final class dga implements Runnable {
    private final /* synthetic */ dfy a;
    private final /* synthetic */ dgb b;

    dga(dgb dgb, dfy dfy) {
        this.b = dgb;
        this.a = dfy;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
