package defpackage;

/* renamed from: nff */
final class nff implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ nfe b;

    nff(nfe nfe, boolean z) {
        this.b = nfe;
        this.a = z;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
