package defpackage;

/* renamed from: utb */
public final class utb implements Runnable {
    private final /* synthetic */ ust a;
    private final /* synthetic */ utc b;

    public utb(utc utc, ust ust) {
        this.b = utc;
        this.a = ust;
    }

    public final void run() {
        this.b.b(this.a);
    }
}
