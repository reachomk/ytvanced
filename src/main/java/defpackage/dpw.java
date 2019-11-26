package defpackage;

/* renamed from: dpw */
final class dpw implements Runnable {
    private final /* synthetic */ xci a;
    private final /* synthetic */ dos b;

    dpw(dos dos, xci xci) {
        this.b = dos;
        this.a = xci;
    }

    public final void run() {
        this.a.a(this.b, dos.class);
    }
}
