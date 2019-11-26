package defpackage;

/* renamed from: msy */
public final /* synthetic */ class msy implements Runnable {
    private final msw a;
    private final ngn b;

    public msy(msw msw, ngn ngn) {
        this.a = msw;
        this.b = ngn;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
