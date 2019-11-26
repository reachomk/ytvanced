package defpackage;

/* renamed from: nfk */
final class nfk implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ nfe b;

    nfk(nfe nfe, int i) {
        this.b = nfe;
        this.a = i;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
