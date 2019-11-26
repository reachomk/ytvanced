package defpackage;

/* renamed from: dpj */
final class dpj implements Runnable {
    private final /* synthetic */ xci a;
    private final /* synthetic */ dos b;

    dpj(dos dos, xci xci) {
        this.b = dos;
        this.a = xci;
    }

    public final void run() {
        Object obj = (afpp) this.b.u.get();
        this.a.a(obj);
        obj.b();
    }
}
