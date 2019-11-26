package defpackage;

/* renamed from: msv */
public final /* synthetic */ class msv implements Runnable {
    private final msw a;
    private final ngn[] b;

    public msv(msw msw, ngn[] ngnArr) {
        this.a = msw;
        this.b = ngnArr;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
